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
    <title>登录成功</title>
    <style>
        body {
            font-family: "Microsoft YaHei", sans-serif;
            background: linear-gradient(135deg, #84fab0 0%, #8fd3f4 100%);
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
        .success-icon {
            font-size: 80px;
            color: #52c41a;
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
            background: #52c41a;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background: #3f9e14;
        }
    </style>
</head>
<body>
<div class="result-box">
    <div class="success-icon">✓</div>
    <h1>🎉 登录成功！</h1>
    <p>欢迎来到读书会，admin！</p>
    <p>愿每一次阅读都是一次心灵的旅行 📖</p>
    <a href="${pageContext.request.contextPath}/login.jsp">返回登录</a>
</div>
</body>
</html>