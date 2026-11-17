package com.homework.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Spring 核心配置类（完全注解方式，无 XML）
 * 开启事务管理 @EnableTransactionManagement
 */
@Configuration
@ComponentScan("com.homework")
@EnableTransactionManagement    // 开启 Spring 声明式事务管理
@EnableAspectJAutoProxy         // 开启 AOP 代理（事务基于 AOP 实现）
public class SpringConfig {

    /** 1. 配置数据源（Druid 连接池） */
    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/homework1?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8");
        ds.setUsername("root");
        ds.setPassword("huang426523");  // 请改成你自己的 MySQL 密码
        ds.setInitialSize(5);
        ds.setMaxActive(20);
        return ds;
    }

    /** 2. 配置 JdbcTemplate，用于执行 SQL */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /** 3. 配置事务管理器：Spring 事务的核心，绑定数据源 */
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}