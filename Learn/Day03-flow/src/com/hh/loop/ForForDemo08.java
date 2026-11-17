package com.hh.loop;

public class ForForDemo08
{
    public static void main(String[] args)
    {
        //目标:理解嵌套循环的写法
        testForFor();
        testForFor02();
    }

    public static void testForFor()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //九九乘法表
    public static void testForFor02()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}