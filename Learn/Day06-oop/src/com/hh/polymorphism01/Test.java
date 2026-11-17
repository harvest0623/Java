package com.hh.polymorphism01;

public class Test
{
    public static void main(String[] args)
    {
        //目标:认识多态代码
        Animal a1 = new Wolf();
        a1.run(); //编译看左边，运行看右边
        System.out.println(a1.name); //成员变量:编译看左边，运行看左边

        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
    }
}
