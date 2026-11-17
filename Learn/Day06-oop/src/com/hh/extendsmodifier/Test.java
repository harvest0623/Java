package com.hh.extendsmodifier;

public class Test
{
    public static void main(String[] args)
    {
        //目标:认识4中权限修饰符的修饰范围
        Fu fu = new Fu();
        //fu.privateMethod();  //不能访问私有
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
