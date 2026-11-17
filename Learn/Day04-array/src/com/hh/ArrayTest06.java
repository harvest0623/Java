package com.hh;

public class ArrayTest06
{
    public static void main(String[] args)
    {
        //目标:完成数字华容道的初始化和随机乱序
        start(4);
    }

    public static void start(int n)
    {
        //1.定义二维数组存储数字华容道
        int[][] arr = new int[n][n];

        //2.遍历二维数组给其赋值
        int count = 1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = count++;
            }
        }
        printArray(arr);

        //3.随机乱序
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                int index = (int)(Math.random() * arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[index][j];
                arr[index][j] = temp;
            }
            System.out.println();
        }
        printArray(arr);
    }

    public static void printArray(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
