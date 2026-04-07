package com.hh.staticfiled;

public class Test02
{
    public static void main(String[] args)
    {
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.count);
    }
}
