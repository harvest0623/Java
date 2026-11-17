package com.hh.staticmethod;

public class Test
{
    public static void main(String[] args)
    {
        //认识static修饰和不修饰方法的区别
        //1.类名.静态方法
        Student.printHelloWorld();

        //2.对象.静态方法
        Student s1 = new Student();
        s1.printHelloWorld();

        //3.对象.实例方法
        //Student.printPass(); //报错
        s1.setScore(59);
        s1.printPass();
    }
}
