package com.zsy.controller;

import com.zsy.entity.User;
import com.zsy.service.UserService;
import com.zsy.util.CommonResult;
import com.zsy.util.WebUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("login")
    public CommonResult login(String username, String password){
        User u = us.login(username, password);
        if(u!=null) {
            //session--进入其它页面，方便验证
            HttpSession session = WebUitl.getSession();
            session.setAttribute("user",u);
            return new CommonResult(2000, "登录成功", null);
        }
        return new CommonResult(5000,"登录失败",null);
    }

    @RequestMapping("quit")
    public void quit(){
        HttpSession session = WebUitl.getSession();
        session.removeAttribute("user");
    }
}
