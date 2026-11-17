package com.service;

/**
 * Service 接口：转账业务
 */
public interface AccountService {

    /**
     * 转账
     * @param fromId 转出账户ID
     * @param toId   转入账户ID
     * @param money  转账金额
     */
    void transfer(int fromId, int toId, double money);
}