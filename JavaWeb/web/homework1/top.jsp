<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/21
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Top Section</title>
    <style>
        body {
            padding: 20px;
            font-family: Arial, sans-serif;
        }
        .container {
            display: flex;
            align-items: center;
            gap: 30px;
        }
        .text-section h3 {
            margin-bottom: 5px;
        }
        .button-container {
            display: flex;
            gap: 15px;
        }
        a {
            text-decoration: none;
            color: #2196F3;
            padding: 10px 20px;
            border: 1px solid #2196F3;
            border-radius: 4px;
            transition: all 0.3s;
        }
        a:hover {
            background-color: #2196F3;
            color: white;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="text-section">
        <h3>top.jsp (Section A)</h3>
        <p>当前项目：JSP 框架布局示例</p>
    </div>
    <div class="button-container">
        <a href="login.jsp" target="mainFrame">Login</a>
        <a href="register.jsp" target="mainFrame">Register</a>
    </div>
</div>
</body>
</html>