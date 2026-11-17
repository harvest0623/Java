package com.hh.literal;

/**
 * 字面量
 */
public class LiteralDemo
{
    public static void main(String[] args)
    {
        printLiteral();
    }
    public static void printLiteral()
    {
        //请帮我直接输出常见的自变量
        //1.整型字面量直接写
        System.out.println(1);

        //2.浮点形字面量直接写
        System.out.println(1.0);

        //3.布尔类型字面量,只有true和false
        System.out.println(true);
        System.out.println(false);

        //4.字符类型字面量,必须用单引号括起来,只能输入一个字符
        System.out.println('a');
        System.out.println('中');

        //5.字符串类型字面量,必须用双引号括起来,可以输入多个字符
        System.out.println("hello world");

        //掌握一些特殊的字符:\n \t
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");
    }
}
