package com.dayy02;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    int id;
    String name;
    String password;
    String ident;
    public void reg() {
        id = 1;
        name = "张三";
        password = "123456";
        ident = "1001";
        System.out.println("注册的信息有：" + id + " " + name + " " + password + " " + ident);
        System.out.println("注册成功");
    }
}