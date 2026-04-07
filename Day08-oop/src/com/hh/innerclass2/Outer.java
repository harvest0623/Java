package com.hh.innerclass2;

public class Outer
{
    public static String name;
    private int age;
    public static class Inner
    {
        private String name;
        public void show()
        {
            System.out.println("show()");
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
