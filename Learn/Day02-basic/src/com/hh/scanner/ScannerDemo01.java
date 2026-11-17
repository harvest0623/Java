package com.hh.scanner;

import java.util.Scanner;
public class ScannerDemo01
{
    public static void main(String[] args)
    {
        demo01();
        demo02();
    }

    //键盘输入一个整数，并判断该整数是偶数还是奇数
    public static void demo01()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("偶数");
        }
        else
        {
            System.out.println("奇数");
        }
        System.out.println("程序结束");
    }

    //键盘输入用户名和年龄，并打印出来
    public static void demo02()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("用户名：" + name + "，年龄：" + age);
    }
}
