<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
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
        }

        .container {
            max-width: 500px;
            margin: 0 auto;
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
            margin: 15px 0;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
            font-weight: 500;
        }

        input {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 1em;
        }

        input:focus {
            outline: none;
            border-color: #667eea;
            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);
        }

        .btn-group {
            text-align: center;
            margin-top: 30px;
        }

        .btn {
            padding: 12px 30px;
            border-radius: 25px;
            text-decoration: none;
            transition: all 0.3s ease;
            display: inline-block;
            margin: 0 10px;
            border: none;
            font-size: 1em;
            cursor: pointer;
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

        .error {
            color: red;
            margin-top: 5px;
            font-size: 0.9em;
        }
    </style>
    <script>
        function validateForm() {
            var username = document.getElementById('username').value;
            var password = document.getElementById('password').value;
            var confirmPassword = document.getElementById('confirmPassword').value;
            
            if (username.trim() === '') {
                alert('请输入用户名');
                return false;
            }
            
            if (password.trim() === '') {
                alert('请输入密码');
                return false;
            }
            
            if (password !== confirmPassword) {
                alert('两次输入的密码不一致');
                return false;
            }
            
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>👤 用户注册</h2>
        </div>

        <% 
            String error = request.getParameter("error");
            if (error != null) {
                if (error.equals("1")) {
                    out.println("<p class='error'>请填写完整的注册信息</p>");
                } else if (error.equals("2")) {
                    out.println("<p class='error'>注册失败，请重试</p>");
                } else if (error.equals("3")) {
                    out.println("<p class='error'>用户名已存在</p>");
                }
            }
        %>

        <form action="registerUserHandler.jsp" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="username">用户名：</label>
                <input type="text" id="username" name="username" required>
            </div>
            
            <div class="form-group">
                <label for="password">密码：</label>
                <input type="password" id="password" name="password" required>
            </div>
            
            <div class="form-group">
                <label for="confirmPassword">确认密码：</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>
            
            <div class="btn-group">
                <input type="submit" value="注册" class="btn btn-primary">
                <a href="index.jsp" class="btn btn-secondary">取消</a>
            </div>
        </form>
    </div>
</body>
</html><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>