package com.zsy.controller;

import com.github.pagehelper.PageInfo;
import com.zsy.entity.Student;
import com.zsy.service.StudentService;
import com.zsy.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("Student")
public class StudentController {

    @Autowired
    private StudentService ss;

    //查询
    @RequestMapping("select")
    public CommonResult select(Integer currenPage,
                               Integer pageSize, Map map){
        //当前第几页，一页多少条
        //select * from student limit 6,5
        PageInfo<Student> pageInfo = ss.selectAll(currenPage, pageSize, map);
        //pageInfo含了数据
        //user6(id name,)
        //user7(id,name,)
        return new CommonResult(2000,"查询成功",pageInfo);
    }

    //下拉框：查询全部员工（考勤选择员工用）
    @RequestMapping("list")
    public CommonResult list(Map map) {
        PageInfo<Student> pageInfo = ss.selectAll(1, 1000, map);
        return new CommonResult(2000, "查询成功", pageInfo.getList());
    }

    //添加
    @RequestMapping("insert")
    public CommonResult insert(Student s){
        Student insert = ss.ins(s);
        return new CommonResult(2000,"添加成功",null);
    }

    //删除
    @RequestMapping("delete")
    public CommonResult delete(Integer id){
        Integer delete = ss.del(id);
        return new CommonResult(2000,"删除成功",null);
    }

    //修改
    @RequestMapping("update")
    public CommonResult update(Student s){
        Student upd = ss.upd(s);
        return new CommonResult(2000,"修改成功",null);
    }
}
