package com.mapper;

import com.beans.Classa;

public interface ClassMapper {
    //alt enter 传入tid，取到机房和老师信息
    public Classa getClassaByTid(int tid);
}