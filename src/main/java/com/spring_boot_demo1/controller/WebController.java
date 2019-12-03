package com.spring_boot_demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*直接返回*/
public class WebController {

    @RequestMapping("index")
    public String index() {
        return "hello index";
    }

    //自定义配置
    @Value("${web.config.username}")
    private String user_name;

    @RequestMapping("UserName")
    public String UserName() {
        return user_name;
    }

    //自定义配置
    @Value("${web.config.email}")
    private String email;

    @RequestMapping("email")
    public String Email() {
        return email;
    }


}
