package com.hh.demo;

import java.util.Scanner;

public class Test01
{
    public static void main(String[] args)
    {
        calculator('+', 10, 20);

        //目标:简易计算器开发
        //1.键盘输入两个数字,运算符号
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数字:");
//        double a = sc.nextDouble();
//        System.out.println("请输入第二个数字:");
//        double b = sc.nextDouble();
//        System.out.println("请输入运算符号:");
//        char c = sc.next().charAt(0);
//        System.out.println("结果为:" + (a + b));
//        switch (c)
//        {
//            case '+':
//                System.out.println("结果为:" + (a + b));
//                break;
//            case '-':
//                System.out.println("结果为:" + (a - b));
//                break;
//            case '*':
//                System.out.println("结果为:" + (a * b));
//                break;
//            case '/':
//                System.out.println("结果为:" + (a / b));
//                break;
//            default:
//                System.out.println("输入错误");
//        }
//        System.out.println("程序结束");
    }

    //简易计算器开发,单独一个方法实现
    public static void calculator(char operator, int a, int b)
    {
        switch (operator)
        {
            case '+':
                System.out.println("结果为:" + (a + b));
                break;
            case '-':
                System.out.println("结果为:" + (a - b));
                break;
            case '*':
                System.out.println("结果为:" + (a * b));
                break;
            case '/':
                System.out.println("结果为:" + (a / b));
                break;
        }
        System.out.println("计算结束");
    }
}
