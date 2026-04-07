package chapter8;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int expectedLength = 4;
        assert arr.length == expectedLength : "数组长度不符合预期";
        System.out.println("断言验证通过，数组长度符合预期");
    }
}
