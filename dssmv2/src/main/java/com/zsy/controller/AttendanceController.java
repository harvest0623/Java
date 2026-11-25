package com.zsy.controller;

import com.github.pagehelper.PageInfo;
import com.zsy.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("Attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService as;

    //查询（支持姓名、日期、状态筛选）
    @RequestMapping("select")
    public CommonResult select(Integer currenPage, Integer pageSize, Map map) {
        if (currenPage == null || currenPage < 1) {
            currenPage = 1;
        }
        if (pageSize == null || pageSize < 1) {
            pageSize = 10;
        }
        PageInfo<Attendance> pageInfo = as.selectAll(currenPage, pageSize, map);
        return new CommonResult(2000, "查询成功", pageInfo);
    }

    //添加
    @RequestMapping("insert")
    public CommonResult insert(Attendance a) {
        if (a.getEmpName() == null || a.getEmpName().isEmpty()
                || a.getWorkDate() == null || a.getWorkDate().isEmpty()) {
            return new CommonResult(5000, "员工姓名和考勤日期不能为空", null);
        }
        as.ins(a);
        return new CommonResult(2000, "添加成功", null);
    }

    //删除
    @RequestMapping("delete")
    public CommonResult delete(Integer id) {
        as.del(id);
        return new CommonResult(2000, "删除成功", null);
    }

    //修改
    @RequestMapping("update")
    public CommonResult update(Attendance a) {
        if (a.getEmpName() == null || a.getEmpName().isEmpty()
                || a.getWorkDate() == null || a.getWorkDate().isEmpty()) {
            return new CommonResult(5000, "员工姓名和考勤日期不能为空", null);
        }
        as.upd(a);
        return new CommonResult(2000, "修改成功", null);
    }
}
