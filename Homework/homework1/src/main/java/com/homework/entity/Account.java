package com.homework.entity;

/**
 * 用户/商家账户实体
 */
public class Account {
    private Integer id;
    private String  username;   // 用户名
    private String  password;   // 密码
    private String  account;    // 账号
    private String  role;       // 角色：USER / MERCHANT
    private Double  balance;    // 余额

    public Account() {}

    public Account(Integer id, String username, String password,
                   String account, String role, Double balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.account = account;
        this.role = role;
        this.balance = balance;
    }

    public Integer getId()      { return id; }
    public void   setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void   setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void   setPassword(String password) { this.password = password; }

    public String getAccount()  { return account; }
    public void   setAccount(String account) { this.account = account; }

    public String getRole()     { return role; }
    public void   setRole(String role) { this.role = role; }

    public Double getBalance()  { return balance; }
    public void   setBalance(Double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "Account{id=" + id + ", username='" + username + '\''
                + ", account='" + account + '\''
                + ", role='" + role + '\''
                + ", balance=" + balance + '}';
    }
}