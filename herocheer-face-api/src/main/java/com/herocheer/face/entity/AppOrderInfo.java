package com.herocheer.face.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class AppOrderInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long appAcctId;

    private Long appExpensesId;

    private String orderNo;

    private Integer payType;

    private String payNo;

    private BigDecimal payAmount;

    private Integer type;

    private Long expireBeginTime;

    private Long expireEndTime;

    private Integer num;

    private Integer useNum;

    private Integer status;

    private Long lastAccess;

    private Long creatorId;

    private String createdBy;

    private Long createdTime;

    private Long updaterId;

    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppAcctId() {
        return appAcctId;
    }

    public void setAppAcctId(Long appAcctId) {
        this.appAcctId = appAcctId;
    }

    public Long getAppExpensesId() {
        return appExpensesId;
    }

    public void setAppExpensesId(Long appExpensesId) {
        this.appExpensesId = appExpensesId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getExpireBeginTime() {
        return expireBeginTime;
    }

    public void setExpireBeginTime(Long expireBeginTime) {
        this.expireBeginTime = expireBeginTime;
    }

    public Long getExpireEndTime() {
        return expireEndTime;
    }

    public void setExpireEndTime(Long expireEndTime) {
        this.expireEndTime = expireEndTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Long lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}