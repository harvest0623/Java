package chapter8;

public class Example8 {
    public static void main(String[] args) {
        int age = -5;
        assert age >= 0 : "年龄不能为负数:" + age;
        System.out.println("年龄：" + age);
    }
}
