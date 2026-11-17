package com.hh.loop;

public class WhileDemo05
{
    public static void main(String[] args)
    {
        //目标:认识while循环写法
        testWhile();
        testWhile02();
    }

    //本金10万,复利1.7%,求几年后本金翻倍
    public static void testWhile()
    {
        double money = 100000;
        int year = 0;
        while(money <= 200000)
        {
            money *= 1.017;
            year++;
        }
        System.out.println("需要" + year + "年后本金翻倍");
    }

    //珠穆朗玛峰高度8848860mm,纸张厚度0.1mm,求需要着多少次才能折叠到珠穆朗玛峰高度
    public static void testWhile02()
        {
            double height = 8848860;
            int count = 0;
            while(height > 0.1)
            {
                height /= 2;
                count++;
            }
            System.out.println("需要折叠" + count + "次");
        }
}

