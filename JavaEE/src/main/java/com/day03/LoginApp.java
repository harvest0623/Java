package com.day03;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class LoginApp {
    public static void main(String[] args) {
        // 取到 xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 取 bean
        LoginAction loginAction = (LoginAction) context.getBean("loginAction");
        loginAction.login();
    }
}