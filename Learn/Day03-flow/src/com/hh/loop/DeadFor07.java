package com.hh.loop;

public class DeadFor07
{
    public static void main(String[] args)
    {
        //目标:掌握死循环的语法
        testDeadFor();
    }

    public static void testDeadFor()
    {
        //1.for循环实现死循环
//        for(;;)
//        {
//            System.out.println("hello world");
//        }

        //2.while循环实现死循环
//        while(true)
//            System.out.println("hello world");

        //3.do...while循环实现死循环
        do
            System.out.println("hello world");
        while(true);
    }
}
