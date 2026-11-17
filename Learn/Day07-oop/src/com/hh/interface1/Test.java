package com.hh.interface1;

public class Test
{
    public static void main(String[] args)
    {
        //目标:认识接口,基本使用
        System.out.println(A.NAME);
    }
}

class C implements A,B
{

    @Override
    public void run()
    {
        System.out.println("C run");
    }

    @Override
    public void play()
    {
        System.out.println("C play");
    }
}