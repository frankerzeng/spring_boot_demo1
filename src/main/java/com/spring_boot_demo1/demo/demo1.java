package com.spring_boot_demo1.demo;

import java.util.Objects;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        func();
    }

    private static void func() {
        String string1 = new String("abcd");
        String string2 = new String("abcd");
        System.out.println(string1.equals(string2));
        System.out.println(string1 == string2);
        System.out.println(string1.substring(1));
        System.out.println(string1.hashCode());

        char ch[] = new char[2];
        ch[0] = 'H';
        ch[1] = 'F';
        System.out.println(ch);

        int ii[][] = new int[2][3];

        String[] data = new String[100];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            if ((data[i] = in.nextLine()).equals("end")) {
                break;
            }
        }
        for (String a : data) {
            if (a.equals("end")) {
                break;
            }
            System.out.println(a);
        }

    }
}
