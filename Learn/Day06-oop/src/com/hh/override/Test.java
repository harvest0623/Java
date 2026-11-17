package com.hh.override;

public class Test
{
    public static void main(String[] args)
    {
        //目标:认识方法重写
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal
{
    //方法重写
    @Override //方法重写的校用注释(标志):方法重写时候必须加上
    public void cry()
    {
        System.out.println("喵喵喵");
    }
}

class Animal
{
    public void cry()
    {
        System.out.println("汪汪汪");
    }
}
