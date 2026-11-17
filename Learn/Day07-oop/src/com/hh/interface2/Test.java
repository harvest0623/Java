package com.hh.interface2;

public class Test
{
    //接口的好处
    public static void main(String[] args)
    {
        People p = new Student();
        Driver d = new Student();
    }
}

interface Driver
{

}

class People
{

}
class Student extends People implements Driver
{

}