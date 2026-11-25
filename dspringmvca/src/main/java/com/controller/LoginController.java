package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

//控制层
@Controller
public class LoginController {
    @RequestMapping("/go")
    public String go(){
        return "go";
    }

    @RequestMapping("/tolo")
    public String toLogin(){
        return "login";
    }

    //路径识别
    @RequestMapping("/logina")
    public String logina(String username, String password, HttpSession session){
        //参数名要对应到页面上的名
        if(username.equals("admin")
                && password.equals("admin")){
            session.setAttribute("userLogin", username);
            return "home";
        }else{
            return "login";
        }
    }
}