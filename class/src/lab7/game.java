package lab7;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int p1, p2;
            System.out.print("请玩家1输入手型（0=石头，1=剪刀，2=布）：");
            p1 = sc.nextInt();
            System.out.print("请玩家2输入手型（0=石头，1=剪刀，2=布）：");
            p2 = sc.nextInt();
            assert (p1 >= 0 && p1 <= 2) : "输入错误";
            assert (p2 >= 0 && p2 <= 2) : "输入错误";
            String result = judgeWinner(p1, p2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("异常：输入不是整数，请重新输入！\n");
            sc.next();
        }
    }

    public static String judgeWinner(int p1, int p2) {
        if (p1 == p2) {
            return "平局";
        } else if ((p1 + 1) % 3 == p2) {
            return "玩家1获胜";
        } else {
            return "玩家2获胜";
        }
    }
}
