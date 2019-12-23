package com.spring_boot_demo1.beans;

public class DemoBean {
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public void printHello() {
        System.out.println("The first Spring :hello" + name);
    }
}
