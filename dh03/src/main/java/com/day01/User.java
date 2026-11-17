package com.day01;

public class User {
    private String account;
    private String password;
    private String identity;

    public User() {
    }

    // ============ Setter 方法（Spring 通过反射调用实现 set 注入） ============
    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    // ============ Getter 方法 ============
    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getIdentity() {
        return identity;
    }

    // ============ 重写 toString，便于打印输出 ============
    @Override
    public String toString() {
        return "用户注册信息：账号=" + account + "，密码=" + password + "，身份=" + identity;
    }
}