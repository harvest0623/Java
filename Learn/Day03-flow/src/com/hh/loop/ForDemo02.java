package com.hh.loop;

public class ForDemo02
{
    public static void main(String[] args)
    {
        //目标:累加
        testFor();
    }

    public static void testFor()
    {
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}