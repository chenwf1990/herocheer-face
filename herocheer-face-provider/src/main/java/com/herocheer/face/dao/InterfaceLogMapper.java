package com.herocheer.face.dao;

import com.herocheer.face.entity.InterfaceLog;
import com.herocheer.face.entity.InterfaceLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterfaceLogMapper {
    long countByExample(InterfaceLogExample example);

    int deleteByExample(InterfaceLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterfaceLog record);

    int insertSelective(InterfaceLog record);

    List<InterfaceLog> selectByExample(InterfaceLogExample example);

    InterfaceLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterfaceLog record, @Param("example") InterfaceLogExample example);

    int updateByExample(@Param("record") InterfaceLog record, @Param("example") InterfaceLogExample example);

    int updateByPrimaryKeySelective(InterfaceLog record);

    int updateByPrimaryKey(InterfaceLog record);
}