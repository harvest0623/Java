package com.hh.interface4;

public interface A
{
    //1.默认方法,加default关键字
    public default void print()
    {
        System.out.println("A.print()");
        run();
    }

    //2.私有方法,加private关键字
    private void run()
    {
        System.out.println("A.run()");
    }

    //3.静态方法,加static关键字
    public static void show()
    {
        System.out.println("A.show()");
    }
}
