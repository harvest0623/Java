<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/26
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录错误</title>
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
            max-width: 400px;
            width: 100%;
            background: white;
            border-radius: 15px;
            padding: 40px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .error-icon {
            font-size: 4em;
            margin-bottom: 20px;
            color: #f44336;
        }

        .error-message h2 {
            color: #f44336;
            font-size: 1.8em;
            margin-bottom: 15px;
        }

        .error-message p {
            color: #666;
            font-size: 1.1em;
            margin-bottom: 10px;
        }

        .btn {
            margin-top: 30px;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            border: none;
            padding: 12px 30px;
            border-radius: 25px;
            font-size: 1em;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-block;
        }

        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="error-icon">❌</div>
        <div class="error-message">
            <h2>登录失败</h2>
            <p><%= request.getParameter("errorMsg") %></p>
            <p>错误代码：<%= request.getParameter("errorCode") %></p>
        </div>
        <a href="login.jsp" class="btn">返回登录</a>
    </div>
</body>
</html>