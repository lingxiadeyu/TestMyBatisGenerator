package com.example.testmybatisgenerator.controller;

import com.example.testmybatisgenerator.Until.UnitTestBase;
import com.example.testmybatisgenerator.dao.OneInterface;
import com.example.testmybatisgenerator.service.OneInterfaceImpl;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterfaceImpl  extends UnitTestBase {
//    public static void main(String[] args) {
//        OneInterface oneInterface = new OneInterfaceImpl();
//        System.out.println(oneInterface.hello("20200509"));
//    }

    public TestOneInterfaceImpl(){
        super("/spring-ioc.xml");
    }

    @Test
    public void testHello(){
        OneInterface oneInterface=super.getBean("oneInterface");
        System.out.println(oneInterface.hello("20200509001"));
    }

}
