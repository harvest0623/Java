package com.hh.finaldemo;

public class FinalDemo01
{
    //final修饰静态成员变量
    //使用final修饰静态变量,变量变成静态常量,赋值后不能修改
    public static final double PI = 3.14;
    public static void main(String[] args)
    {
        //目标:理解final关键字的作用

        //3.final修饰变量,变量只能赋值一次
        //a.成员变量
        //b.局部变量
//        final int age = 18;
//        age = 19; //第二次报错

        buy(0.8);

        final int[] arr = {10, 20, 30};
//        arr = new int[]{10, 20, 30};
        arr[0] = 100;
    }

    public static void buy(final double z)
    {
//        z = 0.9;  //第二次报错
        System.out.println(z);
    }
}


//1.final修饰类不能被继承
//final class A{}
//class B extends A{} //报错

//2.final修饰方法不能被重写
//class C
//{
//    public final void show()
//    {
//        System.out.println("show");
//    }
//}

//class D extends C
//{
    //@Override
    //public void show()
    //{
    //    System.out.println("show");
    //
// }
//}