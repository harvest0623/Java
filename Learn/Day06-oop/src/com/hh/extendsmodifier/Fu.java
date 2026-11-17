package com.hh.extendsmodifier;

public class Fu
{
    //1.private:只能在本类中访问
    private void privateMethod()
    {
        System.out.println("privateMethod");
    }

    //2.缺省:当前类中同一个包中可以访问
    void defaultMethod()
    {
        System.out.println("defaultMethod");
    }

    //3.protected:当前类中同一个包中、子类中、不同包中可以访问
    protected void protectedMethod()
    {
        System.out.println("protectedMethod");
    }

    //4.public:所有类中都可以访问
    public void publicMethod()
    {
        System.out.println("publicMethod");
    }

    public static void main(String[] args)
    {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
