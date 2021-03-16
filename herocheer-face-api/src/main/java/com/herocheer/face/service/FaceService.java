package com.herocheer.face.service;

import com.alibaba.fastjson.JSONObject;
import com.herocheer.face.vo.AppInterfaceVo;
import com.herocheer.face.vo.FaceRequestInfo;

import java.io.File;
import java.util.Map;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public interface FaceService {
    /**
     * 人脸识别：与身份证识别
     * @param reqMap
     * userName 身份证姓名
     * idCard 身份证号码
     * validityStartDate 身份证有效开始时间 yyyyMMdd
     * validityEndDate 身份证有效结束时间 yyyyMMdd
     * picData 人脸照片url;
     * cardImg 身份证照片url;
     * authenMode 验证模式 ;
     * authenMode 验证模式 ;
     * authenMode 验证模式 ;
     * @return
     */
    JSONObject checkIdentityAuth(FaceRequestInfo faceRequestInfo);

    /**
     * 图片质量校验
     * @param file
     * @return
     */
    JSONObject checkFaceQuality(File file);

    AppInterfaceVo checkRequestInfo(Map<String, Object> dataMap);
}
