package com.hh.object;

public class Test
{
    public static void main(String[] args)
    {
        Star s1 = new Star();
        s1.name = "henry";
        s1.age = 19;
        s1.gender = "male";
        s1.height = 170;
        s1.weight = 112;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        Star s2 = new Star();
        s2.name = "lucy";
        s2.age = 18;
        s2.gender = "female";
        s2.height = 160;
        s2.weight = 50;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.height);
        System.out.println(s2.weight);
    }
}
