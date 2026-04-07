package lab2;

import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args) {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数(1~20):");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + "的阶乘为：" + result);
    }
}
