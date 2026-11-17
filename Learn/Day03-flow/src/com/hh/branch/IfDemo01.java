package com.hh.branch;

public class IfDemo01
{
    public static void main(String[] args)
    {
        //目标:认识if语句,其写法和运用(独立功能独立方法)
        testIf();
        testIf02();
        testIf03(60);
    }

    public static void testIf()
    {
        int a = 10;
        int b = 20;
        if(a > b)
        {
            System.out.println("a大于b");
        }
        System.out.println("a小于b");
    }

    //钱包90元转走80元,如果够显示成功,不够显示余额不足
    public static void testIf02()
    {
        int balance = 90;
        int out = 80;
        if(balance >= out)
        {
            System.out.println("转走成功");
            balance = balance - out;
            System.out.println("余额为:" + balance);
        }
        else
        {
            System.out.println("余额不足");
        }
    }

    //给学生的成绩评分,为A、B、C、D、E,用if语句实现
    public static void testIf03(int score)
    {
        if(score >= 90)
        {
            System.out.println("A");
        }
        else if(score >= 80)
        {
            System.out.println("B");
        }
        else if(score >= 70)
        {
            System.out.println("C");
        }
        else if(score >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("E");
        }
    }
}
