package org.example.mapper;

import org.example.entity.User;

import java.util.List;

/**
 * 用户表 Mapper 接口
 */
public interface UserMapper {

    /** 根据ID查询用户 */
    User findById(Integer id);

    /** 查询所有用户 */
    List<User> findAll();
}