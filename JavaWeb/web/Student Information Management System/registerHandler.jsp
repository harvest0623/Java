<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.Student" %>
<%@ page import="com.hh.dao.StudentDao" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 获取所有参数
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    // 验证数据
    if (name == null || name.trim().equals("") ||
            ageStr == null || ageStr.trim().equals("") ||
            gender == null || gender.trim().equals("") ||
            email == null || email.trim().equals("") ||
            phone == null || phone.trim().equals("")) {
        response.sendRedirect("register.jsp?error=1");
        return;
    }

    // 创建学生对象
    Student student = new Student();
    student.setName(name);
    student.setAge(Integer.parseInt(ageStr));
    student.setGender(gender);
    student.setEmail(email);
    student.setPhone(phone);
    student.setRegisterTime(new java.util.Date());

    // 保存到数据库
    StudentDao studentDao = new StudentDao();
    boolean success = studentDao.addStudent(student);

    if (success) {
        response.sendRedirect("registerSuccess.jsp");
    } else {
        response.sendRedirect("register.jsp?error=2");
    }
%>