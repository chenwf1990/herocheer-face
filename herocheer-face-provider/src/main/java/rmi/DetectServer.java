package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 闸机摄像头检测人脸图片接口（包名不能换！）
 */
public interface DetectServer extends Remote {

    int checkFace(byte[] img) throws RemoteException;
}
