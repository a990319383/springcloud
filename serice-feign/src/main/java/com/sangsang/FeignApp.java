package com.sangsang;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }
    //下面表示配置轮询策略，不配置默认是轮询
  /*  @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }*/
}
