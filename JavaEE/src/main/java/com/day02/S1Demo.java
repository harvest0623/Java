package com.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 使用 spring 调用
public class S1Demo {
    public static void main(String[] args) {
        // 1. 取到配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 取到对象
        Student stu = (Student) context.getBean("student");
        stu.study();

        // 3. 再取一个对象
        Product p1 = (Product) context.getBean("product");
        p1.show();

        // 4. 再取一个对象
        Product p2 = (Product) context.getBean("product");
        p2.show();
        System.out.println(p1 == p2);  // 说明 P1 和 P2 是同一个对象
    }
}