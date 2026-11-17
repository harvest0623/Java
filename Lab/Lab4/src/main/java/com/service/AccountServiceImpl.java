package com.service;

import com.dao.AccountDao;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service 实现：业务方法 + @Transactional 事务管理
 *
 * 事务的四大特性（ACID）在此体现：
 *  - Atomicity（原子性）：两个操作要么都成功，要么都回滚
 *  - Consistency（一致性）：转账前后总金额不变
 *  - Isolation（隔离性）：多事务互不干扰
 *  - Durability（持久性）：提交后永久保存
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED)   // 类级别：默认读已提交
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账业务方法：
     *   1. 先扣钱（fromId）
     *   2. 再加钱（toId）
     *
     *   如果第 2 步抛出 RuntimeException，则整个方法回滚，
     *   第 1 步已经扣掉的钱也会恢复 —— 这就是事务的原子性。
     */
    @Override
    @Transactional(
            isolation   = Isolation.READ_COMMITTED,          // 隔离级别
            propagation = Propagation.REQUIRED,              // 传播行为（默认，加入当前事务）
            rollbackFor = RuntimeException.class               // 指定回滚异常（默认就是这个，显式写出来便于理解）
    )
    public void transfer(int fromId, int toId, double money) {
        System.out.println("[Service] 开始转账: from=" + fromId + " -> to=" + toId
                + " 金额=" + money);

        // 步骤 1：转出
        accountDao.reduceMoney(fromId, money);

        // ========== 模拟异常（演示事务回滚） ==========
        // 此处抛出 RuntimeException，转账过程中任何一点异常都会触发事务回滚
        // 把下面这一行注释掉，就是正常转账
        // int i = 1 / 0;   // ArithmeticException 是 RuntimeException 的子类
        // ===============================================

        // 步骤 2：转入
        accountDao.addMoney(toId, money);

        System.out.println("[Service] 转账完成 ✔");
    }
}