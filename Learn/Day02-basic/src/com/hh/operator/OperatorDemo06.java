package com.hh.operator;

public class OperatorDemo06
{
    public static void main(String[] args)
    {
        //目标:掌握逻辑运算符的使用
        print(10, 20);

        System.out.println("----------");

        print2(18, 170);

        System.out.println("----------");

        print3(18, 170);

        System.out.println("----------");

        print4(18);

        System.out.println("----------");

        print5(18, 170);

        System.out.println("----------");

        print6(5, 10);
    }

    public static void print(int a, int b)
    {
        System.out.println(a > b || a < b);
        System.out.println(!(a > b));
    }

    //判断一个人是否满足择偶要求
    public static void print2(int age, int height)
    {
        System.out.println(age >= 18 && height >= 170);
    }

    //找一个人要么身高超过180要么收入30万
    public static void print3(int age, int income)
    {
        System.out.println(age >= 18 || income >= 30000);
    }

    //!
    public static void print4(int age)
    {
        System.out.println(!(age >= 18));
    }

    //^条件相同为false,条件不同为true
    public static void print5(int age, int income)
    {
        System.out.println(age >= 18 ^ income >= 30000);
    }

    //判断 && || 和 & | 的区别
    public static void print6(int a, int b)
    {
        System.out.println(a > 5 && ++b > 15); // 后面的b不会执行
        System.out.println(b);

        System.out.println(a > 5 & ++b > 15);
        System.out.println(b);

        System.out.println(a > 5 || ++b > 15); // 后面的b会执行
        System.out.println(b);

        System.out.println(a > 5 | ++b > 15);
        System.out.println(b);
    }
}
