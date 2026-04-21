<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.User" %>
<%@ page import="com.hh.dao.UserDao" %>
<html>
<head>
    <title>用户注册处理</title>
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
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .header h2 {
            color: #4caf50;
            font-size: 2em;
            margin-bottom: 10px;
        }

        .success-message {
            background: #e8f5e8;
            padding: 20px;
            border-radius: 10px;
            text-align: center;
            margin-bottom: 30px;
        }

        .success-message h3 {
            color: #2e7d32;
            margin-bottom: 10px;
        }

        .user-info {
            background: #f5f5f5;
            padding: 20px;
            border-radius: 10px;
            margin-bottom: 30px;
        }

        .user-info p {
            margin: 10px 0;
 r: #333;
        }

        .btn-group {
            text-align: center;
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

        .info {
            background: #e3f2fd;
            padding: 15px;
            border-radius: 8px;
            margin-top: 30px;
            border-left: 4px solid #2196f3;
        }

        .info h4 {
            color: #1976d2;
            margin-bottom: 10px;
        }

        .info code {
            background: #f5f5f5;
            padding: 2px 4px;
            border-radius: 4px;
            font-family: 'Courier New', monospace;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>演示 JSP + JavaBean 模式</h2>
        </div>

        <%-- 使用 JSP 动作标签创建和操作 JavaBean --%>
        <jsp:useBean id="user" class="com.hh.bean.User" scope="page" />
        <jsp:setProperty name="user" property="*" />

        <% 
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");
            
            if (user.getUsername() == null || password == null || confirmPassword == null || 
                user.getUsername().trim().equals("") || password.trim().equals("") || confirmPassword.trim().equals("")) {
                response.sendRedirect("registerUser.jsp?error=1");
                return;
            }
            
            if (!password.equals(confirmPassword)) {
                response.sendRedirect("registerUser.jsp?error=1");
                return;
            }
            
            UserDao userDao = new UserDao();
            User existingUser = userDao.findByUsername(user.getUsername());
            if (existingUser != null) {
                response.sendRedirect("registerUser.jsp?error=3");
                return;
            }
            
            user.setPassword(password);
            
            boolean success = userDao.register(user);
            if (success) {
        %>

        <div class="success-message">
            <h3>✅ 注册成功！</h3>
            <div class="user-info">
                <p>用户名: <jsp:getProperty name="user" property="username" /></p>
                <p>密码长度: <jsp:getProperty name="user" property="password" /> 位</p>
            </div>
            <div class="btn-group">
                <a href="login.jsp" class="btn btn-primary">立即登录</a>
                <a href="userList.jsp" class="btn btn-secondary">查看用户列表</a>
            </div>
        </div>

        <div class="info">
            <h4>JavaBean 动作标签说明</h4>
            <ul>
                <li><code>&lt;jsp:useBean id="user" class="com.hh.bean.User" scope="page" /&gt;</code> - 创建JavaBean实例</li>
                <li><code>&lt;jsp:setProperty name="user" property="*" /&gt;</code> - 自动设置表单参数到Bean</li>
                <li>注意：两个标签必须是自闭和的，不能有标签体！</li>
            </ul>
        </div>

        <% 
            } else {
                response.sendRedirect("registerUser.jsp?error=2");
            }
        %>
    </div>
</body>
</html><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:24
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