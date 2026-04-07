<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/7
  Time: 08:45
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/7
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.User" %>
<%@ page import="com.hh.dao.UserDao" %>
<html>
<head>
    <title>登录处理</title>
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
              // 将用户名存入session对象
              session.setAttribute("username", user.getUsername());
              session.setAttribute("userId", user.getId());
              session.setAttribute("loginTime", new java.util.Date());

              // 增加登录次数统计
              Integer loginCount = (Integer) application.getAttribute("loginCount");
              if (loginCount == null) {
                  loginCount = 0;
              }
              application.setAttribute("loginCount", loginCount + 1);

              // 增加在线人数
              Integer onlineCount = (Integer) application.getAttribute("onlineCount");
              if (onlineCount == null) {
                  onlineCount = 0;
              }
              application.setAttribute("onlineCount", onlineCount + 1);

              // 记录登录日志
              String loginLog = (String) application.getAttribute("loginLog");
              if (loginLog == null) {
                  loginLog = "";
              }
              java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
              String logEntry = username + " 于 " + sdf.format(new java.util.Date()) + " 登录成功\n";
              loginLog = logEntry + loginLog;
              application.setAttribute("loginLog", loginLog);

              // 跳转到欢迎页
              response.sendRedirect("welcome.jsp");
          } else {
              loginSuccess = false;
              errorMessage = "用户名或密码错误！";
              // 使用request对象携带错误信息，转发回login.jsp
              request.setAttribute("errorMsg", errorMessage);
              request.getRequestDispatcher("login.jsp").forward(request, response);
          }
    } catch (Exception e) {
        loginSuccess = false;
        errorMessage = "系统错误：登录失败！错误信息：" + e.getMessage();
        e.printStackTrace();
        // 使用request对象携带错误信息，转发回login.jsp
        request.setAttribute("errorMsg", errorMessage);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>
</body>
</html>