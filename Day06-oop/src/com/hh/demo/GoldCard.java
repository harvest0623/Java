package com.hh.demo;

public class GoldCard extends Card
{
    public GoldCard(String carId, String name, String phone, double money)
    {
        super(carId, name, phone, money);
    }
    @Override
    public void consume(double money)
    {
        System.out.println("使用金卡消费" + money);
        System.out.println("优惠后的价格" + money * 0.8);
        setMoney(getMoney() - money * 0.8);
        if(money * 0.8 >= 200)
        {
            printTicket();
        }
    }

    public void printTicket()
    {
        System.out.println("打印洗车票");
    }
}
