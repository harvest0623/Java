package com.hh.variable;

public class VariableDemo01
{
    public static void main(String[] args)
    {
        printVariable();
    }
    //定义一个方法来学习变量的定义
    public static void printVariable()
    {
        int a = 10;
        System.out.println(a);

        //定义一个小数变量
        double b = 10.1;
        System.out.println(b);
        System.out.println("------------------");

        //为什么要用变量记录数据
        int c = 10;
        int d = 20;
        System.out.println(c + d);

        System.out.println("------------------");

        //研究变量的特点,数据可被替换
        int e = 10;
        System.out.println(e);
        e = 20;
        System.out.println(e);
        e = e + 1;
        System.out.println(e);

        System.out.println("------------------");

        //微信钱包10块,支出5块,收到6块,实时显示余额
        int balance = 10;
        System.out.println(balance);
        balance = balance - 5;
        System.out.println(balance);
        balance = balance + 6;
        System.out.println(balance);

        System.out.println("------------------");

        char ch = 'A'; //65
        System.out.println(ch + 1); //66

        char ch2 = 'a'; //97
        System.out.println(ch2 + 1); //98

        System.out.println("------------------");
        //程序中可以直接写进制数据
        int a1 = 0b1010; //二进制10
        System.out.println(a1);

        int a2 = 010; //八进制8
        System.out.println(a2);

        int a3 = 0x10; //十六进制16
        System.out.println(a3);
    }
}
