package com.zsy.service.impl;

import com.zsy.dao.UserMapper;
import com.zsy.entity.User;
import com.zsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper um;

    public User login(String username, String password) {
        User user = um.byNameAndPsd(username, password);

        return user;//如果有结果..
    }
}
