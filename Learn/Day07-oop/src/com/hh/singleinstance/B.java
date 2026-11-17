package com.hh.singleinstance;

public class B
{
    private static B b = null;
    private B()
    {

    }
    public static B getInstance()
    {
        if (b == null)
        {
            b = new B();
        }
        return b;
    }
}
