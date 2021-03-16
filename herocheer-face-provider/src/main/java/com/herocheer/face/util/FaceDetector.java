package com.herocheer.face.util;

import cn.hutool.core.util.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rmi.DetectServer;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 闸机摄像头人脸检测工具类
 * @author linj
 */
public class FaceDetector {
    private static final Logger logger = LoggerFactory.getLogger(FaceDetector.class);

    private Lock[] locks;
    private String ip;
    private int port;

    public FaceDetector(String ip, int port) {
        this.ip = ip;
        this.port = port;
        locks = new ReentrantLock[3];
        locks[0] = new ReentrantLock();
        locks[1] = new ReentrantLock();
        locks[2] = new ReentrantLock();
    }

    public int detectFace(File file){
        if(file == null || StrUtil.isEmpty(ip)){
            logger.info("人脸检测失败，图片或ip为空。");
            return -7;
        }

        Lock lock = getLock();
        lock.lock();
        try {
            Registry registry = LocateRegistry.getRegistry(ip, port, new RMIClientSocketFactory() {
                @Override
                public Socket createSocket(String host, int port) throws IOException {
                    logger.info("开始连接人脸检测服务器：{}-{}", host, port);
                    Socket socket = new Socket();
                    socket.connect(new InetSocketAddress(host, port), 60000);
                    logger.info("socket连接成功！");
                    return socket;
                }
            });
            logger.info("开始查找rmi服务...");
            DetectServer detectServer = (DetectServer) registry.lookup("detect_server");
            logger.info("查找rmi服务成功！");
            return detectServer.checkFace(Files.readAllBytes(file.toPath()));
        } catch (Exception e) {
            logger.info("人脸检测失败:{}", e.getMessage());
            return -7;
        } finally {
            lock.unlock();
        }
    }

    public static String getDescription(int state){
        switch (state){
            case 0: return "照片合格";
            case -1: return "人脸光线不均匀";
            case -2: return "人脸没有居中";
            case -3: return "当前分辨率无法识别";
            case -4: return "人脸角度偏差太大";
            case -5: return "人脸数量太多或为零";
            case -6: return "图像质量太差";
            default: return "照片不合格";
        }
    }

    private Lock getLock(){
        int index = new Random().nextInt(3);
        return locks[index];
    }
}
