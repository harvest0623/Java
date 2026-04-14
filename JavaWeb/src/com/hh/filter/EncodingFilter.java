package com.hh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 编码过滤器，解决所有 POST 请求的中文乱码问题
 */
@WebFilter(filterName = "EncodingFilter", urlPatterns = "/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化方法，可用于加载配置
        System.out.println("EncodingFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 设置请求和响应的编码为 UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 继续执行过滤器链
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // 销毁方法，可用于释放资源
        System.out.println("EncodingFilter 销毁");
    }
}