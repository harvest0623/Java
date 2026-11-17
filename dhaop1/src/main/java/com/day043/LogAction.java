package com.day043;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogAction {
    public String login(String username,String password){
        System.out.println("用户在登录");
        return  "login success";
    }

    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        LogAction logAction = (LogAction) ap.getBean("logAction");
        String re = logAction.login("admin","123456");
        System.out.println(re);
    }
}