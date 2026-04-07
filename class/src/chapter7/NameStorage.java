package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameStorage {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个姓名:");
        for(int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"个姓名:");
            String name = sc.nextLine();
            nameList.add(name);
        }
        System.out.println("姓名列表为:");
        for(String name: nameList){
            System.out.println(name+" ");
        }
        if (!nameList.isEmpty()) {
            System.out.println("\n第一个元素：" + nameList.getFirst());
        }
    }
}
