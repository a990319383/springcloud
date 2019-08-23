package com.sangsang.service;

import com.sangsang.fallback.SchedualFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "service-hi",fallback = SchedualFallBack.class)//eureka service的名字
public interface SchedualService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET )
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
