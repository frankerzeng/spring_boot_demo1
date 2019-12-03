package com.spring_boot_demo1.component.util.rabbitMQ.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RabbitConfig {

    @Bean
    public Queue queueA() {
        return new Queue("queueA");
    }

    @Bean
    public Queue queueB() {
        return new Queue("queueB");
    }

    @Bean
    public Queue queueC() {
        return new Queue("queueC");
    }

    @Bean
    public Queue queueD() {
        return new Queue("queueD");
    }

    /**
     * 建立一个fanout模式的Exchange
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange_name");
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("directExchange_name");
    }

    /**
     * 绑定队列A到交换机
     */
    @Bean
    public Binding bindingQueueA(Queue queueA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueA).to(fanoutExchange);
    }

    @Bean
    public Binding bindingQueueB(Queue queueB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueB).to(fanoutExchange);
    }

    @Bean
    public Binding bindingQueueC(Queue queueC, DirectExchange directExchange) {
        return BindingBuilder.bind(queueC).to(directExchange).with("AA");
    }

    @Bean
    public Binding bindingQueueD(Queue queueD, DirectExchange directExchange) {
        return BindingBuilder.bind(queueD).to(directExchange).with("BB");
    }

}
