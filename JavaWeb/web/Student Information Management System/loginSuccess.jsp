<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 09:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 检查是否已登录
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>登录成功</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Microsoft YaHei', Arial, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 20px;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .container {
            max-width: 500px;
            width: 100%;
            background: white;
            border-radius: 15px;
            padding: 40px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .success-icon {
            font-size: 4em;
            margin-bottom: 20px;
            color: #4caf50;
        }

        .success-message h2 {
            color: #667eea;
            font-size: 2em;
            margin-bottom: 15px;
        }

        .success-message p {
            color: #666;
            font-size: 1.1em;
            margin-bottom: 10px;
        }

        .btn-group {
            margin-top: 30px;
            display: flex;
            gap: 15px;
            justify-content: center;
        }

        .btn {
            padding: 12px 30px;
            border-radius: 25px;
            text-decoration: none;
            transition: all 0.3s ease;
            display: inline-block;
        }

        .btn-primary {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
        }

        .btn-secondary {
            background: #f0f0f0;
            color: #333;
        }

        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="success-icon">✅</div>
        <div class="success-message">
            <h2>登录成功！</h2>
            <p>欢迎您，<%= username %>！</p>
            <p>登录时间：<%= session.getAttribute("loginTime") %></p>
            <p>您已成功进入学生信息管理系统</p>
        </div>
        <div class="btn-group">
            <a href="index.jsp" class="btn btn-primary">返回首页</a>
            <a href="login.jsp" class="btn btn-secondary">重新登录</a>
        </div>
    </div>
</body>
</html>