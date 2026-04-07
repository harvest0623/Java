<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/7
  Time: 09:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页</title>
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
        }

        .header h1 {
            font-size: 2em;
            margin-bottom: 10px;
        }

        .header p {
            font-size: 1.1em;
            opacity: 0.9;
        }

        .welcome-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 40px;
            text-align: center;
            margin: 20px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
        }

        .welcome-section h2 {
            font-size: 2.5em;
            margin-bottom: 20px;
        }

        .welcome-section p {
            font-size: 1.2em;
            margin-bottom: 10px;
        }

        .stats-container {
            display: flex;
            justify-content: space-around;
            margin: 40px 20px;
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

        .stat-card h3 {
            color: #667eea;
            font-size: 1.2em;
            margin-bottom: 20px;
        }

        .stat-card .value {
            font-size: 3em;
            font-weight: bold;
            color: #667eea;
            margin-bottom: 10px;
        }

        .stat-card .desc {
            color: #666;
            font-size: 0.9em;
        }

        .login-log {
            background: white;
            margin: 40px 20px;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
        }

        .login-log h3 {
            color: #667eea;
            font-size: 1.5em;
            margin-bottom: 20px;
        }

        .login-log pre {
            background: #f8f9fa;
            padding: 20px;
            border-radius: 8px;
            border-left: 4px solid #667eea;
            max-height: 300px;
            overflow-y: auto;
            font-family: 'Courier New', monospace;
            font-size: 0.9em;
            line-height: 1.4;
        }

        .info-section {
            background: #e3f2fd;
            margin: 40px 20px;
            padding: 30px;
            border-radius: 15px;
            border-left: 4px solid #2196f3;
        }

        .info-section h3 {
            color: #1976d2;
            font-size: 1.3em;
            margin-bottom: 15px;
        }

        .info-section ul {
            list-style-type: none;
            padding-left: 0;
        }

        .info-section li {
            margin-bottom: 10px;
            padding-left: 20px;
            position: relative;
        }

        .info-section li:before {
            content: '•';
            color: #2196f3;
            font-weight: bold;
            position: absolute;
            left: 0;
        }

        .button-container {
            display: flex;
            justify-content: center;
            margin: 40px 20px;
            gap: 20px;
        }

        .btn {
            padding: 12px 24px;
            border: none;
            border-radius: 8px;
            font-size: 1em;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        .btn-primary {
            background: #667eea;
            color: white;
        }

        .btn-primary:hover {
            background: #5a6fd8;
            transform: translateY(-2px);
        }

        .btn-danger {
            background: #e74c3c;
            color: white;
        }

        .btn-danger:hover {
            background: #c0392b;
            transform: translateY(-2px);
        }

        .footer {
            background: #333;
            color: white;
            text-align: center;
            padding: 20px;
            margin-top: 40px;
        }
    </style>
</head>
<body>
<div class="header">
    <h1>学生信息管理系统</h1>
    <p>JSP内置对象实验 | Session & Application</p>
</div>

<%
    // 从session中获取用户名，如果获取不到，强制跳回登录页
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    // 增加网站访问次数
    Integer visitCount = (Integer) application.getAttribute("visitCount");
    if (visitCount == null) {
        visitCount = 0;
    }
    application.setAttribute("visitCount", visitCount + 1);

    // 获取其他统计数据
    Integer loginCount = (Integer) application.getAttribute("loginCount");
    if (loginCount == null) {
          loginCount = 0;
    }

    Integer onlineCount = (Integer) application.getAttribute("onlineCount");
    if (onlineCount == null) {
        onlineCount = 0;
    }

    String loginLog = (String) application.getAttribute("loginLog");
    if (loginLog == null) {
        loginLog = "";
    }
%>

<div class="welcome-section">
    <h2>欢迎回来，<%= username %>！</h2>
    <p>您已成功登录系统 | Session ID: <%= session.getId() %></p>
</div>

<div class="stats-container">
    <div class="stat-card">
        <h3>网站总访问次数</h3>
        <div class="value"><%= visitCount %></div>
        <div class="desc">(Application对象)</div>
    </div>
    <div class="stat-card">
        <h3>累计登录次数</h3>
        <div class="value"><%= loginCount %></div>
        <div class="desc">(Application对象)</div>
    </div>
    <div class="stat-card">
        <h3>当前在线人数</h3>
        <div class="value"><%= onlineCount %></div>
        <div class="desc">(Application对象)</div>
    </div>
</div>

<div class="login-log">
    <h3>登录记录 (Application对象存储)</h3>
    <pre><%= loginLog %></pre>
</div>

<div class="info-section">
    <h3>JSP内置对象知识说明：</h3>
    <ul>
        <li><strong>request对象：</strong>用于接收客户端请求，在登录失败时传递错误信息（转发传参）</li>
        <li><strong>response对象：</strong>用于响应客户端，实现页面跳转（sendRedirect重定向）</li>
        <li><strong>session对象：</strong>保存用户登录状态，每个用户独立，超时时间为30分钟</li>
        <li><strong>application对象：</strong>保存网站访问计数、登录次数、在线人数、登录日志，所有用户共享</li>
    </ul>
</div>

<div class="button-container">
    <a href="index.jsp" class="btn btn-primary">返回首页</a>
    <a href="register.jsp" class="btn btn-primary">学生登记</a>
    <a href="studentList.jsp" class="btn btn-primary">学生列表</a>
    <a href="logout.jsp" class="btn btn-danger">注销登录</a>
</div>

<div class="footer">
    <p>&copy; 2026 学生信息管理系统 | JSP内置对象实验</p>
</div>
</body>
</html>