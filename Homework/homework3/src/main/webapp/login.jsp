<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读书会 - 用户登录</title>
    <style>
        body {
            font-family: "Microsoft YaHei", sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        .login-box {
            background: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 15px 30px rgba(0,0,0,0.2);
            width: 350px;
            text-align: center;
        }
        h2 {
            color: #333;
            margin-bottom: 30px;
        }
        .form-group {
            margin-bottom: 20px;
            text-align: left;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 14px;
        }
        input[type="text"]:focus, input[type="password"]:focus {
            border-color: #667eea;
            outline: none;
        }
        .btn-login {
            width: 100%;
            padding: 12px;
            background: #667eea;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            margin-top: 10px;
        }
        .btn-login:hover {
            background: #5568d3;
        }
        .tip {
            color: #999;
            font-size: 12px;
            margin-top: 15px;
        }
    </style>
</head>
<body>
<div class="login-box">
    <h2>📚 读书会登录</h2>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" name="username" placeholder="请输入用户名" required>
        </div>
        <div class="form-group">
            <label>密码：</label>
            <input type="password" name="password" placeholder="请输入密码" required>
        </div>
        <button type="submit" class="btn-login">登 录</button>
        <div class="tip">提示：用户名 admin，密码 123445</div>
    </form>
</div>
</body>
</html>