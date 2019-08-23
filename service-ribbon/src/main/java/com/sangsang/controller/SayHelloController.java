package com.sangsang.controller;

import com.sangsang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hi")
    @ResponseBody
    public String hello(@RequestParam String name){
        return  helloService.hiService(name);
    }
}
