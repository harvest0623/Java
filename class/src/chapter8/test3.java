package chapter8;

public class test3 {
    public static void main(String[] args) {
        int num = -1;
        assert num > 0 : "参数值为" + num + "，预期范围是大于0";
        System.out.println("参数验证通过，num = " + num);
    }
}
