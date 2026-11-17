package com.hh.innerclass3;

public class Test02
{
    public static void main(String[] args)
    {
        swim s1 = new swim()
        {
            @Override
            public void swimming()
            {
                System.out.println("学生游的很快");
            }
        };
        start(s1);

        System.out.println("-------------");

        swim s2 = new swim()
        {
            @Override
            public void swimming()
            {
                System.out.println("老师游的很慢");
            }
        };
        start(s2);
//        swim s1 = new Student();
//        s1.swimming();
//        swim s2 = new Teacher();
//        s2.swimming();
    }
    public static void start(swim s)
    {
        System.out.println("开始游泳");
        s.swimming();
        System.out.println("结束游泳");
    }
}

class Teacher implements swim
{
    @Override
    public void swimming()
    {
        System.out.println("老师可以游泳");
    }
}

class Student implements swim
{
    @Override
    public void swimming()
    {
        System.out.println("学生可以游泳");
    }
}

interface swim
{
    void swimming();
}