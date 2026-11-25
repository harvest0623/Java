<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>绑定结果</title>
  <style>
    body { font-family: Arial, sans-serif; background-color: #f9f9f9; padding: 30px; }
    .container { max-width: 500px; margin: 0 auto; background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
    h2 { color: #4CAF50; }
    .info { background: #e7f3e7; padding: 15px; border-radius: 4px; }
    .info p { margin: 8px 0; }
    .back { display: inline-block; margin-top: 15px; color: #2196F3; text-decoration: none; }
  </style>
</head>
<body>
<div class="container">
  <h2>✅ ${msg}</h2>

  <div class="info">
    <p><strong>用户名：</strong>${user.username}</p>
    <p><strong>密码：</strong>${user.password}</p>
    <p><strong>年龄：</strong>${user.age}</p>
    <p><strong>邮箱：</strong>${user.email}</p>
    <p><strong>分数：</strong>${user.score}</p>
  </div>

  <p style="color:#888; font-size:13px; margin-top:15px;">
    💡 表单参数通过<strong>同名匹配</strong>自动绑定到User对象的属性上
  </p>

  <a class="back" href="${pageContext.request.contextPath}/welcome">← 返回首页</a>
</div>
</body>
</html>