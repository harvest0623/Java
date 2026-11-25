package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 * 处理登录、登出相关请求
 */
@Controller
public class LoginController {

    /**
     * 显示登录页面
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login";  // 返回 /WEB-INF/views/login.jsp
    }

    /**
     * 处理登录请求 - 基本类型数据绑定（@RequestParam）
     * 演示使用@RequestParam注解绑定单个参数
     */
    @PostMapping("/doLogin")
    public String doLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,
            HttpSession session) {

        // 简单的登录验证（实际项目中应查询数据库）
        if ("admin".equals(username) && "123456".equals(password)) {
            // 登录成功，创建User对象存入Session
            User loginUser = new User();
            loginUser.setUsername(username);
            loginUser.setPassword(password);
            session.setAttribute("loginUser", loginUser);
            return "redirect:/welcome";  // 重定向到欢迎页
        } else {
            // 登录失败，返回登录页并提示错误
            model.addAttribute("error", "用户名或密码错误！");
            return "login";
        }
    }

    /**
     * 处理登出请求
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 清除Session中的用户信息
        session.invalidate();
        return "redirect:/login";
    }
}