package com.example.testmybatisgenerator.dao;
import com.example.testmybatisgenerator.entity.Girls;

public interface GirlsMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Girls record);

    int insertSelective(Girls record);

    Girls selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girls record);

    int updateByPrimaryKey(Girls record);
}