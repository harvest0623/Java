package lab1;

import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        System.out.println("请输入一个四位整数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;
        System.out.println("千位数为:"+a);
        System.out.println("百位数为:"+b);
        System.out.println("十位数为:"+c);
        System.out.println("个位数为:"+d);
    }
}
