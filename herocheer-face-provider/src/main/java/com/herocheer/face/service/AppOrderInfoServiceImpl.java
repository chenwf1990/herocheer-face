package com.herocheer.face.service;

import com.herocheer.face.dao.AppOrderInfoMapper;
import com.herocheer.face.entity.AppOrderInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author chenwf
 * @date 2020/6/11
 */
@DubboService
public class AppOrderInfoServiceImpl implements AppOrderInfoService {
    private static Logger logger = LoggerFactory.getLogger(AppOrderInfoService.class);    //日志记录
    @Autowired
    private AppOrderInfoMapper appOrderInfoMapper;

    /**
     * 根据appId查询应用开通的资费
     *
     * @param appAcctId
     * @return
     */
    @Override
    public List<AppOrderInfo> getAppOrderInfo(Long appAcctId) {
        return appOrderInfoMapper.getAppOrderInfo(appAcctId);
    }

    /**
     * 更新订单使用次数
     *
     * @param orderId
     */
    @Override
    public void updateOrderUseNum(Long orderId) {
        if(orderId == null){
            return;
        }
        int count = appOrderInfoMapper.updateOrderUseNum(orderId);
        if(count <= 0){
            logger.error("更新订单【"+orderId+"】失败");
        }
    }
}
