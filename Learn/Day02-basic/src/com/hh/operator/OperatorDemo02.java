package com.hh.operator;

public class OperatorDemo02
{
    public static void main(String[] args)
    {
        //目标:理解自增自减运算符
        print();
        System.out.println("----------");
        print2();
    }
    public static void print()
    {
        int a = 10;
        System.out.println(a++); //a = a + 1
        System.out.println(++a); //a = a + 1
        System.out.println(a--); //a = a - 1
        System.out.println(--a); //a = a - 1
        System.out.println(a);
        System.out.println(a++ + ++a);
    }

    //理解自增自减放在前后变量的区别
    public static void print2()
        {
            int a = 10;
            System.out.println(a++); //a = a + 1
            System.out.println(a);
            System.out.println(++a); //a = a + 1
            System.out.println(a);
            System.out.println(a--); //a = a - 1
            System.out.println(a);
            System.out.println(--a); //a = a - 1
            System.out.println(a);
        }
}
