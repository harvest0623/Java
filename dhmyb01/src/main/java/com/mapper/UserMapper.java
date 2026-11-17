package com.mapper;

import com.beans.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insertUser(User u);
    int updateUser(User u);
    int deleteUser(int id);
    public User selectA(String name, String password);
    public List<User> selectAll();
    public List<User> selectByIf(User u);
    public List<User> selectByChoose(User u);
    public int deleteByForeach(List<Integer> ids);
}