package com.spring_boot_demo1.controller;

import com.spring_boot_demo1.component.util.Redis;
import com.spring_boot_demo1.mysql.entity.User;
import com.spring_boot_demo1.mysql.service.UserService;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController /*直接返回*/
@Component
@RequestMapping("redis")
public class RedisController {

    @Autowired
    public Redis redis;

    public Integer integer;

    @RequestMapping("insert/{key}/{value}")
    public void Insert(@PathVariable String key, @PathVariable String value) throws InterruptedException {
        new Date().getTime();
        redis.set(key, value);
        for (int i = 1; i < 1000; i++) {
            Thread.sleep(100);
            redis.hset(key + "_hset", String.valueOf(System.currentTimeMillis()), value);
        }
    }

    @RequestMapping("get/{key}")
    public String Insert(@PathVariable String key) {
        return redis.get(key);
    }

}
