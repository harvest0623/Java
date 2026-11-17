package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 日志切面类 - 实现前置、后置、环绕、异常通知
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 定义切入点：匹配 service 包下所有类的 print() 方法
     */
    @Pointcut("execution(* service.FoodService.print(..))")
    public void printPointcut() {
    }

    /**
     * 前置通知：在目标方法执行前输出日志
     */
    @Before("printPointcut()")
    public void beforeLog() {
        System.out.println("先有鸡");
    }

    /**
     * 后置正常返回通知：目标方法正常返回后输出日志
     */
    @AfterReturning("printPointcut()")
    public void afterReturningLog() {
        System.out.println("后有蛋");
    }

    /**
     * 异常通知：目标方法抛出异常时输出日志
     */
    @AfterThrowing("printPointcut()")
    public void afterThrowingLog() {
        System.out.println("鸡蛋碎了");
    }

    /**
     * 最终通知：目标方法执行后（无论成功或异常）输出日志
     */
    @After("printPointcut()")
    public void afterLog() {
        // 可以在目标方法结束后做一些清理工作
    }

    /**
     * 环绕通知：包裹目标方法，控制执行过程
     */
    @Around("printPointcut()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[环绕通知-进入]");
        Object result;
        try {
            result = pjp.proceed();  // 执行目标方法
        } catch (Throwable e) {
            System.out.println("[环绕通知-捕获异常]");
            throw e;
        }
        System.out.println("[环绕通知-退出]");
        return result;
    }
}