package com.hh.loop;

public class BreakAndContinueDemo09
{
    public static void main(String[] args)
    {
        //目标:理解break和continue的用法
        testBreak();
        testContinue();
    }

    public static void testBreak()
    {
        for (int i = 0; i < 5; i++)
        {
            if (i == 3)
            {
                break; //跳出当前循环
            }
            System.out.println("i=" + i);
        }
    }

    public static void testContinue()
    {
        for (int i = 0; i < 5; i++)
        {
            if (i == 3)
            {
                continue; //跳过当前循环
            }
            System.out.println("i=" + i);
        }
    }
}
