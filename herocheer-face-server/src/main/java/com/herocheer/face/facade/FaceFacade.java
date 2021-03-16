package com.herocheer.face.facade;

import cn.hutool.core.io.IoUtil;
import com.alibaba.fastjson.JSONObject;
import com.herocheer.face.service.FaceService;
import com.herocheer.face.util.CommonException;
import com.herocheer.face.util.FileUtils;
import com.herocheer.face.util.Result;
import com.herocheer.face.vo.FaceRequestInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
@RequestMapping("/face/")
@Slf4j
public class FaceFacade {
    @DubboReference
    private FaceService faceService;

    @PostMapping
    public Result checkIdentityAuth(@RequestBody JSONObject json){
        JSONObject resultJson = new JSONObject();
        try {
//            String body = IoUtil.read(request.getInputStream(), "utf-8");
            FaceRequestInfo faceRequestInfo = JSONObject.parseObject(JSONObject.toJSONString(json),FaceRequestInfo.class);
            resultJson = faceService.checkIdentityAuth(faceRequestInfo);
        } catch (CommonException e1){
            resultJson.put("code", e1.getErrorCode());
            resultJson.put("msg",e1.getMessage());
            return Result.success(resultJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.success(resultJson);
    }

    @PostMapping("checkFaceQuality")
    public Result checkFaceQuality(HttpServletRequest request){
        JSONObject resultJson = new JSONObject();
        File file = null;
        try {
            String body = IoUtil.read(request.getInputStream(), "utf-8");
            JSONObject jsonObject = JSONObject.parseObject(body);
            file = FileUtils.base64ToFile(jsonObject.getString("picData"));
            resultJson = faceService.checkFaceQuality(file);
        } catch (CommonException e1){
            resultJson.put("code", e1.getErrorCode());
            resultJson.put("msg",e1.getMessage());
            return Result.success(resultJson);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(file != null){
                file.delete();
            }
        }
        return Result.success(resultJson);
    }
}
