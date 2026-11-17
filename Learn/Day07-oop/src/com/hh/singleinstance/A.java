package com.hh.singleinstance;
//设计成单例设计模式
public class A
{
    //2.定义一个静态变量
    private static final A a = new A();

    //1.私有化构造器
    private A()
    {

    }

    public static A getInstance()
    {
        return a;
    }
}
