package com.action;

import com.service.AccService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccService accService = (AccService) context.getBean("accService");
        accService.trans("sunb", "商家2", 12);
    }
}