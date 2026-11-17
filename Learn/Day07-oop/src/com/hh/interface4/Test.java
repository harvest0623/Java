package com.hh.interface4;

public class Test
{
    public static void main(String[] args)
    {
        AImpl a = new AImpl();
        a.print();
        A.show();
    }
}

class AImpl implements A
{

}
