package com.hh;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo02
{
    public static void main(String[] args)
    {
        //掌握动态初始化数组
        inputScores();
    }

    //设计一个方法录入学生成绩
    public static void inputScores()
    {
        //1.定义一个数组储存8个学生成绩
        double[] scores = new double[8];

        //2.录入成绩,存放到数组中去
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }

        //3.遍历数组,统计总分,最高分,最低分,平均分
        double sum = 0;
        double max = scores[0];
        double min = scores[0];
        for(int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
            if(scores[i] > max)
                max = scores[i];
            if(scores[i] < min)
                min = scores[i];
        }
        System.out.println("总分：" + sum);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + sum / scores.length);
    }
}
