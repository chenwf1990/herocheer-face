package com.herocheer.face.dao;

import com.herocheer.face.entity.InterfaceAccountInfo;
import com.herocheer.face.entity.InterfaceAccountInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterfaceAccountInfoMapper {
    long countByExample(InterfaceAccountInfoExample example);

    int deleteByExample(InterfaceAccountInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterfaceAccountInfo record);

    int insertSelective(InterfaceAccountInfo record);

    List<InterfaceAccountInfo> selectByExample(InterfaceAccountInfoExample example);

    InterfaceAccountInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterfaceAccountInfo record, @Param("example") InterfaceAccountInfoExample example);

    int updateByExample(@Param("record") InterfaceAccountInfo record, @Param("example") InterfaceAccountInfoExample example);

    int updateByPrimaryKeySelective(InterfaceAccountInfo record);

    int updateByPrimaryKey(InterfaceAccountInfo record);
}