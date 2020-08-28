package com.example.testmybatisgenerator.service;

import com.example.testmybatisgenerator.dao.OneInterface;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Word from interface"+word;
    }
}
