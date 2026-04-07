package chapter8;

public class test2 {
    public static void main(String[] args) {
        String str = "";
        assert str != null && !str.isEmpty() : "字符串为null或空字符串";
        System.out.println("断言验证通过，字符串非空");
    }
}
