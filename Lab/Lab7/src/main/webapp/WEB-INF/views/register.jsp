<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>默认类型数据绑定</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f9f9f9; padding: 30px; }
        .container { max-width: 500px; margin: 0 auto; background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h2 { color: #333; }
        label { display: block; margin-top: 10px; font-weight: bold; }
        input[type="text"], input[type="password"], input[type="number"], input[type="email"] { width: 100%; padding: 10px; margin: 5px 0; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        input[type="submit"] { width: 100%; padding: 10px; background: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer; margin-top: 15px; }
        .back { display: inline-block; margin-top: 15px; color: #2196F3; text-decoration: none; }
    </style>
</head>
<body>
<div class="container">
    <h2>① 默认类型数据绑定（对象绑定）</h2>
    <p style="color:#666; font-size:14px;">SpringMVC会自动将表单参数绑定到User对象的同名属性上</p>

    <form action="${pageContext.request.contextPath}/doRegister" method="post">
        <label>用户名：</label>
        <input type="text" name="username" placeholder="请输入用户名" required/>

        <label>密码：</label>
        <input type="password" name="password" placeholder="请输入密码" required/>

        <label>年龄：</label>
        <input type="number" name="age" placeholder="请输入年龄" required/>

        <label>邮箱：</label>
        <input type="email" name="email" placeholder="请输入邮箱"/>

        <label>分数：</label>
        <input type="number" step="0.1" name="score" placeholder="请输入分数"/>

        <input type="submit" value="提交注册"/>
    </form>

    <a class="back" href="${pageContext.request.contextPath}/welcome">← 返回首页</a>
</div>
</body>
</html>