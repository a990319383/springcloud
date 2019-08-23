package com.sangsang;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient//注意：要添加这个注解，注册到Eureka上面，这样zuul才能进行路由
@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApp {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    //下面表示配置轮询策略，不配置默认是轮询
   /* @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }*/
}
