package example.case1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 案例1测试运行类
 * 获取 Bean 并执行修改用户信息
 */
public class TestCase1 {
    public static void main(String[] args) {
        // 1. 加载 Spring 配置文件，创建容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-case1.xml");

        // 2. 从容器中获取 Bean
        UserService userService = (UserService) ctx.getBean("userService");

        // 3. 执行修改信息
        userService.modifyUserInfo(1, "newEmail@example.com", "13900139000");

        // 4. 关闭容器
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}