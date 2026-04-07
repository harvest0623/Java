package com.hh.array;

public class GoodsTest
{
    public static void main(String[] args)
    {
        //1.创建数组
        Goods[] arr = new Goods[3];

        //2.创建对象
        Goods g1 = new Goods("001","电脑",5000,1);
        Goods g2 = new Goods("002","鼠标",20,2);
        Goods g3 = new Goods("003","键盘",10,5);

        //3.保存对象
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4.遍历
        for (int i = 0; i < arr.length; i++)
        {
            Goods goods = arr[i];
            System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + " " + goods.getCount());
        }
    }
}
