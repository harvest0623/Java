package com.zsy.service;

import com.github.pagehelper.PageInfo;
import com.zsy.entity.Attendance;

import java.util.Map;

public interface AttendanceService {

    //查询
    PageInfo<Attendance> selectAll(Integer currenPage, Integer pageSize, Map map);

    //添加
    Attendance ins(Attendance a);

    //删除
    Integer del(Integer id);

    //修改
    Attendance upd(Attendance a);
}
