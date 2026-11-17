package com.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类 —— 演示 Spring IoC 容器获取 Bean 并执行用户注册信息打印
 */
public class TestMain {

    public static void main(String[] args) {
        // ============ 1. 加载 Spring 配置文件，创建 IoC 容器 ============
        // ClassPathXmlApplicationContext: 从 classpath（即 src/main/resources）加载 XML 配置
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // ============ 2. 从 IoC 容器中获取 Bean ============
        // 方式一：根据 id 获取（需要强转）
        // User user = (User) context.getBean("user");

        // 方式二：根据类型获取（推荐，类型安全）
        User user = context.getBean(User.class);

        // ============ 3. 执行用户注册信息打印 ============
        System.out.println("========== 用户注册信息输出 ==========");
        System.out.println(user);  // 调用重写后的 toString()
        System.out.println("======================================");

        // ============ 4. 关闭容器（释放资源） ============
        ((ClassPathXmlApplicationContext) context).close();
    }
}