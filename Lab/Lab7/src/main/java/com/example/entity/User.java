package com.example.entity;

/**
 * 用户实体类
 * 用于演示SpringMVC的默认类型数据绑定（对象绑定）
 */
public class User {
    private String username;   // 用户名
    private String password;   // 密码
    private Integer age;       // 年龄（基本类型包装类）
    private String email;      // 邮箱
    private Double score;      // 分数（基本类型包装类）

    public User() {
    }

    public User(String username, String password, Integer age, String email, Double score) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.score = score;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", score=" + score +
                '}';
    }
}