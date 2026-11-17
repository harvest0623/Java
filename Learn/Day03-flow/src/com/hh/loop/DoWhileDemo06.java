package com.hh.loop;

public class DoWhileDemo06
{
    public static void main(String[] args)
    {
        //目标:了解do...while循环的写法
        testDoWhile();
    }

    public static void testDoWhile()
    {
        int i = 1;
        do
        {
            System.out.println("hello world");
            i++;
        }while(i <= 5);
    }
}
