package com.entity;

/**
 * 账户实体类
 */
public class Account {
    private int    id;     // 账户ID
    private String name;   // 账户名
    private double money;  // 余额

    public Account() {}

    public Account(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    // ---------- getter / setter ----------
    public int getId()    { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMoney() { return money; }
    public void setMoney(double money) { this.money = money; }

    @Override
    public String toString() {
        return "Account{id=" + id + ", name='" + name + "', money=" + money + '}';
    }
}