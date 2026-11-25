package com.zsy.service;


import com.zsy.entity.User;

public interface UserService {

    //登录
    public User login(String username, String password);
}
