package com.spring_boot_demo1.component.util.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "queueA")
    public void receiveQueueA(String msg) {
        System.out.println("A 收到：" + msg);
    }

    @RabbitListener(queues = "queueB")
    public void receiveQueueB(String msg) {
        System.out.println("B 收到：" + msg);
    }

    @RabbitListener(queues = "queueC")
    public void receiveQueueC(String msg) {
        System.out.println("C 收到：" + msg);
    }

    @RabbitListener(queues = "queueD")
    public void receiveQueueD(String msg) {
        System.out.println("D 收到：" + msg);
    }
}
