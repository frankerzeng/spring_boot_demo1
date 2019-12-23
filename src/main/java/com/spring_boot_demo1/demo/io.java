package com.spring_boot_demo1.demo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class io {
    public static void file() throws IOException {
        System.out.println("输入字符：");
        File outFile = new File("file2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);
        fileOutputStream.write(new byte[]{'d', '1'});

        FileOutputStream fileOutputStream1 = new FileOutputStream("file3.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream1);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeByte('b');
        dataOutputStream.close();
        fileOutputStream1.close();

    }
    public static void main(String[] args) throws IOException {
        file();

        System.out.println("输入字符：");

        byte[] bytes = new byte[4000];
        int len = System.in.read(bytes);

        while (len != -1) {
            System.out.write(bytes, 0, len);
            len = System.in.read(bytes);
        }

    }
}
