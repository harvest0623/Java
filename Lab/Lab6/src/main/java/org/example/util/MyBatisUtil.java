package org.example.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis 工具类
 * 作用：读取 mybatis-config.xml，构建 SqlSessionFactory，提供 SqlSession
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    // 类加载时只初始化一次 SqlSessionFactory
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("MyBatis 配置文件加载失败！", e);
        }
    }

    /**
     * 获取一个新的 SqlSession
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 获取 SqlSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}