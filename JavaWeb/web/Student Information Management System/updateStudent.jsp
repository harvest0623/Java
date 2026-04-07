<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.Student" %>
<%@ page import="com.hh.dao.StudentDao" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 获取所有参数
    String idStr = request.getParameter("id");
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    // 验证数据
    if (idStr == null || idStr.trim().equals("") ||
            name == null || name.trim().equals("") ||
            ageStr == null || ageStr.trim().equals("") ||
            gender == null || gender.trim().equals("") ||
            email == null || email.trim().equals("") ||
            phone == null || phone.trim().equals("")) {
        response.sendRedirect("editStudent.jsp?id=" + idStr + "&error=1");
        return;
    }

    // 创建学生对象
    Student student = new Student();
    student.setId(Integer.parseInt(idStr));
    student.setName(name);
    student.setAge(Integer.parseInt(ageStr));
    student.setGender(gender);
    student.setEmail(email);
    student.setPhone(phone);

    // 更新到数据库
    StudentDao studentDao = new StudentDao();
    boolean success = studentDao.updateStudent(student);

    if (success) {
        response.sendRedirect("studentList.jsp");
    } else {
        response.sendRedirect("editStudent.jsp?id=" + idStr + "&error=2");
    }
%><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 08:48
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.Student" %>
<%@ page import="com.hh.dao.StudentDao" %>

<%
    // 设置编码
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    // 获取所有参数
    String idStr = request.getParameter("id");
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");
    String gender = request.getParameter("gender");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");

    // 验证数据
    if (idStr == null || idStr.trim().equals("") ||
            name == null || name.trim().equals("") ||
            ageStr == null || ageStr.trim().equals("") ||
            gender == null || gender.trim().equals("") ||
            email == null || email.trim().equals("") ||
            phone == null || phone.trim().equals("")) {
        response.sendRedirect("editStudent.jsp?id=" + idStr + "&error=1");
        return;
    }

    // 创建学生对象
    Student student = new Student();
    student.setId(Integer.parseInt(idStr));
    student.setName(name);
    student.setAge(Integer.parseInt(ageStr));
    student.setGender(gender);
    student.setEmail(email);
    student.setPhone(phone);

    // 更新到数据库
    StudentDao studentDao = new StudentDao();
    boolean success = studentDao.updateStudent(student);

    if (success) {
        response.sendRedirect("studentList.jsp");
    } else {
        response.sendRedirect("editStudent.jsp?id=" + idStr + "&error=2");
    }
%>