<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/19
  Time: 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .container { max-width: 400px; margin: auto; padding: 20px; border: 1px solid #ccc; border-radius: 5px; }
        h2 { text-align: center; color: #333; }
        .form-group { margin-bottom: 15px; }
        label { display: inline-block; width: 80px; text-align: right; margin-right: 10px; }
        input[type="text"], input[type="password"], input[type="email"] { width: 250px; padding: 5px; }
        .radio-group { display: inline-block; vertical-align: top; }
        .radio-group div { margin: 3px 0; }
        .submit-btn { text-align: center; margin-top: 20px; }
        input[type="submit"] { padding: 8px 30px; font-size: 16px; }
    </style>
</head>
<body>
<div class="container">
    <h1>这是C5zhuce.jsp页面</h1>
    <h2>请输入注册信息</h2>
    <form action="C5dozhuce.jsp" method="post">
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" name="username" required>
        </div>
        <div class="form-group">
            <label>密码：</label>
            <input type="password" name="password" required>
        </div>
        <div class="form-group">
            <label>确认密码：</label>
            <input type="password" name="confirmPassword" required>
        </div>
        <div class="form-group">
            <label>邮箱：</label>
            <input type="email" name="email" required>
        </div>
        <div class="form-group">
            <label>院系：</label>
            <div class="radio-group">
                <div><input type="radio" name="department" value="软件学院" checked> 软件学院</div>
                <div><input type="radio" name="department" value="信息工程学院"> 信息工程学院</div>
                <div><input type="radio" name="department" value="经济管理学院"> 经济管理学院</div>
                <div><input type="radio" name="department" value="理学院"> 理学院</div>
            </div>
        </div>
        <div class="submit-btn">
            <input type="submit" value="提交">
        </div>
    </form>
</div>
</body>
</html>
