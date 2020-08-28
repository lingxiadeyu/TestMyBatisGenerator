package com.example.testmybatisgenerator.service;

import com.example.testmybatisgenerator.dao.GirlsMapper;
import com.example.testmybatisgenerator.entity.Girls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlsMapperImp implements GirlsMapper {
    @Autowired
    GirlsMapper girlsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return girlsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Girls record) {
        return girlsMapper.insert(record);
    }

    @Override
    public int insertSelective(Girls record) {
        return 0;
    }

    @Override
    public Girls selectByPrimaryKey(Integer id) {

        return girlsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Girls record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Girls record) {
        return 0;
    }
}
