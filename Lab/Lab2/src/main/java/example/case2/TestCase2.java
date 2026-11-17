package example.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 案例2测试运行类
 * 获取 Bean，执行支付和用户信息打印
 */
public class TestCase2 {
    public static void main(String[] args) {
        // 1. 加载 Spring 配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-case2.xml");

        // 2. 获取 User2 Bean 并打印注册信息
        User2 user = (User2) ctx.getBean("user2");
        user.printRegisterInfo();
        System.out.println();

        // 3. 获取 PaymentService Bean，执行支付
        PaymentService paymentService = (PaymentService) ctx.getBean("paymentService");
        paymentService.pay(2000.00);

        // 4. 关闭容器
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}