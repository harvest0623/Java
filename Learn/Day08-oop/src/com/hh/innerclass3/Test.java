package com.hh.innerclass3;

public class Test
{
    public static void main(String[] args)
    {
        //认识匿名内部类
        Animal a = new Animal()
        {
            @Override
            public void cry()
            {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

//class cat extends Animal
//{
//    @Override
//    public void cry()
//    {
//        System.out.println("喵喵喵");
//    }
//}