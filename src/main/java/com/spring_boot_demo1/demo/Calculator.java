package com.spring_boot_demo1.demo;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    final int Str11 = 1;

    public Calculator() {
    }

    // 操作数1，为了程序的安全，初值一定设置，这里我们设置为0。
    String str1 = "0";

    // 操作数2
    String str2 = "0";

    // 运算符
    String signal = "+";

    // 运算结果
    static String result = "";

    // 以下k1至k5为状态开关

    // 开关1用于选择输入方向，将要写入str1或str2
    // 为 1 时写入 str1，为 2 时写入 str2
    int k1 = 1;

    // 开关 2 用于记录符号键的次数
    // 如果 k2>1 说明进行的是 2+3-9+8 这样的多符号运算
    int k2 = 1;

    // 开关3用于标识 str1 是否可以被清 0
    // 等于 1 时可以，不等于1时不能被清0
    int k3 = 1;

    // 开关4用于标识 str2 是否可以被清 0
    // 等于 1 时可以，不等于1时不能被清0
    int k4 = 1;

    // 开关5用于控制小数点可否被录入
    // 等于1时可以，不为1时，输入的小数点被丢掉
    int k5 = 1;

    static final long l = 1L;
    // store的作用类似于寄存器，用于记录是否连续按下符号键
    JButton store;


    public static void main(String[] args) {
        System.out.println(l);
        // 创建一个 JFrame 对象并初始化。JFrame 可以理解为程序的主窗体。
        JFrame frame = new JFrame("Calculator");

        // 设置主窗口出现在屏幕上的位置
        frame.setLocation(300, 200);

        // 设置窗体不能调大小
        frame.setResizable(false);

        // 创建一个 JTextField 对象并初始化。 JTextField 是用于显示操作和计算结果的文本框。
        // 参数 20 表明可以显示 20 列的文本内容
        JTextField result_TextField = new JTextField(result, 20);

        // 清除按钮
        JButton clear_Button = new JButton("Clear");
        // 数字键0到9
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        // 计算命令按钮，加减乘除以及小数点等
        JButton button_Dian = new JButton(".");
        JButton button_jia = new JButton("+");
        JButton button_jian = new JButton("-");
        JButton button_cheng = new JButton("*");
        JButton button_chu = new JButton("/");
        // 计算按钮
        JButton button_dy = new JButton("=");

        // 创建一个 Jpanel 对象并初始化
        JPanel pan = new JPanel();
        // 设置该容器的布局为四行四列，边距为5像素
        pan.setLayout(new GridLayout(4, 4, 5, 5));

        // 将用于计算的按钮添加到容器内
        pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(button_chu);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(button_cheng);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button_jian);
        pan.add(button0);
        pan.add(button_Dian);
        pan.add(button_dy);
        pan.add(button_jia);
        // 设置 pan 对象的边距
        pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 按照同样的方式设置第二个JPanel
        JPanel pan2 = new JPanel();
        pan2.setLayout(new BorderLayout());
        pan2.add(result_TextField, BorderLayout.WEST);
        pan2.add(clear_Button, BorderLayout.EAST);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(pan2, BorderLayout.NORTH);
        frame.getContentPane().add(pan, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
