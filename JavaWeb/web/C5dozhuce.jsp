<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/19
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册处理</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .result-box { max-width: 500px; margin: auto; padding: 20px; border: 1px solid #4CAF50; border-radius: 5px; background-color: #f9fff9; }
        h3 { color: #4CAF50; text-align: center; }
        .data-line { margin: 10px 0; font-size: 16px; }
        .highlight { font-weight: bold; color: #0066cc; }
    </style>
</head>
<body>
    <div class="result-box">
        <h3>以下是 zhuce.jsp 页面传来的数据</h3>
        <%
            // 解决中文乱码
            request.setCharacterEncoding("UTF-8");

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String confirmPwd = request.getParameter("confirmPassword");
            String email = request.getParameter("email");
            String department = request.getParameter("department");

            // 简单非空检查（实际项目中可扩展校验逻辑）
            if(username == null || username.trim().isEmpty() ||
                    password == null || password.trim().isEmpty() ||
                    confirmPwd == null || confirmPwd.trim().isEmpty() ||
                    email == null || email.trim().isEmpty() ||
                    department == null || department.trim().isEmpty()) {
                out.println("<p style='color:red;'>错误：注册信息不完整，请返回重新填写。</p>");
                out.println("<a href='zhuce.jsp'>返回注册页</a>");
                return;
            }

            // 密码一致性检查
            if(!password.equals(confirmPwd)) {
                out.println("<p style='color:red;'>错误：两次输入的密码不一致，请返回重新填写。</p>");
                out.println("<a href='zhuce.jsp'>返回注册页</a>");
                return;
            }

            // 邮箱简单格式检查（包含@和.）
            if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                out.println("<p style='color:red;'>错误：邮箱格式不正确，请返回重新填写。</p>");
                out.println("<a href='zhuce.jsp'>返回注册页</a>");
                return;
            }
        %>
        <h1>这是C5dozhuce.jsp页面</h1>
        <div class="data-line">用户名：<span class="highlight"><%= username %></span></div>
        <div class="data-line">密码：<span class="highlight"><%= password %></span> (已确认一致)</div>
        <div class="data-line">邮箱：<span class="highlight"><%= email %></span></div>
        <div class="data-line">所在学院：<span class="highlight"><%= department %></span></div>

        <p style="text-align:center; margin-top:20px;">
            <a href="C5zhuce.jsp">返回注册页面</a>
        </p>
    </div>
</body>
</html>
