package com.herocheer.face.dao;

import com.herocheer.face.entity.AppExpenses;
import com.herocheer.face.entity.AppExpensesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppExpensesMapper {
    long countByExample(AppExpensesExample example);

    int deleteByExample(AppExpensesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppExpenses record);

    int insertSelective(AppExpenses record);

    List<AppExpenses> selectByExample(AppExpensesExample example);

    AppExpenses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppExpenses record, @Param("example") AppExpensesExample example);

    int updateByExample(@Param("record") AppExpenses record, @Param("example") AppExpensesExample example);

    int updateByPrimaryKeySelective(AppExpenses record);

    int updateByPrimaryKey(AppExpenses record);
}