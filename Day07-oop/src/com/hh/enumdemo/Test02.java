package com.hh.enumdemo;

public class Test02
{
    public static void main(String[] args)
    {
//        move(Constant.UP);
        move(Direction.UP);
    }

//    public static void move(int direction)
//    {
//        switch (direction)
//        {
//            case Constant.UP:
//                System.out.println("向上移动");
//                break;
//            case Constant.DOWN:
//                System.out.println("向下移动");
//                break;
//            case Constant.LEFT:
//                System.out.println("向左移动");
//                break;
//            case Constant.RIGHT:
//                System.out.println("向右移动");
//                break;
//            default:
//                System.out.println("无效的移动方向");
//        }
//    }
    public static void move(Direction direction)
    {
        switch (direction)
        {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
}
