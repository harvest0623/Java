<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>欢迎 - SpringMVC实验</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f9f9f9; padding: 30px; }
        .container { max-width: 800px; margin: 0 auto; background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h1 { color: #333; border-bottom: 2px solid #4CAF50; padding-bottom: 10px; }
        .user-info { background: #e7f3e7; padding: 15px; border-radius: 4px; margin: 15px 0; }
        .menu { list-style: none; padding: 0; }
        .menu li { margin: 10px 0; }
        .menu a { display: inline-block; padding: 10px 20px; background: #2196F3; color: white; text-decoration: none; border-radius: 4px; }
        .menu a:hover { background: #1976D2; }
        .logout { float: right; background: #f44336 !important; }
        .logout:hover { background: #d32f2f !important; }
    </style>
</head>
<body>
<div class="container">
    <h1>🎉 SpringMVC 基础应用实验</h1>

    <div class="user-info">
        <p>👋 欢迎您，<strong>${loginUser.username}</strong>！</p>
    </div>

    <h3>实验功能导航：</h3>
    <ul class="menu">
        <li>
            <a href="${pageContext.request.contextPath}/register">① 默认类型数据绑定（对象绑定）</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/basicBinding?name=张三&age=20&score=95.5&vip=true">② 基本类型数据绑定（带参数访问）</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/calc?num1=10&num2=20">③ 基本类型计算演示</a>
        </li>
    </ul>

    <p style="margin-top: 30px; padding-top: 20px; border-top: 1px solid #eee;">
        <a class="logout" href="${pageContext.request.contextPath}/logout">退出登录</a>
    </p>
</div>
</body>
</html>