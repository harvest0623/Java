package com.hh.demo;

public class SilverCard extends Card
{
    public SilverCard(String carId, String name, String phone, double money)
    {
        super(carId, name, phone, money);
    }
    @Override
    public void consume(double money)
    {
        System.out.println("使用银卡消费" + money);
        System.out.println("优惠后的价格" + money * 0.9);
        setMoney(getMoney() - money * 0.9);
    }
}
