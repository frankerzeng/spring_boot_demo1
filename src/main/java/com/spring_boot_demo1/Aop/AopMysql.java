package com.spring_boot_demo1.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopMysql {
    //@Before	在方法执行前执行
    //@After	在方法执行后执行
    //@AfterReturning	在结果返回后执行
    //@AfterThrowing	在抛出异常后执行
    //@Around	环绕通知，相当于同时使用@Before 和@After


    @Pointcut(value = "execution(* com.spring_boot_demo1.controller.MysqlController.InsertUserT())")
    public void Test() {

    }

    @Before("Test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("Test()")
    public void afterTest() {
        System.out.println("afterTest");
    }

    @Around("Test()")
    public void aroundTest(ProceedingJoinPoint joinPoint) {
        System.out.println("around：环绕通知前");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around：环绕通知后");
    }

    @AfterReturning("Test()")
    public void afterReturniingTest() {
        System.out.println("afterReturniingTest");
    }
}
