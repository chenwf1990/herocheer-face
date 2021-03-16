package com.herocheer.face.dao;

import com.herocheer.face.entity.AppInterfaceInfo;
import com.herocheer.face.entity.AppInterfaceInfoExample;
import com.herocheer.face.vo.AppInterfaceVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppInterfaceInfoMapper {
    long countByExample(AppInterfaceInfoExample example);

    int deleteByExample(AppInterfaceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppInterfaceInfo record);

    int insertSelective(AppInterfaceInfo record);

    List<AppInterfaceInfo> selectByExample(AppInterfaceInfoExample example);

    AppInterfaceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppInterfaceInfo record, @Param("example") AppInterfaceInfoExample example);

    int updateByExample(@Param("record") AppInterfaceInfo record, @Param("example") AppInterfaceInfoExample example);

    int updateByPrimaryKeySelective(AppInterfaceInfo record);

    int updateByPrimaryKey(AppInterfaceInfo record);

    /**
     * 根据appKey获取应用可用渠道信息
     * @param appAccId
     * @return
     */
    List<AppInterfaceVo> getAppInterfaceInfo(Long appAccId);
}