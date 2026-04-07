<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.User" %>
<%@ page import="com.hh.dao.UserDao" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 获取所有参数
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String confirmPassword = request.getParameter("confirmPassword");

    // 验证数据
    if (username == null || username.trim().equals("") ||
            password == null || password.trim().equals("") ||
            confirmPassword == null || confirmPassword.trim().equals("")) {
        response.sendRedirect("registerUser.jsp?error=1");
        return;
    }

    // 验证密码是否一致
    if (!password.equals(confirmPassword)) {
        response.sendRedirect("registerUser.jsp?error=1");
        return;
    }

    // 检查用户名是否已存在
    UserDao userDao = new UserDao();
    User existingUser = userDao.findByUsername(username);
    if (existingUser != null) {
        response.sendRedirect("registerUser.jsp?error=3");
        return;
    }

    // 创建用户对象
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    // 保存到数据库
    boolean success = userDao.register(user);

    if (success) {
        response.sendRedirect("login.jsp?register=success");
    } else {
        response.sendRedirect("registerUser.jsp?error=2");
    }
%><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>