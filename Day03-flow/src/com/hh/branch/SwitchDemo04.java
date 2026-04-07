package com.hh.branch;

public class SwitchDemo04
{
    public static void main(String[] args)
    {
        //目标:搞清楚switch的注意事项
    }

    //1.switch的参数只能是byte,short,char,int,enum,String,不支持float,double,boolean
    public static void testSwitch(int month)
    {
        switch (month)
        {
            case 1:
                System.out.println("1月");
                break;
            case 2:
                System.out.println("2月");
                break;
            case 3:
                System.out.println("3月");
                break;
            default:
                System.out.println("没有这个月");
        }
    }

    //2.case给出的值不允许重复,只能是字面量,不能是变量
    public static void testSwitch02(int gender)
    {
        switch (gender)
        {
            case 1:
                System.out.println("男");
                break;
            case 2:
                System.out.println("女");
                break;
            default:
                System.out.println("没有这个性别");
        }
    }

    //3.正常使用switch时不要忘记添加break,否则会出错
    public static void testSwitch03(int month)
    {
        switch (month)
        {
            case 1:
                System.out.println("1月");
            case 2:
                System.out.println("2月");
            case 3:
                System.out.println("3月");
            default:
                System.out.println("没有这个月");
        }
    }
}
