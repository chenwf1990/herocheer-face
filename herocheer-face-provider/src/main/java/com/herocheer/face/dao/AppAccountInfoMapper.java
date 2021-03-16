package com.herocheer.face.dao;

import com.herocheer.face.entity.AppAccountInfo;
import com.herocheer.face.entity.AppAccountInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppAccountInfoMapper {
    long countByExample(AppAccountInfoExample example);

    int deleteByExample(AppAccountInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppAccountInfo record);

    int insertSelective(AppAccountInfo record);

    List<AppAccountInfo> selectByExample(AppAccountInfoExample example);

    AppAccountInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppAccountInfo record, @Param("example") AppAccountInfoExample example);

    int updateByExample(@Param("record") AppAccountInfo record, @Param("example") AppAccountInfoExample example);

    int updateByPrimaryKeySelective(AppAccountInfo record);

    int updateByPrimaryKey(AppAccountInfo record);
}