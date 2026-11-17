package com.dao;

/**
 * DAO 接口：定义账户表的数据库操作
 */
public interface AccountDao {

    /**
     * 转入：给指定 id 的账户加钱
     * @param id    账户ID
     * @param money 转账金额
     */
    void addMoney(int id, double money);

    /**
     * 转出：给指定 id 的账户减钱
     * @param id    账户ID
     * @param money 转账金额
     */
    void reduceMoney(int id, double money);
}