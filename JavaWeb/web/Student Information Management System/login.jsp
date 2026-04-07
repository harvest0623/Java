<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
%>
<html>
<head>
    <title>用户登录</title>
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
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .header h2 {
            color: #667eea;
            font-size: 2em;
            margin-bottom: 10px;
        }

        .form-group {
            margin-bottom: 25px;
        }

        .form-group label {
            display: block;
            color: #333;
            margin-bottom: 8px;
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 12px;
            border: 2px solid #e0e0e0;
            border-radius: 8px;
            font-size: 1em;
            transition: border-color 0.3s ease;
        }

        .form-group input:focus {
            outline: none;
            border-color: #667eea;
        }

        .btn {
            width: 100%;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            border: none;
            padding: 15px;
            border-radius: 8px;
            font-size: 1em;
            cursor: pointer;
            transition: all 0.3s ease;
            margin-top: 20px;
        }

        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.2);
        }

        .back-link {
            text-align: center;
            margin-top: 20px;
        }

        .back-link a {
            color: #667eea;
            text-decoration: none;
        }

        .error {
            color: #c33;
            text-align: center;
            margin-bottom: 20px;
            padding: 10px;
            background: #ffebee;
            border-radius: 5px;
        }
    </style>
    <script>
        function validateForm() {
            var username = document.getElementById('username').value;
            var password = document.getElementById('password').value;

            if (username.trim() === '') {
                alert('请输入用户名！');
                return false;
            }

            if (password.trim() === '') {
                alert('请输入密码！');
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>🔐 用户登录</h2>
        </div>

        <% 
            String errorMsg = request.getParameter("errorMsg");
            if (errorMsg != null && !errorMsg.equals("")) {
        %>
        <div class="error">
            <%= errorMsg %>
        </div>
        <% } %>

        <form id="loginForm" action="dologin.jsp" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="username">用户名：</label>
                <input type="text" id="username" name="username" required placeholder="请输入用户名">
            </div>

            <div class="form-group">
                <label for="password">密码：</label>
                <input type="password" id="password" name="password" required placeholder="请输入密码">
            </div>

            <button type="submit" class="btn">登 录</button>
        </form>

        <div class="back-link">
            <a href="index.jsp">返回首页</a>
        </div>
    </div>
</body>
</html>