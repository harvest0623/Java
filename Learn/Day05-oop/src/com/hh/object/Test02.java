package com.hh.object;

public class Test02
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 100;
        System.out.println(s1.name + "的总成绩是" + (s1.chinese + s1.math));
        s1.printAllscores();
        s1.printAvgscore();
        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 59;
        s2.math = 100;
        System.out.println(s2.name + "的总成绩是" + (s2.chinese + s2.math));
        s2.printAllscores();
        s2.printAvgscore();
        System.out.println(s2);
    }
}
