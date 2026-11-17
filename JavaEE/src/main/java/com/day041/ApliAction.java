package com.day041;

import org.springframework.beans.factory.annotation.Autowired;

// A - 支付
public class ApliAction {
    @Autowired
    Person person;
    public void pay(){
        System.out.println("在支付");
        System.out.println(person.bankName);
    }
}
