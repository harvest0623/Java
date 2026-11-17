package com.day041;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int id;
    String name;
    @Value("中国银行6226")
    String bankName;
}