package chapter10;

import java.io.File;
public class ListJavaFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] javaFiles = dir.listFiles((dir1, name) -> name.endsWith(".java"));

        System.out.println("当前目录下的Java文件：");
        if (javaFiles != null) {
            for (File f : javaFiles) {
                System.out.println(f.getName());
            }
        }
    }
}