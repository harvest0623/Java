package com.hh.polymorphism03;

public class Test
{
    public static void main(String[] args)
    {
        //多态的好处:
        Animal a1 = new Wolf();
        a1.run();

        //强制类型转换
        Wolf w1 = (Wolf)a1;
        w1.cry();

        Wolf w = new Wolf();
        go(w);
    }

    public static void go(Wolf w)
    {
        System.out.println("go");
        w.run();
    }
}
