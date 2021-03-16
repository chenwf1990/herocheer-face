package com.herocheer.face.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author chenwf
 * @desc
 * @date 2021/3/16
 * @company 厦门熙重电子科技有限公司
 */
@Data
public class AppOrderInfo {
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

    private Long createdId;

    private String createdBy;

    private Long createdTime;

    private Long updateId;

    private String updateBy;

    private Long updateTime;
}