package lab2;

import java.util.Scanner;

public class Practice2_3 {
    public static void main(String[] args) {
        int a,i;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=10;i++){
            System.out.println("请输入一个整数:");
            a = sc.nextInt();
            if(a%9==0){
                System.out.println(a);
                continue;
            }
        }
        if(i>10) System.out.println("不存在");
    }
}
