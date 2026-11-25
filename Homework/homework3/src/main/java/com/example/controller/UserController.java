package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户控制器
 * 处理读书会登录相关请求
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 处理登录请求
     * @param user Spring MVC 会自动将表单参数封装到 User 对象中
     * @return 视图名称（逻辑视图名，由视图解析器解析为 /success.jsp 或 /fail.jsp）
     */
    @RequestMapping("/login")
    public String login(User user) {
        // 获取表单提交的用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();

        // 控制台打印，方便调试
        System.out.println("用户提交登录：username = " + username + ", password = " + password);

        // 校验用户名和密码是否正确（admin / 123445）
        if ("admin".equals(username) && "123445".equals(password)) {
            // 登录成功，跳转到成功页面
            return "success";
        } else {
            // 登录失败，跳转到失败页面
            return "fail";
        }
    }
}