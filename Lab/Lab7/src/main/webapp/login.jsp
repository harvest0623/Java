<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录 - SpringMVC实验</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f0f0f0; text-align: center; padding-top: 100px; }
        .login-box { background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 300px; margin: 0 auto; }
        h2 { color: #333; }
        input[type="text"], input[type="password"] { width: 90%; padding: 10px; margin: 8px 0; border: 1px solid #ccc; border-radius: 4px; }
        input[type="submit"] { width: 100%; padding: 10px; background: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer; }
        input[type="submit"]:hover { background: #45a049; }
        .error { color: red; margin: 10px 0; }
    </style>
</head>
<body>
<div class="login-box">
    <h2>用户登录</h2>
    <form action="${pageContext.request.contextPath}/doLogin" method="post">
        <input type="text" name="username" placeholder="请输入用户名" required/><br/>
        <input type="password" name="password" placeholder="请输入密码" required/><br/>
        <input type="submit" value="登录"/>
    </form>
    <% if (request.getParameter("error") != null || request.getAttribute("error") != null) { %>
    <p class="error">${error}</p>
    <% } %>
    <p style="font-size:12px; color:#666; margin-top:15px;">
        测试账号：admin / 123456
    </p>
</div>
</body>
</html>