package com.service;

import com.dao.AccDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

public class AccServiceImpl implements AccService {
    public AccDao accDao;
    public void setAccDao(AccDao accDao) {
        this.accDao = accDao;
    }

    // 支持回滚，遇到不一致的情况，回滚事务，确保数据的一致性
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void trans(String outUser, String inUser, int money) {
        accDao.out(outUser, money);
        // int x = 2 / 0;  // 模拟异常
        accDao.in(inUser, money);
    }
}