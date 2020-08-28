package com.example.testmybatisgenerator.dao;

import com.example.testmybatisgenerator.entity.AddUserCase;

public interface AddUserCaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddUserCase record);

    int insertSelective(AddUserCase record);

    AddUserCase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddUserCase record);

    int updateByPrimaryKey(AddUserCase record);
}