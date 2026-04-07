package chapter7;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scoreCount = 5;
        int[] score = new int[scoreCount];
        for(int i=0;i<scoreCount;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            while(!sc.hasNextInt()){
                System.out.println("输入错误");
                sc.next();
            }
            score[i] = sc.nextInt();
        }
        int maxScore = score[0];
        int minScore = score[0];
        for(int s: score){
            if(s>maxScore){
                maxScore = s;
            }else if(s<minScore){
                minScore = s;
            }
        }
        System.out.println("最高分是:"+maxScore);
        System.out.println("最低分是:"+minScore);
    }
}
