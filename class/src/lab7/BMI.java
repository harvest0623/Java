package lab7;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入体重（单位：kg）：");
            double weight = sc.nextDouble();
            System.out.println("请输入身高（单位：m）：");
            double height = sc.nextDouble();
            if (height < 0.3 || height > 2.5) {
                throw new Exception("身高必须在 0.3m - 2.5m 之间（当前输入：" + height + "m）");
            }
            double bmi = weight / (height * height);
            if (bmi < 18.5) {
                System.out.println("消瘦");
            } else if (bmi <= 24) {
                System.out.println("正常");
            } else if (bmi <= 28) {
                System.out.println("超重");
            } else {
                System.out.println("肥胖");
            }
        } catch (Exception e) {
            System.out.println("异常提示：" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
