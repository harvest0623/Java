package com.day041;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApliApp {
    public static void main(String[] args) {
        // 取到 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 取到 bean
        ApliAction apliAction = (ApliAction) context.getBean("apliAction");
        apliAction.pay();
    }
}