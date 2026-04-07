<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/7
  Time: 09:07
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销登录</title>
</head>
<body>
<%
    // 减少在线人数
    Integer onlineCount = (Integer) application.getAttribute("onlineCount");
    if (onlineCount != null && onlineCount > 0) {
        application.setAttribute("onlineCount", onlineCount - 1);
    }

    // 销毁session
    session.invalidate();

    // 跳转到登录页
    response.sendRedirect("login.jsp");
%>
</body>
</html>