<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/24
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("ctx", request.getContextPath()); %>
<html>
<head>
  <title>注册成功</title>
  <style>
    body { font-family:"Microsoft YaHei",sans-serif; background:#f6ffed; padding:60px; }
    .box { max-width:500px; margin:0 auto; background:#fff; padding:30px; border-radius:8px;
      border:1px solid #b7eb8f; box-shadow:0 2px 8px rgba(0,0,0,.06); }
    h2 { color:#389e0d; text-align:center; }
    table { width:100%; margin-top:20px; border-collapse:collapse; }
    td { padding:8px; border-bottom:1px solid #f0f0f0; }
    td:first-child { font-weight:bold; color:#555; width:100px; }
    .back { display:block; text-align:center; margin-top:20px;
      padding:10px; background:#1890ff; color:#fff; text-decoration:none;
      border-radius:4px; }
    .back:hover { background:#40a9ff; }
  </style>
</head>
<body>
<div class="box">
  <h2>${successMsg}</h2>
  <table>
    <tr><td>用户ID：</td><td>${registeredUser.id}</td></tr>
    <tr><td>用户名：</td><td>${registeredUser.username}</td></tr>
    <tr><td>年龄：</td><td>${registeredUser.age}</td></tr>
    <tr><td>邮箱：</td><td>${registeredUser.email}</td></tr>
    <c:if test="${not empty registeredUser.fileName}">
      <tr><td>头像：</td><td>${registeredUser.fileName}</td></tr>
    </c:if>
  </table>
  <a class="back" href="${ctx}/user/toRegister">返回继续注册</a>
</div>
</body>
</html>