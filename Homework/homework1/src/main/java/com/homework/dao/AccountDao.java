package com.homework.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 数据访问层：直接操作数据库
 */
@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 出账：从指定用户名账户扣款（买家减钱）
     * @param username 用户名
     * @param money    扣款金额
     */
    public void outMoney(String username, double money) {
        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        jdbcTemplate.update(sql, money, username);
        System.out.println("【出账】用户 " + username + " 扣款 " + money + " 元");
    }

    /**
     * 进账：给指定用户名账户加款（商家加钱）
     * @param username 用户名
     * @param money    收款金额
     */
    public void inMoney(String username, double money) {
        String sql = "UPDATE account SET balance = balance + ? WHERE username = ?";
        jdbcTemplate.update(sql, money, username);
        System.out.println("【进账】用户 " + username + " 收款 " + money + " 元");
    }
}