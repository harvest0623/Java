package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccImpl implements AccDao {

    public JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void out(String outUser, int money) {
        String sql = "update account set money = money - " + money + " where userName = '" + outUser + "'";
        System.out.println("[DAO-out] 执行SQL: " + sql);
        jdbcTemplate.execute(sql);
    }

    @Override
    public void in(String inUser, int money) {
        String sql = "update account set money = money + " + money + " where userName = '" + inUser + "'";
        System.out.println("[DAO-in] 执行SQL: " + sql);
        jdbcTemplate.execute(sql);
    }
}