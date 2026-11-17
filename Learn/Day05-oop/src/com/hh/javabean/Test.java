package com.hh.javabean;

public class Test
{
    public static void main(String[] args)
    {
        //实体类的认识和作用
        Student s = new Student();
        s.setName("小王");
        s.setChinese(100);
        s.setMath(100);
        System.out.println(s.getName() + "的总成绩是" + (s.getChinese() + s.getMath()));

        Student s2 = new Student("小王",100,100);
        System.out.println(s2.getName() + "的总成绩是" + (s2.getChinese() + s2.getMath()));

        //实体类在开发应用中的场景
        StudentOperator operator = new StudentOperator(s2);
        operator.printTotalScore();
        operator.printAvgScore();
    }
}
