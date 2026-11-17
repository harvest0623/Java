package com.hh.construtor;

public class Test03
{
    public static void main(String[] args)
        {
            //理解this(...)调用兄弟构造器
            //创建对象存储一个学生的数据
            Student s1 = new Student("张三", '男', 18);
            System.out.println(s1);
            Student s2 = new Student("李四", '男', 19,"北大");
            System.out.println(s2);
        }
}
