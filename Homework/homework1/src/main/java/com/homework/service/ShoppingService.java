package com.homework.service;

import com.homework.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务层：购物结算
 * 使用 Spring @Transactional 注解实现声明式事务管理
 * 事务四大特性 ACID：进账和出账要么都成功，要么都回滚
 */
@Service
public class ShoppingService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 正常购物场景：买家扣钱 → 商家加钱
     * propagation = Propagation.REQUIRED 是默认值，表示加入当前事务
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void buyProduct(String buyerName, String merchantName, double price) {
        // 步骤1：买家出账
        accountDao.outMoney(buyerName, price);

        // 步骤2：模拟业务处理（无异常）
        System.out.println("步骤2：商品发货...");

        // 步骤3：商家进账
        accountDao.inMoney(merchantName, price);

        System.out.println("购物完成！买家：" + buyerName
                + "，商家：" + merchantName + "，金额：" + price);
    }

    /**
     * 异常购物场景：演示事务回滚
     * 在出账后、进账前抛出异常，Spring 会自动回滚整个事务
     * —— 体现数据一致性：买家不会白扣钱
     */
    @Transactional(propagation = Propagation.REQUIRED,
            rollbackFor = Exception.class)
    public void buyProductWithException(String buyerName, String merchantName, double price) {
        // 步骤1：买家出账
        accountDao.outMoney(buyerName, price);

        // 步骤2：模拟中途发生异常（例如网络中断、商家账户冻结等）
        System.out.println("步骤2：发生异常！模拟网络错误...");
        throw new RuntimeException("模拟系统异常，事务应该回滚！");

        // 下面的代码不会执行
        // accountDao.inMoney(merchantName, price);
    }
}