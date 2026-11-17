package com.day043;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    public void loginB(){
        System.out.println("使用前置通知：记录日志");
    }
    public void loginAfter(){
        System.out.println("使用后置通知：记录日志");
    }
    public Object aro(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        Object pro = joinPoint.proceed();
        System.out.println("环绕通知结束");
        return pro;
    }
}
