package com.spring_boot_demo1.controller;

import com.spring_boot_demo1.component.util.rabbitMQ.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*直接返回*/
@Component
@RequestMapping("rabbitmq")
public class RabbitMQController {

    @Autowired
    public Provider provider;

    @RequestMapping("send/{msg}")
    public void Insert(@PathVariable String msg) {
        provider.sendMessageFanout(msg);
        provider.sendMessageDirect(msg);
    }

}
