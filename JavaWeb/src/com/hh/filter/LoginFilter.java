package com.hh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录验证过滤器，拦截对 welcome.jsp 的访问，如果未登录则强制跳转到登录页
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = "/welcome.jsp")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化方法，可用于加载配置
        System.out.println("LoginFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 转换为 HttpServletRequest 和 HttpServletResponse
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 获取 session
        HttpSession session = httpRequest.getSession(false);

        // 检查是否已登录
        if (session == null || session.getAttribute("username") == null) {
            // 未登录，重定向到登录页
            httpResponse.sendRedirect("login.jsp");
            return;
        }

        // 已登录，继续执行过滤器链
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // 销毁方法，可用于释放资源
        System.out.println("LoginFilter 销毁");
    }
}