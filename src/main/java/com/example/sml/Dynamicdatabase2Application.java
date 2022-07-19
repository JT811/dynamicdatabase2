package com.example.sml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableTransactionManagement  // 开启事务
public class Dynamicdatabase2Application {

    public static void main(String[] args) {
        SpringApplication.run(Dynamicdatabase2Application.class, args);
    }

}
