package com.hh.demo;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        //加油站支付小程序
        GoldCard gc = new GoldCard("GC001", "张三", "13800000001", 5000);

        SilverCard sc = new SilverCard("SC001", "李四", "13800000001", 2000);
        pay(gc);
        pay(sc);
    }

    //刷卡
    public static void pay(Card c)
    {
        System.out.println("请刷卡,请输入你当前消费的金额:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}
