package com.hh.method;

import java.sql.SQLOutput;

public class MethodDemo01
{
    public static void main(String[] args)
    {
        //目标:掌握方法定义和调用
        System.out.println("和是"+getSum(10, 20));

        System.out.println("--------------------");

        System.out.println("和是"+getSum(20, 30));

        System.out.println("--------------------");

        System.out.println("验证码是"+getVerifyCode(4));
        System.out.println("验证码是"+getVerifyCode(5));
    }

    //定义一个方法,求任意两个整数之和并返回
    public static int getSum(int a, int b)
    {
        return a + b;
    }

    //打印3行HelloWorld,不需要参数和返回值
    //无参数无返回值类型
    public static void printHelloWorld()
    {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //获取一个指定位数的验证码返回
    public static String getVerifyCode(int n)
    {
        String verifyCode = "";
        for (int i = 0; i < n; i++)
        {
            int number = (int) (Math.random() * 10);
            verifyCode += number;
        }
        return verifyCode;
    }
}
