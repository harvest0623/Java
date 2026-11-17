package com.hh.type;

public class TypeDemo02
{
    public static void main(String[] args)
    {
        //目标:理解表达式的自动类型提升
        System.out.println(calc(10, 20, 30.0, 'a'));
        System.out.println(cal2((byte)10, (byte)20));
    }

    //接收各种类型的数据运算
    public static double calc(int a, int b, double c, char d)
    {
        return a + b + c + d;
    }

//    public static void cal2(){
//        int a = 10;
//        int b = 20;
//        double c = 30.0;
//        char d = 'a';
//        double result = calc(a, b, c, d);
//        System.out.println(result);
//    }
    public static int cal2(byte a, byte b)
    {
        return a + b;
    }

    public static int cal3(byte a, byte b)
    {
        byte c = (byte) (a + b);
        return c;
    }
}
