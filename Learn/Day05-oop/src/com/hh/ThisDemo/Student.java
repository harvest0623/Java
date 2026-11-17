package com.hh.ThisDemo;

public class Student
{
    String name;
    public void print()
    {
        //this是一个对象的引用，this代表的是当前对象本身
        System.out.println(this);
        System.out.println(this.name);
    }

    public void printHobby(String n)
    {
        System.out.println(this.name + "的爱好是：" + n);
    }
}
