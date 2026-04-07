<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>学生信息登记</title>
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
            max-width: 600px;
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
            margin-bottom: 25px;
        }

        .form-group label {
            display: block;
            color: #333;
            margin-bottom: 8px;
            font-weight: bold;
        }

        .form-group input, .form-group select {
            width: 100%;
            padding: 12px;
            border: 2px solid #e0e0e0;
            border-radius: 8px;
            font-size: 1em;
            transition: border-color 0.3s ease;
        }

        .form-group input:focus, .form-group select:focus {
            outline: none;
            border-color: #667eea;
        }

        .btn-group {
            display: flex;
            gap: 15px;
            margin-top: 30px;
        }

        .btn {
            flex: 1;
            padding: 15px;
            border: none;
            border-radius: 8px;
            font-size: 1em;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            text-align: center;
        }

        .btn-submit {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
        }

        .btn-reset {
            background: #f0f0f0;
            color: #333;
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
            font-size: 0.9em;
            margin-top: 5px;
            display: none;
        }
    </style>
    <script>
        function validateForm() {
            var name = document.getElementById('name').value;
            var age = document.getElementById('age').value;
            var email = document.getElementById('email').value;
            var phone = document.getElementById('phone').value;

            if (name.trim() === '') {
                alert('请输入姓名！');
                return false;
            }

            if (age === '' || age < 1 || age > 150) {
                alert('请输入有效的年龄！');
                return false;
            }

            var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                alert('请输入有效的邮箱地址！');
                return false;
            }

            var phoneRegex = /^1[3-9]\d{9}$/;
            if (!phoneRegex.test(phone)) {
                alert('请输入有效的手机号码！');
                return false;
            }

            return true;
        }

        function clearForm() {
            document.getElementById('registerForm').reset();
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>📝 学生信息登记</h2>
        </div>

        <form id="registerForm" action="registerHandler.jsp" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="name">姓名：</label>
                <input type="text" id="name" name="name" required placeholder="请输入学生姓名">
            </div>

            <div class="form-group">
                <label for="age">年龄：</label>
                <input type="number" id="age" name="age" required min="1" max="150" placeholder="请输入年龄">
            </div>

            <div class="form-group">
                <label for="gender">性别：</label>
                <select id="gender" name="gender" required>
                    <option value="">请选择性别</option>
                    <option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </div>

            <div class="form-group">
                <label for="email">邮箱：</label>
                <input type="email" id="email" name="email" required placeholder="请输入邮箱地址">
            </div>

            <div class="form-group">
                <label for="phone">电话：</label>
                <input type="tel" id="phone" name="phone" required placeholder="请输入手机号码" pattern="1[3-9]\d{9}">
            </div>

            <div class="btn-group">
                <button type="submit" class="btn btn-submit">提 交</button>
                <button type="button" class="btn btn-reset" onclick="clearForm()">重 置</button>
            </div>
        </form>

        <div class="back-link">
            <a href="index.jsp">返回首页</a>
        </div>
    </div>
</body>
</html>