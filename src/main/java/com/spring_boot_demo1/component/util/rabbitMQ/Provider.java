package com.spring_boot_demo1.component.util.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Provider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessageFanout(String msg) {
        System.out.println("发送消息：" + msg);
        amqpTemplate.convertAndSend("fanoutExchange_name", "", msg);
    }

    public void sendMessageDirect(String msg) {
        System.out.println("发送消息：" + msg);
        amqpTemplate.convertAndSend("directExchange_name", "AA", msg + "AA");
        amqpTemplate.convertAndSend("directExchange_name", "BB", msg + "BB");
    }
}
