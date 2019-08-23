package com.sangsang.controller;


import com.sangsang.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    private SchedualService schedualService;
    @RequestMapping("/hi")
    private String hi(){
      return  schedualService.sayHiFromClientOne("西瓜皮");
    }
}
