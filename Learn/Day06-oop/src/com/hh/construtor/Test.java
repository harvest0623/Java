package com.hh.construtor;

public class Test
{
    public static void main(String[] args)
    {
        //目标:子类构造器的特点
        Zi zi = new Zi();
    }
}

class Zi extends Fu
{
    public Zi()
    {
        super(666);
        System.out.println("子类无参构造器");
    }
}

class Fu
{
    public Fu()
    {
        System.out.println("父类无参构造器");
    }

    public Fu(int a)
    {
        System.out.println("父类有参构造器");
    }
}