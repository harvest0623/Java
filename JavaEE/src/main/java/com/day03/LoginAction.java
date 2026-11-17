package com.day03;

public class LoginAction {
    public LoginImpl getLoginImpl(){
        return loginImpl;
    }

    // set 赋值
    public void setLoginImpl(LoginImpl loginImpl){
        this.loginImpl = loginImpl;
    }
    LoginImpl loginImpl;

    // 按钮
    public void login(){
        loginImpl.check();
    }
}
