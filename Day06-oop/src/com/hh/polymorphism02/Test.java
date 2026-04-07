package com.hh.polymorphism02;

public class Test
{
    public static void main(String[] args)
    {
        //多态的好处:
        Animal a1 = new Wolf();
        a1.run();

        Wolf w = new Wolf();
        go(w);
    }

    public static void go(Wolf w)
    {
        System.out.println("go");
        w.run();
    }
}
