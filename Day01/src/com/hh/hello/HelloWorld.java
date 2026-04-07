package com.hh.hello;

import java.util.Date;
import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("HelloWorld");
        System.out.println("----------------------");
        printHelloWorld();
        System.out.println("----------------------");
        System.out.println(sum(1, 2));

//        char[] chs = new char[52];
//        for(int i = 0; i < chs.length; i++)
//        {
//            if(i < 26)
//                chs[i] = (char)('A' + i);
//            else
//                chs[i] = (char)('a' + i - 26);
//        }
//        for(char ch : chs)
//        {
//            System.out.print(ch + " ");
//        }

//        int[] arr = {1,2,3,4,5};
//        int[] newArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++)
//        {
//            newArr[i] = arr[i];
//        }
//        for(int i = 0; i < newArr.length; i++)
//        {
//            System.out.print(newArr[i] + " ");
//        }
    }
    public static void printHelloWorld()
    {
        System.out.println("HelloWorld");
        Date time = new Date();
        System.out.println(time);
    }



    //求任意两个整数之和
    public static int sum(int a, int b)
    {
        return a + b;
    }
}
