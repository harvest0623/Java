package com.zsy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsy.dao.AttendanceMapper;
import com.zsy.entity.Attendance;
import com.zsy.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceMapper am;

    //查询
    public PageInfo<Attendance> selectAll(Integer currenPage, Integer pageSize, Map map) {
        PageHelper.startPage(currenPage, pageSize);
        List<Attendance> all = am.findAll(map);
        return new PageInfo<Attendance>(all);
    }

    //添加
    public Attendance ins(Attendance a) {
        if (a.getStatus() == null) {
            a.setStatus(0);
        }
        am.insert(a);
        return a;
    }

    //删除
    public Integer del(Integer id) {
        am.deleteByPrimaryKey(id);
        return id;
    }

    //修改
    public Attendance upd(Attendance a) {
        if (a.getStatus() == null) {
            a.setStatus(0);
        }
        am.updateByPrimaryKey(a);
        return a;
    }
}
