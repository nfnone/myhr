package com.wangyy.myhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wangyy.myhr.mapper")
public class MyhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyhrApplication.class, args);
    }

}
