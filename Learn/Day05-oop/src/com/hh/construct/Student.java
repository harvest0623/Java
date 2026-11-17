package com.hh.construct;

public class Student
{
    String name;
    int age;
    char gender;

    //1.无参数构造器
    public Student()
    {
        System.out.println("无参数构造器");
    }

    //2.有参数构造器
    public Student(String n)
    {
        System.out.println("有参数构造器");
    }

    public Student(String name,int age,char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
