package com.herocheer.face.entity;

import lombok.Data;

/**
 * @author chenwf
 * @desc
 * @date 2021/3/16
 * @company 厦门熙重电子科技有限公司
 */
@Data
public class AppAccountInfo {
    private Long id;

    private String appId;

    private String secret;

    private Integer state;

    private Long lastAccess;

    private Long createdId;

    private String createdBy;

    private Long createdTime;

    private Long updateId;

    private String updateBy;

    private Long updateTime;
}