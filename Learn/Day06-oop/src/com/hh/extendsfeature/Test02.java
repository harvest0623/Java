package com.hh.extendsfeature;

public class Test02
{
    public static void main(String[] args)
    {
        //目标:继承后子类的访问特点--就近原则
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu
{
    String name = "fu的name";

    public void run()
    {
        System.out.println("fu的run");
    }
}

class Zi extends Fu
{
    String name = "zi的name";
    public void show()
    {
        String name = "show的name";
        System.out.println(name); //show的name
        System.out.println(this.name); //zi的name
        System.out.println(super.name); //fu的name

        super.run();
    }

    public void run()
    {
        System.out.println("zi的run");
    }
}
