package com.herocheer.face.dao;

import com.herocheer.face.entity.AppInvokeLog;
import com.herocheer.face.entity.AppInvokeLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppInvokeLogMapper {
    long countByExample(AppInvokeLogExample example);

    int deleteByExample(AppInvokeLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppInvokeLog record);

    int insertSelective(AppInvokeLog record);

    List<AppInvokeLog> selectByExample(AppInvokeLogExample example);

    AppInvokeLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppInvokeLog record, @Param("example") AppInvokeLogExample example);

    int updateByExample(@Param("record") AppInvokeLog record, @Param("example") AppInvokeLogExample example);

    int updateByPrimaryKeySelective(AppInvokeLog record);

    int updateByPrimaryKey(AppInvokeLog record);
}