package com.hh;

public class ArrayDemo03
{
    public static void main(String[] args)
    {
        //目标:完成数组求最值
        int[] arr = {10,20,30,40,50};
        printMaxAndMin(arr);
    }

    public static void printMaxAndMin(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("最大值是:"+max);
        System.out.println("最小值是:"+min);
    }
}
