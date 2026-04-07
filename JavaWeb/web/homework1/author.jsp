<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/23
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>作者个人简介</title>
    <style>
        body {
            padding: 20px;
            line-height: 1.6;
        }
        h3 {
            margin-bottom: 15px;
        }
        .info {
            margin: 10px 0;
        }
    </style>
</head>
<body>
<h3>作者个人简介</h3>
<%
    String authorName = "张三";
    String job = "Java Web 开发工程师";
%>
<p class="info">姓名：<%= authorName %></p>
<p class="info">职业：<%= job %></p>
</body>
</html>