package com.hh.variable;

public class VariableDemo02
{
    public static void main(String[] args)
    {
        //目标:掌握8种基本数据类型定义变量
        printVariable();
    }
    //设计一个方法,打印出8种基本数据类型定义的变量
    public static void printVariable()
    {
        //1.整型
        byte a = 10;
        //byte a2 = 128;  //大了
        short b = 10;
        int c = 10;
        long d = 10;
        //随便写一个整数字面量默认是int,虽然没超过long的范围,但是超过int的范围
        //要加上 L或者l
        long d2 = 35465645464L;

        //2.浮点型
        float e = 10;
        System.out.println(e);
        double f = 10;
        System.out.println(f);

        //3.字符型
        char g = 'a';
        System.out.println(g);

        //4.布尔型
        boolean h = true;
        System.out.println(h);

        //5.字符串型
        String str = "hello world";
        System.out.println(str);
    }
}
