package com.herocheer.face.vo;

import java.io.Serializable;

/**
 * @author chenwf
 * @date 2020/6/15
 */
public class FaceRequestInfo implements Serializable {
    private String appId;
    private String idCard;
    private String picData; //base64
    private String picUrl; //照片地址
    private String userName;
    private String sign;
    private String authenMode; //认证模式 1:0X10 2:0X32 3:0X42 4:0X40

//    private String validityStartDate;
//    private String validityEndDate;
//    private String cardImg;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPicData() {
        return picData;
    }

    public void setPicData(String picData) {
        this.picData = picData;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAuthenMode() {
        return authenMode;
    }

    public void setAuthenMode(String authenMode) {
        this.authenMode = authenMode;
    }
}
