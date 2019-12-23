package com.spring_boot_demo1.demo;

public class People {

    public Inner getInner(String name, String city) {
        return new Inner() {
            private String nameStr = name;
            public String getName() {
                return nameStr;
            }
        };
    }

    public static void main(String[] args) {
        People people = new People();
        Inner inner = people.getInner("Inner", "NewYork");
        System.out.println(inner.getName());
    }
}
interface Inner {
    String getName();
}