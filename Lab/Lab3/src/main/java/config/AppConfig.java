package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring 配置类 - 启用注解式 IOC 和 AOP
 */
@EnableAspectJAutoProxy  // 启用 AOP 自动代理
@ComponentScan(basePackages = {"service", "aspect"})  // 扫描 Bean 包
public class AppConfig {

}