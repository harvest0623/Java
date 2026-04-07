package chapter6;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*_)[A-Za-z\\d_]{6,10}$";
        do {
            System.out.print("请输入密码:");
            password = scanner.nextLine();
            if (!password.matches(regex)) {
                System.out.println("密码不符合要求，请重新输入！");
            }
        } while (!password.matches(regex));
        System.out.println("密码设置成功！");
        scanner.close();
    }
}