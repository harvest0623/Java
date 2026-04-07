package chapter6;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("请输入密码:");
            password = scanner.nextLine();
        } while (!isValidPassword(password));
        System.out.println("密码设置成功!");
        scanner.close();
    }
    private static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("请重新输入!");
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasUnderline = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (c == '_') hasUnderline = true;
            else {
                System.out.println("请重新输入!");
                return false;
            }
        }
        if (hasUpper && hasLower && hasDigit && hasUnderline) return true;
        else {
            System.out.println("请重新输入!");
            return false;
        }
    }
}
