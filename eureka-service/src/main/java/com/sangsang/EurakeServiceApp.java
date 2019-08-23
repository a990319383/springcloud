package com.sangsang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //申明这是一个Eureka服务
public class EurakeServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurakeServiceApp.class,args);
    }
}
