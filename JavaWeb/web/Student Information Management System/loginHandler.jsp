<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // 简单验证（实际应用中应该查询数据库）
    if ("huang".equals(username) && "123456".equals(password)) {
        session.setAttribute("username", username);
        session.setAttribute("loginTime", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
        response.sendRedirect("loginSuccess.jsp");
    } else {
        response.sendRedirect("login.jsp?error=1");
    }
%>