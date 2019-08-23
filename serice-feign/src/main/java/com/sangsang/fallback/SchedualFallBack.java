package com.sangsang.fallback;

import com.sangsang.service.SchedualService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class SchedualFallBack implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println(name + " --------------- ");
        return "此路已断------>"+name;
    }
}
