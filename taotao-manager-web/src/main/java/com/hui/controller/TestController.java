package com.hui.controller;

import com.hui.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test/queryDate")
    @ResponseBody
    public String queryDate(){
        System.out.println("执行了吗");
        return testService.queryDate();
    }
}
