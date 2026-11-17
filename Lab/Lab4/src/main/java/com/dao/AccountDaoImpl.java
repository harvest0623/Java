package com.dao;

import com.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * DAO 实现：使用 JdbcTemplate 操作数据库
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;  // Spring 自动注入

    @Override
    public void addMoney(int id, double money) {
        String sql = "UPDATE account SET money = money + ? WHERE id = ?";
        int rows = jdbcTemplate.update(sql, money, id);
        System.out.println("  -> DAO.addMoney(id=" + id + ", money=" + money
                + ") 影响行数: " + rows);
    }

    @Override
    public void reduceMoney(int id, double money) {
        String sql = "UPDATE account SET money = money - ? WHERE id = ?";
        int rows = jdbcTemplate.update(sql, money, id);
        System.out.println("  -> DAO.reduceMoney(id=" + id + ", money=" + money
                + ") 影响行数: " + rows);
    }
}