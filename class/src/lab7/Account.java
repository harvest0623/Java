package lab7;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        double leftMoney = 1023.79;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入取款金额：");
        try {
            int drawMoney = sc.nextInt();
            double result = leftMoney - drawMoney;
            if(result >= 0){
                System.out.println("您账户的余额:"+(float)result+"元");
            } else {
                System.out.println("余额不足！");
            }
        }
        catch (Exception e){
            System.out.println("您输入的取款金额不是整数");
        } finally {
            sc.close();
        }
    }
}