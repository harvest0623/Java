package com.hh.construct;

public class Test
{
    public static void main(String[] args)
    {
        //目标:认识类的构造器,其特点和场景
        Student s1 = new Student();
        Student s2 = new Student("张三");

        System.out.println("----------------");

        Student t1 = new Student();
        t1.name = "张三";
        t1.age = 18;
        t1.gender = '男';
        System.out.println(t1.name + " " + t1.age + " " + t1.gender);

        Student t2 = new Student("张三",18,'男');
        System.out.println(t2.name + " " + t2.age + " " + t2.gender);
    }
}
