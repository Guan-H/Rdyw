package com.gzcss.Rdyw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gzcss.Rdyw.mapper")
public class RdywApplication {

    public static void main(String[] args) {
        SpringApplication.run(RdywApplication.class, args);
    }

}
