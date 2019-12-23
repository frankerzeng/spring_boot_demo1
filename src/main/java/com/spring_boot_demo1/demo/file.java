package com.spring_boot_demo1.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class file {

    public static void f() throws FileNotFoundException {
        File file = new File("file3.txt");
        System.out.println(file.canExecute());
        File[] files = File.listRoots();
        for (File file1 : files) {
            System.out.println(file1);
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile("sdf.txt", "rw");
    }

    public static void main(String[] args) {
        T t = new T();
        System.out.println(t);
    }
}

class T {
    @Override
    public String toString() {
        return super.toString();
    }
}

