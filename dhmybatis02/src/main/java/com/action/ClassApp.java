package com.action;

import com.beans.Classa;
import com.mapper.ClassMapper;
import com.util.DBT;
import org.apache.ibatis.session.SqlSession;

public class ClassApp {
    public void getClassaByTid() {
        SqlSession sqlSession = DBT.getSession();
        ClassMapper mapper = sqlSession.getMapper(com.mapper.ClassMapper.class);
        Classa classa = mapper.getClassaByTid(2);
        System.out.println(classa.getCid() + " " + classa.getCname() + " "
                + classa.getTeachera().getTid() + " "
                + classa.getTeachera().getTname());
    }
    public static void main(String[] args) {
        ClassApp classApp = new ClassApp();
        classApp.getClassaByTid();
    }
}
