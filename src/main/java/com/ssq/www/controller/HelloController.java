package com.ssq.www.controller;

import com.ssq.www.PropertiesReadDemo;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
PropertiesReadDemo propertiesReadDemo;
    @Autowired
    @RequestMapping("hello")
    public String hello(){
        System.out.print(propertiesReadDemo);
        return "hello";
    }
}
