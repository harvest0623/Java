package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户控制器
 * 演示默认类型数据绑定和基本类型数据绑定
 */
@Controller
public class UserController {

    /**
     * 欢迎页面（登录后首页）
     */
    @GetMapping("/welcome")
    public String welcome(HttpServletRequest request, Model model) {
        // 获取登录用户信息
        Object loginUser = request.getSession().getAttribute("loginUser");
        model.addAttribute("loginUser", loginUser);
        return "welcome";  // 返回 /WEB-INF/views/welcome.jsp
    }

    /**
     * 显示注册页面
     */
    @GetMapping("/register")
    public String registerPage() {
        return "register";  // 返回 /WEB-INF/views/register.jsp
    }

    /**
     * 处理注册请求 - 方式1：默认类型数据绑定（对象绑定）
     * SpringMVC会自动将表单参数绑定到User对象的属性上
     */
    @PostMapping("/doRegister")
    public String doRegister(User user, Model model) {
        // 直接使用绑定好的User对象
        model.addAttribute("user", user);
        model.addAttribute("msg", "默认类型数据绑定成功！");
        return "result";  // 返回 /WEB-INF/views/result.jsp
    }

    /**
     * 演示基本类型数据绑定 - 使用@RequestParam逐个参数绑定
     * 基本类型包括：int, double, boolean, String, Integer, Double等包装类
     */
    @GetMapping("/basicBinding")
    public String basicBinding(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("score") double score,
            @RequestParam(value = "vip", defaultValue = "false") boolean vip,
            Model model) {

        // 将绑定的基本类型参数放入Model
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("score", score);
        model.addAttribute("vip", vip);
        model.addAttribute("msg", "基本类型数据绑定成功！");

        return "basicResult";  // 返回 /WEB-INF/views/basicResult.jsp
    }

    /**
     * 演示简单计算（基本类型int/double绑定）
     */
    @GetMapping("/calc")
    public String calc(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2,
            Model model) {

        int sum = num1 + num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("sum", sum);
        model.addAttribute("msg", "计算完成！");

        return "calcResult";  // 返回 /WEB-INF/views/calcResult.jsp
    }
}