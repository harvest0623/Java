<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/26
  Time: 08:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.User" %>
<%@ page import="com.hh.dao.UserDao" %>
<html>
<head>
    <title>登录验证</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    boolean loginSuccess = false;
    String errorMessage = "";

    try {
        // 使用UserDao验证登录
        UserDao userDao = new UserDao();
        User user = userDao.login(username, password);

        if (user != null) {
            loginSuccess = true;
            // 将用户信息存入session
            session.setAttribute("userId", user.getId());
            session.setAttribute("username", user.getUsername());
            session.setAttribute("loginTime", new java.util.Date());
        } else {
            loginSuccess = false;
            errorMessage = "用户名或密码错误！";
        }
    } catch (Exception e) {
        loginSuccess = false;
        errorMessage = "系统错误：登录失败！错误信息：" + e.getMessage();
        e.printStackTrace();
    }

    // 6. 根据验证结果进行页面跳转
    if (loginSuccess) {
        // 验证成功，跳转到登录成功页面
        response.sendRedirect("loginSuccess.jsp");
    } else {
      // 验证失败，使用 forward 跳转并传参
%>
<jsp:forward page="loginError.jsp">
    <jsp:param name="errorMsg" value="<%= errorMessage %>" />
    <jsp:param name="errorCode" value="401" />
</jsp:forward>
<%
    }
%>
</body>
</html>