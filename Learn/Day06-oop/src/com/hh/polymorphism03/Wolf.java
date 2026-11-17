package com.hh.polymorphism03;

public class Wolf extends Animal
{
    String name = "狼";
    @Override
    public void run()
    {
        System.out.println("跑很快");
    }

    public void cry()
    {
        System.out.println("嗷嗷");
    }
}
