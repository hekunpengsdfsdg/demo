package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aaa.dao")
public class PractiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(PractiseApplication.class, args);
    }

}
