package com.herocheer.face.entity;

import lombok.Data;

/**
 * @author chenwf
 * @desc
 * @date 2021/3/16
 * @company 厦门熙重电子科技有限公司
 */
@Data
public class AppInvokeLog {
    private Long id;

    private Long appAcctId;

    private Long interfaceAcctId;

    private String msg;

    private String reqInfo;

    private Long lastAccess;

    private Long createdId;

    private String createdBy;

    private Long createdTime;

    private Long updateId;

    private String updateBy;

    private Long updateTime;
}