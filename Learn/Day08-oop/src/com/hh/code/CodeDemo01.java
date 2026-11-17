package com.hh.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodeDemo01
{
    public static String name;
    public static String[] cards =new String[54];
    //静态代码块,属于类,类加载时执行
    static
    {
        System.out.println("静态代码块");
        name = "张三";
        cards[0] = "大王";
        cards[1] = "小王";
    }
    public static void main(String[] args)
    {
        //认识代码块
        System.out.println("main方法");
        System.out.println(name);
        System.out.println(cards[0]);
        System.out.println(Arrays.toString(cards));
    }
}
