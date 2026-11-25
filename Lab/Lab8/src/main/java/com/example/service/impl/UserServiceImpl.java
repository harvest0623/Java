package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User Service 实现类
 */
@Service
@Transactional  // 开启 Spring 声明式事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean register(User user) {
        // 先检查用户名是否已存在
        if (existsUsername(user.getUsername())) {
            return false;
        }
        return userMapper.insertUser(user) > 0;
    }

    @Override
    @Transactional(readOnly = true)  // 查询方法只读，提升性能
    public boolean existsUsername(String username) {
        return userMapper.countByUsername(username) > 0;
    }
}