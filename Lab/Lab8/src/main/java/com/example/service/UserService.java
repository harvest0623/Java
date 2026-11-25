package com.example.service;

import com.example.entity.User;

/**
 * User Service 接口
 */
public interface UserService {

    /** 注册用户 */
    boolean register(User user);

    /** 检查用户名是否存在 */
    boolean existsUsername(String username);
}