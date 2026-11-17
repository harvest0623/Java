package com.hh.branch;

public class IfTest02
{
    public static void main(String[] args)
    {
        //目标:完成自动汽车驾驶程序的书写
        testIf();
    }

    public static void testIf()
    {
        //1.三种灯状态
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        //2.判断是什么灯
        if(red)
        {
            System.out.println("红灯亮");
        }
        else if(yellow)
        {
            System.out.println("黄灯亮");
        }
        else
        {
            System.out.println("绿灯亮");
        }
        System.out.println("程序结束");
    }
}
