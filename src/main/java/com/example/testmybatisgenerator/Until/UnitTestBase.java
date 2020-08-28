package com.example.testmybatisgenerator.Until;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String stringXmlPath;
    public UnitTestBase() {
    }
    public UnitTestBase(String stringXmlPath) {
        this.stringXmlPath = stringXmlPath;
    }
    @Before
    public void before() {
        if (StringUtils.isEmpty(stringXmlPath)) {
//            stringXmlPath = "classPath*:spring-*.xml";
            stringXmlPath="/spring-ioc.xml";
//            stringXmlPath="D:\\Springboot\\TestMyBatisGenerator\\src\\main\\resources\\spring-ioc.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(stringXmlPath.split("[,\\s]+"));
            context.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @After
    public void after() {
        context.destroy();
    }
    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId) {
        return (T) context.getBean(beanId);
    }
    protected <T extends Object> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
