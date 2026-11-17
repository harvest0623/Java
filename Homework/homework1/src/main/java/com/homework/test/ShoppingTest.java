package com.homework.test;

import com.homework.config.SpringConfig;
import com.homework.service.ShoppingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类：演示 Spring 事务管理
 */
public class ShoppingTest {
    public static void main(String[] args) {
        // 加载 Spring 容器（注解配置）
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ShoppingService service = ctx.getBean(ShoppingService.class);

        System.out.println("========== 测试1：正常购物（事务提交）==========");
        // 买家 zhangsan 买东西，商家 lisi 收款，商品价 200
        try {
            service.buyProduct("zhangsan", "lisi", 200);
        } catch (Exception e) {
            System.out.println("捕获异常：" + e.getMessage());
        }

        System.out.println("\n========== 测试2：异常购物（事务回滚）==========");
        // 再次让 zhangsan 扣款 300，但中途抛出异常，预期回滚
        try {
            service.buyProductWithException("zhangsan", "lisi", 300);
        } catch (Exception e) {
            System.out.println("捕获异常：" + e.getMessage());
        }

        System.out.println("\n========== 请在数据库中查看 account 表余额 ==========");
        System.out.println("预期结果：zhangsan 扣了 200（测试2回滚），lisi 加了 200");

        ctx.close();
    }
}