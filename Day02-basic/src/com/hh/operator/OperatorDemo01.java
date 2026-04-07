package com.hh.operator;

public class OperatorDemo01 {
    public static void main(String[] args)
    {
        //目标:认识基本的算术运算符
        print();
        System.out.println("----------");
        print2();
    }
    public static void print()
    {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 结果是3
        System.out.println((double)a / b); // 结果是3.33333
        System.out.println(a % b);
    }

    //研究+符号做为运算符还是连接符
    public static void print2()
        {
            int a = 10;
            int b = 3;
            System.out.println(a + b); // 结果是13
            System.out.println("a + b = " + (a + b)); // 结果是a + b = 13
        }
}
