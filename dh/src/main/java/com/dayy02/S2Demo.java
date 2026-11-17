package com.dayy02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2Demo {
    public static void main(String[] args) {
        // 1. 取到 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 取对象
        Student stu = (Student) context.getBean("student");

        // 3. 调用方法
        stu.reg();
    }
}
