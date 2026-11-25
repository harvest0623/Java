package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户 Controller —— 处理注册请求、服务器端验证、单文件上传
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 文件保存目录（项目根目录下的 upload 文件夹）
    private static final String UPLOAD_DIR = System.getProperty("user.dir")
            + File.separator + "src" + File.separator + "main"
            + File.separator + "webapp" + File.separator + "upload";

    /**
     * 1. 进入注册页面
     */
    @GetMapping("/toRegister")
    public String toRegister(Model model) {
        model.addAttribute("user", new User());  // 让表单支持回显
        return "register";
    }

    /**
     * 2. 处理注册（带服务器端 Bean Validation 验证 + 文件上传）
     *
     * @Valid 触发 User.java 中的约束注解验证
     * BindingResult 接收验证结果（必须紧跟 @Valid 参数之后）
     */
    @PostMapping("/register")
    public String register(@Valid User user,
                           BindingResult bindingResult,
                           @RequestParam(value = "avatar", required = false) MultipartFile avatar,
                           Model model) {

        // ---- A. 处理 Bean Validation 验证错误 ----
        if (bindingResult.hasErrors()) {
            // 将所有错误信息放进 model，页面通过 EL 表达式显示
            model.addAttribute("errors", bindingResult.getFieldErrors());
            model.addAttribute("user", user);  // 数据回显
            return "register";                  // 返回注册页
        }

        // ---- B. 处理单文件上传 ----
        if (avatar != null && !avatar.isEmpty()) {
            try {
                // 生成唯一文件名（UUID + 原扩展名），防止重名覆盖
                String originalFilename = avatar.getOriginalFilename();
                String ext = originalFilename != null && originalFilename.contains(".")
                        ? originalFilename.substring(originalFilename.lastIndexOf("."))
                        : ".jpg";
                String newFilename = UUID.randomUUID().toString().replace("-", "") + ext;

                // 保证 upload 目录存在
                File dir = new File(UPLOAD_DIR);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // 保存文件到磁盘
                File dest = new File(dir, newFilename);
                avatar.transferTo(dest);

                // 保存到用户对象
                user.setFileName(newFilename);
                user.setFilePath("upload/" + newFilename);

            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("errorMsg", "文件上传失败：" + e.getMessage());
                return "register";
            }
        }

        // ---- C. 检查用户名重复 ----
        if (userService.existsUsername(user.getUsername())) {
            model.addAttribute("errorMsg", "用户名 '" + user.getUsername() + "' 已存在！");
            return "register";
        }

        // ---- D. 调用 Service 注册 ----
        boolean success = userService.register(user);
        if (success) {
            model.addAttribute("successMsg", "注册成功！");
            model.addAttribute("registeredUser", user);
            return "result";
        } else {
            model.addAttribute("errorMsg", "注册失败，请稍后重试！");
            return "register";
        }
    }

    /**
     * 3. REST 风格：AJAX 校验用户名是否可用
     */
    @GetMapping("/check/{username}")
    @ResponseBody  // 返回 JSON
    public Map<String, Object> checkUsername(@PathVariable String username) {
        boolean exists = userService.existsUsername(username);
        // 使用 Map 快速构造 JSON 响应
        java.util.Map<String, Object> result = new java.util.HashMap<>();
        result.put("valid", !exists);           // true = 可用
        result.put("msg", exists ? "用户名已存在" : "用户名可用");
        return result;  // 被 Jackson 自动序列化为 JSON
    }
}