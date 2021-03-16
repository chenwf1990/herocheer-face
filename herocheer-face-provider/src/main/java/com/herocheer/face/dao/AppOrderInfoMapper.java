package com.herocheer.face.dao;

import com.herocheer.face.entity.AppOrderInfo;
import com.herocheer.face.entity.AppOrderInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppOrderInfoMapper {
    long countByExample(AppOrderInfoExample example);

    int deleteByExample(AppOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppOrderInfo record);

    int insertSelective(AppOrderInfo record);

    List<AppOrderInfo> selectByExample(AppOrderInfoExample example);

    AppOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppOrderInfo record, @Param("example") AppOrderInfoExample example);

    int updateByExample(@Param("record") AppOrderInfo record, @Param("example") AppOrderInfoExample example);

    int updateByPrimaryKeySelective(AppOrderInfo record);

    int updateByPrimaryKey(AppOrderInfo record);

    /**
     * 根据appId查询应用开通的资费
     * @param appAcctId
     * @return
     */
    List<AppOrderInfo> getAppOrderInfo(@Param("appAcctId") Long appAcctId);

    /**
     * 更新使用次数
     * @param orderId
     * @return
     */
    int updateOrderUseNum(@Param("orderId") Long orderId);
}