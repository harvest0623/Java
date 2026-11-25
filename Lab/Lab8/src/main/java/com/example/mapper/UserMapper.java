package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * User Mapper 接口 —— 对应 UserMapper.xml
 */
public interface UserMapper {

    /** 新增用户 */
    int insertUser(User user);

    /** 根据用户名查询 */
    User selectByUsername(@Param("username") String username);

    /** 检查用户名是否已存在 */
    int countByUsername(@Param("username") String username);
}