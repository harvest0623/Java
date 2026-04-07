<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>学生信息管理系统</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Microsoft YaHei', Arial, sans-serif;
            background: #f5f5f5;
            min-height: 100vh;
        }

        .header {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 20px;
            text-align: center;
            position: relative;
        }

        .header h1 {
            font-size: 2.5em;
            margin-bottom: 10px;
        }

        .header p {
            font-size: 1.2em;
            opacity: 0.9;
            margin-bottom: 10px;
        }

        .login-status {
            position: absolute;
            top: 20px;
            right: 20px;
            color: white;
            font-size: 1em;
        }

        .login-status a {
            color: white;
            text-decoration: none;
            margin-left: 10px;
            padding: 5px 10px;
            background: rgba(255, 255, 255, 0.2);
            border-radius: 5px;
            transition: background 0.3s ease;
        }

        .login-status a:hover {
            background: rgba(255, 255, 255, 0.3);
        }

        .container {
            max-width: 1200px;
            margin: 40px auto;
            padding: 0 20px;
        }

        .welcome-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            text-align: center;
            margin-bottom: 40px;
        }

        .welcome-section h2 {
            font-size: 2em;
            margin-bottom: 20px;
        }

        .welcome-section p {
            font-size: 1.1em;
            line-height: 1.6;
        }

        .stats-container {
            display: flex;
            justify-content: space-around;
            margin: 40px 0;
            flex-wrap: wrap;
        }

        .stat-card {
            background: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
            text-align: center;
            flex: 1;
            min-width: 250px;
            margin: 10px;
        }

        .stat-card .value {
            font-size: 2.5em;
            font-weight: bold;
            color: #667eea;
            margin-bottom: 10px;
        }

        .stat-card .label {
            color: #666;
            font-size: 1.1em;
            margin-bottom: 5px;
        }

        .stat-card .desc {
            color: #999;
            font-size: 0.9em;
        }

        .card-container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 30px;
            margin-bottom: 40px;
        }

        .card {
            background: white;
            border-radius: 15px;
            padding: 30px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.15);
        }

        .card-icon {
            font-size: 3em;
            margin-bottom: 20px;
            text-align: center;
        }

        .card h3 {
            color: #667eea;
            font-size: 1.5em;
            margin-bottom: 15px;
            text-align: center;
        }

        .card p {
            color: #666;
            font-size: 1em;
            line-height: 1.5;
            margin-bottom: 20px;
            text-align: center;
        }

        .btn {
            display: block;
            width: 100%;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            text-align: center;
            padding: 12px;
            border: none;
            border-radius: 8px;
            font-size: 1em;
            text-decoration: none;
            transition: all 0.3s ease;
            margin-top: 20px;
        }

        .btn:hover {
            background: linear-gradient(135deg, #5a6fd8 0%, #6a4393 100%);
            transform: translateY(-2px);
        }

        .footer {
            background: #333;
            color: white;
            text-align: center;
            padding: 20px;
            margin-top: 40px;
        }

        .footer-links {
            margin-top: 10px;
        }

        .footer-links a {
            color: #ccc;
            text-decoration: none;
            margin: 0 10px;
        }

        .footer-links a:hover {
            color: white;
        }

        .current-time {
            margin-top: 10px;
            font-size: 0.9em;
            color: #ccc;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>学生信息管理系统</h1>
        <p>JSP内置对象实验 | Session保存登录状态 | Application保存访问统计</p>
        <% 
            String username = (String) session.getAttribute("username");
            if (username != null) {
        %>
        <p>当前登录用户: <%= username %></p>
        <% } %>
        <div class="login-status">
            <% 
                if (username != null) {
            %>
                欢迎，<%= username %>！ <a href="logout.jsp">注销登录</a>
            <% } else { %>
                <a href="registerUser.jsp">注册</a> <a href="login.jsp">登录</a>
            <% } %>
        </div>
    </div>

    <div class="container">
        <div class="welcome-section">
            <h2>欢迎使用学生信息管理系统</h2>
            <p>JSP内置对象实验 | Session保存登录状态 | Application保存访问统计</p>
            <% 
                if (username != null) {
            %>
            <p>当前登录用户: <%= username %></p>
            <% } %>
        </div>

        <% 
            // 增加网站访问次数
            Integer visitCount = (Integer) application.getAttribute("visitCount");
            if (visitCount == null) {
                visitCount = 0;
            }
            application.setAttribute("visitCount", visitCount + 1);

            // 获取其他统计数据
            Integer onlineCount = (Integer) application.getAttribute("onlineCount");
            if (onlineCount == null) {
                onlineCount = 0;
            }

            // 从数据库获取学生总数
            int studentCount = 0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection conn = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC",
                    "root",
                    "huang426523"
                );
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM student");
                if (rs.next()) {
                    studentCount = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>

        <div class="stats-container">
            <div class="stat-card">
                <div class="value"><%= visitCount %></div>
                <div class="label">网站总访问次数</div>
                <div class="desc">(Application对象)</div>
            </div>
            <div class="stat-card">
                <div class="value"><%= studentCount %></div>
                <div class="label">学生总数</div>
                <div class="desc">(数据库)</div>
            </div>
            <div class="stat-card">
                <div class="value"><%= onlineCount %></div>
                <div class="label">当前在线人数</div>
                <div class="desc">(Session监听)</div>
            </div>
        </div>

        <div class="card-container">
            <div class="card">
                <div class="card-icon">📝</div>
                <h3>用户注册</h3>
                <p>学习表单验证和数据库插入，注册新账号</p>
                <a href="registerUser.jsp" class="btn">注册账号</a>
            </div>

            <div class="card">
                <div class="card-icon">🔐</div>
                <h3>用户登录</h3>
                <p>学习Session保存登录状态，Application统计访问次数</p>
                <a href="login.jsp" class="btn">用户登录</a>
            </div>

            <div class="card">
                <div class="card-icon">🎓</div>
                <h3>学生登记</h3>
                <p>学习表单数据获取和数据库插入，需要登录后使用</p>
                <a href="register.jsp" class="btn">登记学生</a>
            </div>

            <div class="card">
                <div class="card-icon">📋</div>
                <h3>学生列表</h3>
                <p>学习数据库查询和分页，需要登录后使用</p>
                <a href="studentList.jsp" class="btn">查看列表</a>
            </div>

            <div class="card">
                <div class="card-icon">✏️</div>
                <h3>修改学生</h3>
                <p>学习数据库更新操作，需要登录后使用</p>
                <a href="studentList.jsp" class="btn">修改信息</a>
            </div>

            <div class="card">
                <div class="card-icon">🧮</div>
                <h3>简易计算器</h3>
                <p>学习JSP动作（include）的应用，异常处理</p>
                <a href="calculatorForm.jsp" class="btn">使用计算器</a>
            </div>
        </div>
    </div>

    <div class="footer">
        <div class="footer-links">
            <a href="index.jsp">首页</a> | 
            <a href="registerUser.jsp">用户注册</a> | 
            <a href="login.jsp">用户登录</a> | 
            <a href="register.jsp">学生登记</a> | 
            <a href="studentList.jsp">学生列表</a>
        </div>
        <div class="current-time">
            网站总访问次数: <%= visitCount %> | 当前在线用户: <%= onlineCount %> | 当前时间: <%= new java.util.Date() %>
        </div>
        <p>&copy; 2026 学生信息管理系统 | JSP内置对象实验</p>
    </div>
</body>
</html>