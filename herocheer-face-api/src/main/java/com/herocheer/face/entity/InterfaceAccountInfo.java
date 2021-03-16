package com.herocheer.face.entity;

import lombok.Data;

/**
 * @author chenwf
 * @desc
 * @date 2021/3/16
 * @company 厦门熙重电子科技有限公司
 */
@Data
public class InterfaceAccountInfo {
    private Long id;

    private String userKey;

    private String userAuth;

    private Integer dayMaxCount;

    private Integer monthMaxCount;

    private Integer state;

    private Long lastAccess;

    private Long createdId;

    private String createdBy;

    private Long createdTime;

    private Long updateId;

    private String updateBy;

    private Long updateTime;
}