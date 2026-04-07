package chapter10;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f = new File("D:\\C语言课程设计\\C语言课程设计\\C语言课程设计\\teacher_information.txt");
        System.out.println(f.getName()+"是可读的吗:"+f.canRead());
    }
}