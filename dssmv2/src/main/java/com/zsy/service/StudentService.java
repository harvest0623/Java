package com.zsy.service;

import com.github.pagehelper.PageInfo;
import com.zsy.entity.Student;

import java.util.Map;


public interface StudentService {

    //查询
    public PageInfo<Student> selectAll(Integer currenPage, Integer pageSize, Map map);

    //添加
    Student ins(Student s);

    //删除
    Integer del(Integer id);

    //修改
    Student upd(Student s);
}
