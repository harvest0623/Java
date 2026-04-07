package com.hh.ThisDemo;

public class Test
{
    public static void main(String[] args)
    {
        //目标:this的认识和使用
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();
        System.out.println(s1);

        Student s2 = new Student();
        s2.print();
        System.out.println(s2);

        Student s3 = new Student();
        s3.name = "王五";
        s3.printHobby("java");
    }
}
