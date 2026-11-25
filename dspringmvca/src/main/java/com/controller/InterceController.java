package com.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//拦截器 HandlerInterceptor 拦截器接口
public class InterceController implements HandlerInterceptor {
    //希望在请求处理之前进行调用（Controller方法调用之前）
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        //获取请求的url
        System.out.println("pre");
        HttpSession session = request.getSession();
        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        //如果没有，则返回false，取消当前请求  userLogin自己取的名
        if(session.getAttribute("userLogin")!=null) {
            return true;
        }
        //登陆页面是须要拦截，true
        if(request.getRequestURI().indexOf("/tolo") >= 0) {
            return true;
        }
        //如果没有，则跳转到登陆页面
        request.getRequestDispatcher("/login.jsp")
                .forward(request, response);
        return false;
    }
}