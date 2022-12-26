package com.example.takeaway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.takeaway.mapper")
@SpringBootApplication
public class TakeAwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeAwayApplication.class, args);
    }

}
