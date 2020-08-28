package com.example.testmybatisgenerator.controller;

import com.example.testmybatisgenerator.entity.Girls;
import com.example.testmybatisgenerator.service.GirlsMapperImp;
import com.example.testmybatisgenerator.service.OneInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    GirlsMapperImp girlsMapperImp;


    @RequestMapping(value = "/getuserlist",method = RequestMethod.GET)
    public String getuserlist(){

//        girlsMapperImp.deleteByPrimaryKey(107);
        girlsMapperImp.selectByPrimaryKey(108);
        Girls girls=new Girls(200,30,"ZZZ");
        girlsMapperImp.insert(girls);
        return girlsMapperImp.selectByPrimaryKey(108).toString()+",hello springboot";
    }



}
