package com.spring_boot_demo1.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*直接返回*/
@Component
@RequestMapping("thread")
public class ThreadController extends Thread{

    @RequestMapping("index/{msg}")
    public void Insert(@PathVariable String msg) {
        System.out.println(msg);
    }

}
