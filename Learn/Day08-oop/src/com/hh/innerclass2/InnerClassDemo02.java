package com.hh.innerclass2;

public class InnerClassDemo02
{
    public static void main(String[] args)
    {
        //静态内部类
        Outer.Inner oi = new Outer.Inner();
        oi.show();
    }
}
