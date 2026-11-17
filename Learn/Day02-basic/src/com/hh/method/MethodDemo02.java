package com.hh.method;

public class MethodDemo02
{
    public static void main(String[] args)
    {
        //目标:认识方法重载
    }
    public static void print(int a)
    {
        System.out.println(a);
    }

    public static void print(String str)
    {
        System.out.println(str);
    }

    public static void print(double a)
    {
        System.out.println(a);
    }

    //发射导弹
    public static void fire(int x, int y)
    {
        System.out.println("发射导弹：" + x + " " + y);
    }
    public static void fire(double x, double y)
    {
        System.out.println("发射导弹：" + x + " " + y);
    }
}
