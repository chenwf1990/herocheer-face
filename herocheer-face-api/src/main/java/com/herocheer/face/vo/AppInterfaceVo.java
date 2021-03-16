package com.herocheer.face.vo;

import java.io.Serializable;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public class AppInterfaceVo implements Serializable {
    private Long appAcctId;
    private Long interfaceAcctId;
    private String userKey;
    private String userAuth;
    private Integer dayMaxCount;
    private Integer monthMaxCount;
    private String reqInfo;
    private Long orderId;

    public Long getAppAcctId() {
        return appAcctId;
    }

    public void setAppAcctId(Long appAcctId) {
        this.appAcctId = appAcctId;
    }

    public Long getInterfaceAcctId() {
        return interfaceAcctId;
    }

    public void setInterfaceAcctId(Long interfaceAcctId) {
        this.interfaceAcctId = interfaceAcctId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public Integer getDayMaxCount() {
        return dayMaxCount;
    }

    public void setDayMaxCount(Integer dayMaxCount) {
        this.dayMaxCount = dayMaxCount;
    }

    public Integer getMonthMaxCount() {
        return monthMaxCount;
    }

    public void setMonthMaxCount(Integer monthMaxCount) {
        this.monthMaxCount = monthMaxCount;
    }

    public String getReqInfo() {
        return reqInfo;
    }

    public void setReqInfo(String reqInfo) {
        this.reqInfo = reqInfo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
