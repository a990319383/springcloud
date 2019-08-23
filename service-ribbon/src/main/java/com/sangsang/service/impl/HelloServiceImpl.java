package com.sangsang.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sangsang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        //这里访问的url 前面的SERVICE-HI 是eureka 客户端配置文件的name,多个客户端的name一样的时候进行负载均衡（默认是轮询）
        //也可以直接通过访问接口的形式的URL进行访问
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
