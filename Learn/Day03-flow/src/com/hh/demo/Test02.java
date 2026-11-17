package com.hh.demo;

import java.util.Random;
import java.util.Scanner;

public class Test02
{
    public static void main(String[] args)
    {
        //猜数字游戏
        test();
    }

    public static void test()
    {
        int count = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
//        System.out.println(number);
        while (true)
        {
            System.out.println("请输入数字：");
            int inputNumber = sc.nextInt();
            if (inputNumber == number)
            {
                System.out.println("恭喜你猜对了！");
                System.out.println("游戏结束！");
                break;
            }
            else if (inputNumber > number)
            {
                System.out.println("你输入的数字大了！");
            }
            else
            {
                System.out.println("你输入的数字小了！");
            }
            count++;
        }
        System.out.println("总共猜了" + count + "次");
    }
}
