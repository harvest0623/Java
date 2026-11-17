package com.hh;

public class ArrayTest04
{
    public static void main(String[] args)
    {
        //目标:完成斗地主游戏的做牌和洗牌
        printPoker();
    }
    /**public static void printPoker(int[] arr)
    {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(colors[arr[i]/13]+numbers[arr[i]%13]+" ");
            if((i+1)%3==0)
                System.out.println();
            if((i+1)%13==0)
                System.out.println();
        }
    }*/

    public static void printPoker()
    {
        //1.创建一个数组
        String[] pokers = new String[54];

        //2.添加花色,点数
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //3.遍历点数、花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < colors.length; j++)
            {
                pokers[index++] = colors[j] + numbers[i];
            }
        }

        //4.添加大小王
        pokers[index++] = "小王";
        pokers[index] = "大王";

        //5.打印牌
        System.out.println("牌组：");
        for (int i = 0; i < pokers.length; i++)
        {
            System.out.print(pokers[i]+"\t");
        }
        System.out.println(); //换行

        //6.洗牌
        for (int i = 0; i < pokers.length; i++)
        {
            for (int j = 0; j < pokers.length - 1 - i; j++)
            {
                int temp = (int) (Math.random() * pokers.length);
                String tempPoker = pokers[j];
                pokers[j] = pokers[temp];
                pokers[temp] = tempPoker;
            }
            System.out.print(pokers[i]+"\t");
        }
    }
}
