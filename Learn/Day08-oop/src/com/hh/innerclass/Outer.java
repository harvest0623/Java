package com.hh.innerclass;

public class Outer
{
    public static void test()
    {
        System.out.println("Outer.test()");
    }
    //成员内部类
    public class Inner
    {
        private String name;
        public Inner()
        {
            System.out.println("Inner()");
        }
        public Inner(String name)
        {
            this.name = name;
            System.out.println("Inner(String name)");
        }

        public void show()
        {
            System.out.println("show");
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }
}
