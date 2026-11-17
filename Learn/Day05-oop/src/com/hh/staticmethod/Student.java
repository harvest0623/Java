package com.hh.staticmethod;

public class Student
{
    public double score;
    // 静态方法,有static修饰,属于类,不需要创建对象,就可以直接调用
    public static void printHelloWorld()
    {
        System.out.println("Hello World!");
    }

    // 实例方法,无static修饰,属于对象,需要创建对象,才能调用
    public void printPass()
    {
        if (score >= 60)
        {
            System.out.println("通过");
        }
        else
        {
            System.out.println("挂科");
        }
    }

    public void setScore(double score)
    {
        this.score = score;
    }
}
