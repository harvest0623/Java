package com.hh.code;

public class CodeDemo02
{
    private String name;
    private String[] direction = new String[4];
    //实例代码块,无static修饰,属于对象,需要创建对象,才能调用
    {
        System.out.println("实例代码块");
        name="张三";
        direction[0]="上";
        direction[1]="下";
        direction[2]="左";
        direction[3]="右";
    }
    public static void main(String[] args)
    {
        System.out.println("main方法");
        new CodeDemo02();
        new CodeDemo02();
        new CodeDemo02();
    }
}
