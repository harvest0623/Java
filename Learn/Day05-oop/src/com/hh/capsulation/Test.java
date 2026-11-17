package com.hh.capsulation;

public class Test
{
    public static void main(String[] args)
    {
        //目标:封装的设计思想-合理隐藏合理暴露
        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
    }
}
