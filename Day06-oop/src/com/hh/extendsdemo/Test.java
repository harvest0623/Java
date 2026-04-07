package com.hh.extendsdemo;

public class Test
{
    public static void main(String[] args)
    {
        //认识继承
        //1.创建对象,封装老师数据
        //子类可以继承所有父类的非私有成员变量
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setSex('男');
        t1.setSkill("java");
        System.out.println(t1.getName() + " " + t1.getSex() + " " + t1.getSkill());
    }
}
