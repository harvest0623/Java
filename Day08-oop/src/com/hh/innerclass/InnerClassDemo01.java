package com.hh.innerclass;

public class InnerClassDemo01
{
    public static void main(String[] args)
    {
        //成员内部类的语法
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        oi.setName("张三");
        System.out.println(oi.getName());
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People
{
    private int heartBeat = 100;
    public class Heart
    {
        private int heartBeat = 80;
        public void show()
        {
            int heartBeat = 200;
            System.out.println(heartBeat); //200
            System.out.println(this.heartBeat); //80
            System.out.println(People.this.heartBeat); //100
        }
    }
}