package com.zsy.dao;

import java.util.List;
import java.util.Map;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attendance record);

    int updateByPrimaryKey(Attendance record);

    List<Attendance> findAll(Map map);
}
