package com.hh.operator;

public class OperatorDemo04
{
    public static void main(String[] args)
    {
        //目标:理解关系运算符
        print(10, 20);
    }

    public static void print(int a, int b)
    {
        System.out.println(a > b); // 结果是false
        System.out.println(a < b); // 结果是true
        System.out.println(a >= b); // 结果是false
        System.out.println(a <= b); // 结果是true
        System.out.println(a == b); // 结果是false
        System.out.println(a != b); // 结果是true
    }
}
