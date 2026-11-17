package com.hh.innerclass3;

import javax.swing.*;

public class Test03
{
    public static void main(String[] args)
    {
        //匿名内部类的使用场景
        JFrame win = new JFrame("登录窗口");
        JPanel panel = new JPanel();
        panel.add(new JLabel("用户名："));
        JButton btn = new JButton("登录");
        win.add(btn);
        win.setSize(400,300);
        win.setLocationRelativeTo(null); //居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //退出程序
        win.setVisible(true); //显示窗口
    }
}
