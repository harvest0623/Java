package com.hh.loop;

public class ForDemo03
{
    public static void main(String[] args)
    {
        testFor();
    }

    //求1-10的偶数和
    public static void testFor()
    {
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
