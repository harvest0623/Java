package com.test;

import com.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 事务回滚测试主类
 *
 * 对比：
 *   - 有 @Transactional 时：抛异常 → 两笔操作都回滚 → 数据库金额不变 ✔
 *   - 没有事务管理时：  抛异常 → 第一笔已提交、第二笔未执行 → 钱丢失 ❌
 */
public class TransactionTest {

    public static void main(String[] args) {
        // 加载 Spring 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        AccountService service = ctx.getBean(AccountService.class);

        // 初始余额：张三 1000，李四 1000；总金额应始终 = 2000
        System.out.println("===== 转账前（请先确认数据库里张三=1000, 李四=1000）=====");

        try {
            // 张三(ID=1) 给 李四(ID=2) 转 100 元
            service.transfer(1, 2, 100);
        } catch (Exception e) {
            System.out.println("\n❌ 捕获到异常: " + e.getClass().getSimpleName()
                    + " —— 但由于事务的原子性，钱没有真正转走！");
        }

        System.out.println("\n===== 转账后：请去数据库验证 =====");
        System.out.println("预期结果（有事务）：张三仍=1000，李四仍=1000，总金额不变 ✔");
        System.out.println("如果没加 @Transactional：张三=900，李四=1000，钱消失 ❌");

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}