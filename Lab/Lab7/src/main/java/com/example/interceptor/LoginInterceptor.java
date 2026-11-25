package com.example.interceptor;

import com.example.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 * 对于未登录的页面访问进行拦截，跳转到登录页面
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     * 返回true：放行，继续执行下一个拦截器或Controller
     * 返回false：拦截，不继续执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取Session
        HttpSession session = request.getSession();
        // 从Session中获取用户登录信息
        User loginUser = (User) session.getAttribute("loginUser");

        if (loginUser == null) {
            // 未登录，重定向到登录页面
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }

        // 已登录，放行
        return true;
    }

    /**
     * 请求处理之后、视图渲染之前调用
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 这里可以添加一些公共模型数据
    }

    /**
     * 整个请求完成之后调用（视图渲染完成后）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 资源清理等操作
    }
}