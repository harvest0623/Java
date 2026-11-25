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
    <title>登录失败</title>
    <style>
        body {
            font-family: "Microsoft YaHei", sans-serif;
            background: linear-gradient(135deg, #ff9a9e 0%, #fad0c4 100%);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        .result-box {
            background: #fff;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 15px 30px rgba(0,0,0,0.2);
            text-align: center;
        }
        .fail-icon {
            font-size: 80px;
            color: #ff4d4f;
        }
        h1 {
            color: #333;
            margin: 20px 0 10px;
        }
        p {
            color: #666;
            font-size: 16px;
        }
        a {
            display: inline-block;
            margin-top: 30px;
            padding: 10px 30px;
            background: #ff4d4f;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background: #d9363e;
        }
    </style>
</head>
<body>
<div class="result-box">
    <div class="fail-icon">✗</div>
    <h1>😢 登录失败</h1>
    <p>用户名或密码错误，请重新输入！</p>
    <p>正确账号：admin / 123445</p>
    <a href="${pageContext.request.contextPath}/login.jsp">返回登录</a>
</div>
</body>
</html>