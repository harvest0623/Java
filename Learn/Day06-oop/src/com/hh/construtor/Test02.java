package com.hh.construtor;

public class Test02
{
    public static void main(String[] args)
    {
        //子类构造器调用父类构造器
        Teacher t = new Teacher();
        t.setName("henry");
        t.setSex('男');
        t.setSkill("java");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}
