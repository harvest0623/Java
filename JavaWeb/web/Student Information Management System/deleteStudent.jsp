<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 08:52
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.dao.StudentDao" %>

<%
    // 设置编码
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 获取学生ID
    String idStr = request.getParameter("id");
    if (idStr == null || idStr.trim().equals("")) {
        response.sendRedirect("studentList.jsp");
        return;
    }

    int id = Integer.parseInt(idStr);
    StudentDao studentDao = new StudentDao();
    studentDao.deleteStudent(id);

    // 重定向到学生列表页面
    response.sendRedirect("studentList.jsp");
%>