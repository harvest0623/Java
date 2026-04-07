package com.hh.operator;

public class OperatorDemo03
{
    public static void main(String[] args)
    {
        //目标:掌握扩展的赋值运算符
        receive(10);
        demo();
    }

    //收红包
    public static void receive(int b)
    {
        int a = 100;
        a += b; //a = a + b;
        System.out.println("收红包成功,余额为:" + a);

        byte a1 = 10;
        byte a2 = 20;
        a1 += a2; //a1 = (byte)(a1 + a2);
        System.out.println(a1);
    }

    //演示一下其他几个扩展的赋值运算符
    public static void demo()
    {
        int a = 10;
        a *= 5; //a = a * 5;
        System.out.println(a);

        int b = 10;
        b /= 5; //b = b / 5;
        System.out.println(b);

        int c = 10;
        c %= 5; //c = c % 5;
        System.out.println(c);

        int d = 10;
        d -= 5; //d = d - 5;
        System.out.println(d);

        int e = 10;
        e &= 5; //e = e & 5;
        System.out.println(e);
    }
}