package com.zsy.dao;

import com.zsy.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //条件查询
    User byNameAndPsd(@Param("username") String username,
                      @Param("password") String password);

}