package com.day032;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class UpdateApp {
    public static void main(String[] args) {
        // 取到 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 取 bean
        UpdateAction updateAction = (UpdateAction) context.getBean("updateAction");

        updateAction.update();
    }
}
