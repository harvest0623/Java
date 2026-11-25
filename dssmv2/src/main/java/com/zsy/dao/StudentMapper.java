package com.zsy.dao;


import com.zsy.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);



    int updateByPrimaryKey(Student record);

    List<Student> findAll(Map map);
}