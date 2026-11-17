package com.hh;

import java.util.Scanner;

public class ArrayDemo01
{
    public static void main(String[] args)
    {
        //认识数组定义和访问
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        printArray(arr);
        printArray02(arr);
    }

    public static void printArray(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray02(int[] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
