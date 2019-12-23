package com.spring_boot_demo1.demo;

import javax.rmi.CORBA.Util;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 2);

        CharSequence charSequence = "b";
        StringBuilder stringBuilder = new StringBuilder(charSequence);
        stringBuilder.setCharAt(0, '了');
        System.out.println(stringBuilder);
        System.out.println(Arrays.toString(arr));
        Date date = new Date();
        long date1 = System.currentTimeMillis();
        long date2 = System.nanoTime();
        System.out.println(date1);
        System.out.println(date2);

        Random random = new Random();

        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(Math.random());
        System.out.println(System.getProperties());
    }
}
