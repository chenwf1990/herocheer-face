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
public class AppExpenses {
    private Long id;

    private Integer type;

    private Integer num;

    private BigDecimal money;

    private Integer state;

    private Long lastAccess;

    private Long createdId;

    private String createdBy;

    private Long createdTime;

    private Long updateId;

    private String updateBy;

    private Long updateTime;
}