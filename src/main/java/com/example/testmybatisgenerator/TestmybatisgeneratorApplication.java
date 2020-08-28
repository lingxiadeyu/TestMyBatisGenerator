package com.example.testmybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.testmybatisgenerator.*"})
@MapperScan("com.example.testmybatisgenerator.dao")
public class TestmybatisgeneratorApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestmybatisgeneratorApplication.class, args);
    }

}
