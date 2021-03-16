package com.herocheer.face.service;

import com.herocheer.face.entity.AppOrderInfo;

import java.util.List;

/**
 * @author chenwf
 * @date 2020/6/11
 */
public interface AppOrderInfoService {
    /**
     * 根据appId查询应用开通的资费
     * @param appAcctId
     * @return
     */
    List<AppOrderInfo> getAppOrderInfo(Long appAcctId);

    /**
     * 更新订单使用次数
     * @param orderId
     */
    void updateOrderUseNum(Long orderId);
}
