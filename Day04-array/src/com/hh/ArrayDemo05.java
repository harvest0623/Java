package com.hh;

public class ArrayDemo05
{
    public static void main(String[] args)
    {
        //目标:二维数组的认识
        printArray();
        printArray02(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public static void printArray()
    {
        //静态初始化数组
        String[][] classroom =
        {
            {"周杰伦", "林俊杰", "薛之谦"}, //0 第一排
            {"张三", "李四", "王五"}, //1 第二排
            {"赵六", "孙七", "周八"}  //2 第三排
        };

        //访问数组名[]
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        //访问数组名[][]
        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);

        //长度访问
        System.out.println(classroom.length);
        System.out.println(classroom[2].length);

        //动态初始化数组
        int[][] arr = new int[3][5]; //3行5列
    }

    //遍历二维数组
    public static void printArray02(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
