package com.hh.demo;

import java.util.Scanner;

public class AllTest
{
    public static void main(String[] args)
    {
        //目标:完成健康计算器
        Scanner sc = new Scanner(System.in);
        //1.用户输入个人信息,身高,体重,性别,年龄
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入性别：");
        char gender = sc.next().charAt(0);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("用户输入的参数为：" + height + "，" + weight + "，" + gender + "，" + age);
        //2.根据用户输入的参数，进行bmi的计算
        double bmi = calcBMI(weight, height);
        System.out.println("bmi：" + bmi);
        //3.根据bmi的值，给出对应的结果
        if (bmi < 18.5)
        {
            System.out.println("过轻");
        }
        else if (bmi >= 18.5 && bmi < 25)
        {
            System.out.println("正常");
        }
        else if (bmi >= 25 && bmi < 28)
        {
            System.out.println("过重");
        }
        else if (bmi >= 28 && bmi < 32)
        {
            System.out.println("肥胖");
        }
        else
        {
            System.out.println(" severely obese");
        }
    }
    //2.根据用户输入的参数,计算BMI指数(用一个独立方法计算并返回这个结果)
    public static double calcBMI(double weight, double height)
    {
        return weight / (height * height);
    }

    //3.根据用户输入的参数,计算BMR指数(用一个独立方法计算并返回这个结果)
    public static double calcBMR(double height, int age, char gender)
    {
        if(gender == '男')
        {
            return 66 + (13.7 * height) + (5 * age) - (6.8 * age);
        }
        else
        {
            return 655 + (9.6 * height) + (1.8 * age) - (4.7 * age);
        }
    }
}
