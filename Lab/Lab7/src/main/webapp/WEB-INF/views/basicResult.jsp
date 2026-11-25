<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/11/18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>基本类型数据绑定结果</title>
  <style>
    body { font-family: Arial, sans-serif; background-color: #f9f9f9; padding: 30px; }
    .container { max-width: 500px; margin: 0 auto; background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
    h2 { color: #2196F3; }
    .info { background: #e3f2fd; padding: 15px; border-radius: 4px; }
    .info p { margin: 8px 0; }
    .back { display: inline-block; margin-top: 15px; color: #2196F3; text-decoration: none; }
  </style>
</head>
<body>
<div class="container">
  <h2>✅ ${msg}</h2>

  <div class="info">
    <p><strong>姓名（String）：</strong>${name}</p>
    <p><strong>年龄（int）：</strong>${age}</p>
    <p><strong>分数（double）：</strong>${score}</p>
    <p><strong>是否VIP（boolean）：</strong>${vip}</p>
  </div>

  <p style="color:#888; font-size:13px; margin-top:15px;">
    💡 使用 <code>@RequestParam</code> 注解逐个绑定基本类型参数
  </p>

  <a class="back" href="${pageContext.request.contextPath}/welcome">← 返回首页</a>
</div>
</body>
</html>