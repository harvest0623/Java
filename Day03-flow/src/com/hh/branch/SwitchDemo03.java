package com.hh.branch;

public class SwitchDemo03
{
    public static void main(String[] args)
    {
        //目标:switch分支结构的应用和写法,理解其执行流程
        testSwitch(10);
        testSwitch02(1);
    }
    public static void testSwitch(int month)
    {
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
        }
    }

    //根据男女性别,推荐不同的书本
    public static void testSwitch02(int gender)
    {
        switch (gender)
        {
            case 1:
                System.out.println("推荐《java从入门到放弃》");
                break;
            case 2:
                System.out.println("推荐《python从入门到放弃》");
                break;
            default:
                System.out.println("没有此类别");
        }
    }
}