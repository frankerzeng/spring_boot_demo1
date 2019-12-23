package com.spring_boot_demo1.controller;

import com.spring_boot_demo1.beans.DemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*直接返回*/
@RequestMapping("beans")
public class BeansController {

    private static ApplicationContext context;

    @RequestMapping("index")
    public String index() {
        System.out.println(BeansController.class);
        context = new ClassPathXmlApplicationContext("demoBeans.xml");
        DemoBean demoBean = (DemoBean) context.getBean("demoBeanId1");
        demoBean.printHello();
        return "end";
    }

}
