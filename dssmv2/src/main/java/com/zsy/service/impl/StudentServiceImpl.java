package com.zsy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsy.dao.StudentMapper;
import com.zsy.entity.Student;
import com.zsy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper sm;

    //查询
    public PageInfo<Student> selectAll(Integer currenPage, Integer pageSize, Map map) {
        //当前第几页，一页多少条
        PageHelper.startPage(currenPage,pageSize);
        /*select * from student
         * select * from student limit 1,5
         * select * from student limit 6,5
         * */
        List<Student> all = sm.findAll(map);
        PageInfo<Student> pageInfo = new PageInfo<Student>(all);
        return pageInfo;//按分页后查好的结果
    }


    //删除
    public Integer del(Integer id) {
        int i = sm.deleteByPrimaryKey(id);
        return id;
    }

    //修改
    public Student upd(Student s) {
        int i = sm.updateByPrimaryKey(s);
        return s;
    }

    //添加
    public Student ins(Student s) {
        int i = sm.insert(s);
        return s;
    }
}
