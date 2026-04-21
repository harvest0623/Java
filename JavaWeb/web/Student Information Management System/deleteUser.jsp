<<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/21
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.dao.UserDao" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
<% 
    String idStr = request.getParameter("id");
    if (idStr != null) {
        int id = Integer.parseInt(idStr);
        UserDao userDao = new UserDao();
        // 这里需要添加删除用户的方法
        // userDao.deleteUser(id);
    }
    response.sendRedirect("userList.jsp");
%>
</body>
</html>