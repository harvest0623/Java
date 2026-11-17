package com.hh.staticfiled;

public class User
{
    public static int count = 0;

    public User()
    {
        User.count++;
    }
}
