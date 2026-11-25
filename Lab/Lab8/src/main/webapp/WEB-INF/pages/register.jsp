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
  <title>用户注册 - 实验8 SSM整合</title>
  <style>
    body { font-family: "Microsoft YaHei", sans-serif; background:#f5f5f5; padding:40px; }
    .container { max-width: 500px; margin: 0 auto; background:#fff; padding:30px; border-radius:8px; box-shadow:0 2px 8px rgba(0,0,0,.1); }
    h2 { text-align:center; color:#333; }
    label { display:block; margin-top:15px; font-weight:bold; color:#555; }
    input[type="text"], input[type="password"], input[type="email"], input[type="number"], input[type="file"] {
      width:100%; padding:8px; border:1px solid #ddd; border-radius:4px; box-sizing:border-box; margin-top:5px;
    }
    button { width:100%; padding:10px; background:#1890ff; color:#fff; border:none; border-radius:4px;
      font-size:16px; margin-top:20px; cursor:pointer; }
    button:hover { background:#40a9ff; }
    .error { color:#ff4d4f; font-size:13px; margin-top:4px; }
    .msg { padding:10px; border-radius:4px; margin-bottom:15px; }
    .msg.error-msg { background:#fff2f0; color:#cf1322; border:1px solid #ffccc7; }
  </style>
</head>
<body>

<div class="container">
  <h2>用户注册</h2>
  <p style="text-align:center;color:#888;font-size:12px;">（服务器端 Bean Validation 验证 + 单文件上传）</p>

  <!-- 显示总体错误信息 -->
  <c:if test="${not empty errorMsg}">
    <div class="msg error-msg">${errorMsg}</div>
  </c:if>

  <!--
      关键：表单必须用 POST + enctype="multipart/form-data" 才能上传文件
      modelAttribute 绑定 User 对象，便于 Controller 回显
  -->
  <form action="${ctx}/user/register" method="post" enctype="multipart/form-data">

    <label>用户名（3-20位）：</label>
    <input type="text" name="username" value="${user.username}" placeholder="请输入用户名">
    <c:forEach items="${errors}" var="err">
      <c:if test="${err.field == 'username'}">
        <div class="error">${err.defaultMessage}</div>
      </c:if>
    </c:forEach>

    <label>密码（6-20位）：</label>
    <input type="password" name="password" placeholder="请输入密码">
    <c:forEach items="${errors}" var="err">
      <c:if test="${err.field == 'password'}">
        <div class="error">${err.defaultMessage}</div>
      </c:if>
    </c:forEach>

    <label>年龄（1-120）：</label>
    <input type="number" name="age" value="${user.age}" placeholder="请输入年龄">
    <c:forEach items="${errors}" var="err">
      <c:if test="${err.field == 'age'}">
        <div class="error">${err.defaultMessage}</div>
      </c:if>
    </c:forEach>

    <label>邮箱：</label>
    <input type="email" name="email" value="${user.email}" placeholder="example@domain.com">
    <c:forEach items="${errors}" var="err">
      <c:if test="${err.field == 'email'}">
        <div class="error">${err.defaultMessage}</div>
      </c:if>
    </c:forEach>

    <label>头像上传（单文件，≤5MB）：</label>
    <input type="file" name="avatar" accept="image/*">

    <button type="submit">立即注册</button>
  </form>
</div>

</body>
</html>