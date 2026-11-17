package com.hh.type;

public class TypeDemo01
{
    public static void main(String[] args)
    {
        //目标:认识自动类型转换,强制类型转换
        byte a = 10;
        print(a); //自动类型转换
        print2(a); //自动类型转换

        System.out.println("----------------");

        int i = 20;
        //print3(i);  //范围大的变量不能直接赋值范围小的变量
        byte j = (byte) i; //强制类型转换
        print3((byte) i);

        System.out.println("----------------");
        int n = 1500;
        byte m = (byte) n;
        System.out.println(m);
        System.out.println(n);

        System.out.println("----------------");

        double k = 3.14;
        int l = (int) k;
        System.out.println(l); //3
    }
    public static void print(int b)
    {
        System.out.println(b);
    }

    public static void print2(double c)
    {
        System.out.println(c);
    }

    public static void print3(byte j)
    {
        System.out.println(j);
    }
}
