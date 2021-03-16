package com.herocheer.face.util;

import cn.hutool.core.util.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 人脸检测服务集群路由
 */
public class FaceDetectRouter {
    private static final Logger logger = LoggerFactory.getLogger(FaceDetectRouter.class);
    private static FaceDetectRouter router = new FaceDetectRouter();

    private List<FaceDetector> detectors;
    private int lastDetectorIndex = 0;

    private FaceDetectRouter() {
    }

    public static FaceDetectRouter getInstance(String cluster){
        if(StrUtil.isEmpty(cluster)){
            logger.warn("获取人脸检测路由器失败。");
            return router;
        }

        List<FaceDetector> detectors = router.getDetectors();
        if(detectors == null || detectors.isEmpty()){
            synchronized (router){
                String[] ipPorts = cluster.split(";");
                detectors = new ArrayList<>();
                for(int i = 0; i < ipPorts.length; i++){
                    String ipPort = ipPorts[i];
                    if(StrUtil.isEmpty(ipPort)){
                        continue;
                    }
                    String[] arr = ipPort.split(":");
                    if(arr.length >= 2){
                        FaceDetector device = new FaceDetector(arr[0], Integer.parseInt(arr[1]));
                        detectors.add(device);
                    }
                }
                router.setDetectors(detectors);
            }
        }
        return router;
    }

    public int detectFace(File file){
        if(detectors == null || detectors.size() <= 0){
            logger.warn("人脸检测失败：集群不存在，请检查配置。");
            return -7;
        }

        //轮询策略获取人脸检测服务
        int index = Math.abs(lastDetectorIndex ++ % detectors.size());
        return detectors.get(index).detectFace(file);
    }

    public List<FaceDetector> getDetectors() {
        return detectors;
    }

    public void setDetectors(List<FaceDetector> detectors) {
        this.detectors = detectors;
    }
}
