package com.hh.operator;

public class OperatorDemo05
{
    public static void main(String[] args)
    {
        //目标:三元运算符
        print(10, 20);
        print02(50);
        print03(10, 20, 30);
    }
    public static void print(int a, int b)
    {
        int max = a > b ? a : b;
        System.out.println("较大值:" + max);
    }

    //判断成绩是否通过或挂科
    public static void print02(int score)
    {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }

    //求3个数中最大的数
    public static void print03(int a, int b, int c)
    {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("最大值:" + max);
    }
}
