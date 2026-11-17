package com.hh.lambda;

public class LambdaDemo01
{
    public static void main(String[] args)
    {
        //认识Lambda表达式,及其基本作用
        Animal a = new Animal()
        {
            @Override
            public void cry()
            {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
        swim s1 = new swim()
        {
            @Override
            public void swimming()
            {
                System.out.println("游泳");
            }
        };
        s1.swimming();
        //Lambda表达式
        swim s = () ->
        {
            System.out.println("游泳");
        };
        s.swimming();
    }
}

abstract class Animal
{
    public abstract void cry();
}

//函数式接口:只有一个抽象方法
@FunctionalInterface
interface swim
{
    public void swimming();
}