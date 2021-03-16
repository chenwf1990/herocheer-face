package com.herocheer.face.service;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.herocheer.cache.bean.RedisClient;
import com.herocheer.face.entity.AppAccountInfo;
import com.herocheer.face.entity.AppOrderInfo;
import com.herocheer.face.util.*;
import com.herocheer.face.util.Enums.FaceEnum;
import com.herocheer.face.vo.AppInterfaceVo;
import com.herocheer.face.vo.FaceRequestInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenwf
 * @date 2020/6/11
 */
@DubboService
public class FaceServiceImpl implements FaceService {
    private static Logger logger = LoggerFactory.getLogger(FaceServiceImpl.class);    //日志记录

    @Autowired
    private AppAccountInfoService appAccountInfoService;
    @Autowired
    private AppInterfaceInfoService appInterfaceInfoService;
    @Autowired
    private AppOrderInfoService appOrderInfoService;
    @Autowired
    private RedisClient redisClient;

    /**
     * 人脸识别：与身份证识别
     *
     * @param faceRequestInfo
     * @return
     */
    @Override
    public JSONObject checkIdentityAuth(FaceRequestInfo faceRequestInfo) {
        //校验必填选项
        this.checkAuthRequired(faceRequestInfo);
        String secret = AESUtil.decryptKey;
        //校验应用信息是否符合平台规则
        Map<String,Object> reqMap = JSONObject.parseObject(JSONObject.toJSONString(faceRequestInfo));
        AppInterfaceVo appInterfaceVo = this.checkRequestInfo(reqMap);//校验账户信息
        faceRequestInfo.setIdCard(AESUtil.aesDecrypt(faceRequestInfo.getIdCard(),secret));
        faceRequestInfo.setUserName(AESUtil.aesDecrypt(faceRequestInfo.getUserName(),secret));
        //组装三方api参数
        DES3 d = new DES3();
        Map<String,Object> map = new HashMap<>();
        File file = null;
        String userAuth = appInterfaceVo.getUserAuth();
        String appKey = appInterfaceVo.getUserKey();
        map.put("userAuth",userAuth);
        map.put("userName",d.getEncString(faceRequestInfo.getUserName(), appKey));//真是身份证
        map.put("idCard", d.getEncString(faceRequestInfo.getIdCard(), appKey));
        map.put("authenMode",d.getEncString(faceRequestInfo.getAuthenMode(),appKey));
        if(faceRequestInfo.getAuthenMode().equals("0X42")) {
            try {
                file = FileUtils.base64ToFile(faceRequestInfo.getPicData());
                map.put("picData", d.getEncString(ImageUtils.encodeImgageToBase64(file), appKey));
            } catch (Exception e1) {
                throw new CommonException(MessageCodeLocale.SYATEM_ERROR, "系统异常");
            } finally {
                if (file != null) {
                    file.delete();//删除图片
                }
            }
        }
        JSONObject jsonObject = HttpClients.httpCommunication("http://43.243.130.252:7576/sfrzfw/authentication/auth", map);
        boolean res = jsonObject != null ? (Boolean)jsonObject.get("success") : false;
        if(res){
            String obj = jsonObject.get("obj").toString();
            if(faceRequestInfo.getAuthenMode().equals("0X40")){
                if(obj.startsWith("0")){
                    jsonObject = updateUserNum(jsonObject,faceRequestInfo,appInterfaceVo);
                }else{
                    jsonObject.put("code","999");
                    jsonObject.put("msg", FaceEnum.getMsg(obj.substring(0,1)));
                }
            }else {
                if(obj.startsWith("00")){
                    jsonObject = updateUserNum(jsonObject,faceRequestInfo,appInterfaceVo);
                }else{
                    StringBuilder tmp=new StringBuilder(2);
                    if(!obj.startsWith("0")){
                        tmp.append("1").append(obj.substring(0,1));
                    }else{
                        tmp.append("2").append(obj.substring(1,2));
                    }
                    jsonObject.put("code","999");
                    jsonObject.put("msg", FaceEnum.getMsg(tmp.toString()));
                }
            }
        }else{
            jsonObject.put("code","998");
            jsonObject.put("msg","实名认证失败");
        }
        return jsonObject;
    }

    private JSONObject updateUserNum(JSONObject jsonObject, FaceRequestInfo faceRequestInfo, AppInterfaceVo appInterfaceVo) {
        appInterfaceVo.setReqInfo(JSONObject.toJSONString(faceRequestInfo));
//        rabbitTemplate.convertAndSend(RabbbitKey.EXCHANGE, RabbbitKey.RUTE_KEY, JSONObject.toJSONString(appInterfaceVo));
        addRedis(appInterfaceVo.getInterfaceAcctId());
        //更新订单使用次数
        appOrderInfoService.updateOrderUseNum(appInterfaceVo.getOrderId());
        jsonObject.put("code","0");
        jsonObject.put("msg","ok");
        return jsonObject;
    }

    private void addRedis(Long interfaceAcctId) {
        String key1 = RedisKeyConstants.KEY_DAY_MAX_INTERFACE_COUNT + interfaceAcctId;
        String key2 = RedisKeyConstants.KEY_MONTH_MAX_INTERFACE_COUNT + interfaceAcctId;
        Integer dayMaxCount = redisClient.hasKey(key1) ?  Integer.parseInt(redisClient.get(key1)) : 0;
        Integer monthMaxCount = redisClient.hasKey(key2) ? Integer.parseInt(redisClient.get(key2)) : 0;
        redisClient.set(key1,(dayMaxCount + 1) + "", DateUtils.caluRedisExpiredTime());
        redisClient.set(key2,(monthMaxCount + 1) + "", DateUtils.caluRedisExpiredTime(new Date(),DateUtils.getMonthEnd(new Date())));
    }

    //检查必填项
    private void checkAuthRequired(FaceRequestInfo model) {
        if(StrUtil.isEmpty(model.getAppId())){
            throw new CommonException(MessageCodeLocale.REQUIRED_NULL, "appId is not null");
        }
        if(StrUtil.isEmpty(model.getSign())){
            throw new CommonException(MessageCodeLocale.REQUIRED_NULL, "sign is not null");
        }
        if(StrUtil.isEmpty(model.getIdCard())){
            throw new CommonException(MessageCodeLocale.REQUIRED_NULL, "idCard is not null");
        }
        if(model.getAuthenMode().equals("0X42") && StrUtil.isEmpty(model.getPicData())) {
            throw new CommonException(MessageCodeLocale.REQUIRED_NULL, "picData is not null");
        }
    }

    @Override
    public JSONObject checkFaceQuality(File file) {
        JSONObject result = new JSONObject();
        String cluster = "110.80.140.198:15814;110.80.140.198:15824;110.80.140.198:15834";//ip + ":" + port 多个 ;隔开
        int state = 0;
        try {
            FaceDetectRouter faceDetectRouter  = FaceDetectRouter.getInstance(cluster);
            state = faceDetectRouter.detectFace(file);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        String msg = FaceDetector.getDescription(state);
        result.put("code",state);
        result.put("msg",msg);
        return result;
    }

    /**
     * 校验请求信息
     * @param dataMap
     */
    @Override
    public AppInterfaceVo checkRequestInfo(Map<String,Object> dataMap){
        String sign = dataMap.get("sign").toString();
        //根据appId查找应用信息
        AppAccountInfo appAccountInfo = appAccountInfoService.findByAppId(dataMap.get("appId").toString());
        if(appAccountInfo == null){
            logger.debug("invalid appId");
            throw new CommonException(MessageCodeLocale.INVALID_APPID, "invalid appId");
        }
        //校验签名
        String newSign = SignUtils.MD5Encrypt(dataMap,appAccountInfo.getSecret());
        if (!sign.equals(newSign.toUpperCase())){
            throw new CommonException(MessageCodeLocale.SIGN_FAIL, "签名错误");
        }
        //根据appId查询是否开通接口资费
        List<AppOrderInfo> appOrderInfos = appOrderInfoService.getAppOrderInfo(appAccountInfo.getId());
        if(appOrderInfos.isEmpty()){
            logger.debug("Unopened interface");
            throw new CommonException(MessageCodeLocale.UN_OPEN_INTERFACE, "Unopened interface");
        }

        //根据appId查找接口账户信息
        List<AppInterfaceVo> interFaceInfo = appInterfaceInfoService.getAppInterfaceInfo(appAccountInfo.getId());
        if(interFaceInfo.isEmpty()){
            logger.debug("Unopened interface");
            throw new CommonException(MessageCodeLocale.UN_OPEN_INTERFACE, "Unopened interface");
        }
        AppInterfaceVo av = null;
        for (AppInterfaceVo vo : interFaceInfo) {
            String key1 = RedisKeyConstants.KEY_DAY_MAX_INTERFACE_COUNT + vo.getInterfaceAcctId();
            String key2 = RedisKeyConstants.KEY_MONTH_MAX_INTERFACE_COUNT + vo.getInterfaceAcctId();
            Integer dayMaxCount = redisClient.hasKey(key1) ? Integer.parseInt(redisClient.get(key1)) : 0;
            Integer monthMaxCount = redisClient.hasKey(key2) ? Integer.parseInt(redisClient.get(key2)) : 0;
            //接口当日可用次数 & 当月可用次数
            if(vo.getDayMaxCount() > dayMaxCount && vo.getMonthMaxCount() > monthMaxCount){
                av = vo;
                break;
            }
        }
        if(av == null){
            logger.debug("Interface times are used up");
            throw new CommonException(MessageCodeLocale.UN_OPEN_INTERFACE, "Interface times are used up");
        }
        if(appOrderInfos.get(0).getType() == 1) {//类型是次数的，有次数限制
            av.setOrderId(appOrderInfos.get(0).getId());
        }
        return av;
    }

    public static void main(String[] args) {
        //组装三方api参数
        DES3 d = new DES3();
        Map<String,Object> map = new HashMap<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("陈伟峰","350521199007031038");
//        File file = null;
        String userAuth = "f296b9203d0840ae9a7e75fe5ce77b3e";
        String appKey = "350dd6f586f544e9a4a94ca7491e320c";
        for(Map.Entry<String, String> entry : map1.entrySet()){
            map.put("userAuth",userAuth);
            map.put("userName",d.getEncString(entry.getKey(), appKey));//真是身份证
            map.put("idCard",d.getEncString(entry.getValue(), appKey));//真是身份证
            map.put("authenMode",d.getEncString("0X42",appKey));
        try {
            map.put("picData", d.getEncString(ImageUtils.encodeImgageToBase64(new File("D:\\chenwf\\xz\\xz2\\2.jpg")), appKey));
        }catch (Exception e1){
            throw new CommonException(MessageCodeLocale.SYATEM_ERROR,"系统异常");
        }finally {

        }
            JSONObject jsonObject = HttpClients.httpCommunication("http://43.243.130.252:7576/sfrzfw/authentication/auth", map);
            System.out.println(entry.getKey()+"============="+jsonObject.toJSONString());
        }


//        String cluster = "110.80.140.198:15814;110.80.140.198:15815;110.80.140.198:15824;110.80.140.198:15825;110.80.140.198:15834;110.80.140.198:15835";//ip + ":" + port 多个 ;隔开
//        String cluster = "110.80.140.198:15814";//ip + ":" + port 多个 ;隔开
//        int state = 0;
//        try {
//            FaceDetectRouter faceDetectRouter  = FaceDetectRouter.getInstance(cluster);
//            state = faceDetectRouter.detectFace(new File("C:\\Users\\Administrator\\Desktop\\chenwf\\667.jpg"));
//            String msg = FaceDetector.getDescription(state);
//            System.out.println(msg);
//        }catch (Exception e){
//            logger.error(e.getMessage());
//        }
    }



}
