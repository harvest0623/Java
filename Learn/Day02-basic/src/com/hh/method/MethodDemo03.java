package com.hh.method;

public class MethodDemo03
{
    public static void main(String[] args)
    {
        //目标:掌握在无返回值的方法中单独使用return 提前结束方法
        divide(10, 0);
    }

    //设计一个除法的功能
    public static void divide(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a / b);
    }
}
