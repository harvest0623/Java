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
<html>
<head>
    <title>修改学生信息</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Microsoft YaHei', Arial, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            padding: 20px;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            background: white;
            border-radius: 15px;
            padding: 40px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .header h2 {
            color: #667eea;
            font-size: 2em;
            margin-bottom: 10px;
        }

        .form-group {
            margin: 15px 0;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
            font-weight: 500;
        }

        input, select {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 1em;
        }

        input:focus, select:focus {
            outline: none;
            border-color: #667eea;
            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);
        }

        .btn-group {
            text-align: center;
            margin-top: 30px;
        }

        .btn {
            padding: 12px 30px;
            border-radius: 25px;
            text-decoration: none;
            transition: all 0.3s ease;
            display: inline-block;
            margin: 0 10px;
            border: none;
            font-size: 1em;
            cursor: pointer;
        }

        .btn-primary {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
        }

        .btn-secondary {
            background: #f0f0f0;
            color: #333;
        }

        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.2);
        }

        .error {
            color: red;
            margin-top: 5px;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>✏️ 修改学生信息</h2>
        </div>

        <% 
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
            Student student = studentDao.findById(id);

            if (student == null) {
                response.sendRedirect("studentList.jsp");
                return;
            }
        %>

        <form action="updateStudent.jsp" method="post">
            <input type="hidden" name="id" value="<%= student.getId() %>">
            
            <div class="form-group">
                <label for="name">姓名：</label>
                <input type="text" id="name" name="name" value="<%= student.getName() %>" required>
            </div>
            
            <div class="form-group">
                <label for="age">年龄：</label>
                <input type="number" id="age" name="age" value="<%= student.getAge() %>" required>
            </div>
            
            <div class="form-group">
                <label for="gender">性别：</label>
                <select id="gender" name="gender" required>
                    <option value="男" <%= student.getGender().equals("男") ? "selected" : "" %>>男</option>
                    <option value="女" <%= student.getGender().equals("女") ? "selected" : "" %>>女</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="email">邮箱：</label>
                <input type="email" id="email" name="email" value="<%= student.getEmail() %>" required>
            </div>
            
            <div class="form-group">
                <label for="phone">电话：</label>
                <input type="text" id="phone" name="phone" value="<%= student.getPhone() %>" required>
            </div>
            
            <div class="btn-group">
                <input type="submit" value="保存修改" class="btn btn-primary">
                <a href="studentList.jsp" class="btn btn-secondary">取消</a>
            </div>
        </form>
    </div>
</body>
</html><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/31
  Time: 08:41
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.Student" %>
<%@ page import="com.hh.dao.StudentDao" %>
<html>
<head>
    <title>修改学生信息</title>
    <style>
        form { width: 500px; margin: 0 auto; }
        .form-group { margin: 10px 0; }
        label { display: inline-block; width: 100px; }
        input, select { width: 300px; padding: 5px; }
        .submit-btn { margin-left: 100px; padding: 8px 20px; }
    </style>
</head>
<body>
<h1>修改学生信息</h1>

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
    Student student = studentDao.findById(id);

    if (student == null) {
        response.sendRedirect("studentList.jsp");
        return;
    }
%>

<form action="updateStudent.jsp" method="post">
    <input type="hidden" name="id" value="<%= student.getId() %>">

    <div class="form-group">
        <label for="name">姓名：</label>
        <input type="text" id="name" name="name" value="<%= student.getName() %>" required>
    </div>

    <div class="form-group">
        <label for="age">年龄：</label>
        <input type="number" id="age" name="age" value="<%= student.getAge() %>" required>
    </div>

    <div class="form-group">
        <label for="gender">性别：</label>
        <select id="gender" name="gender" required>
            <option value="男" <%= student.getGender().equals("男") ? "selected" : "" %>>男</option>
            <option value="女" <%= student.getGender().equals("女") ? "selected" : "" %>>女</option>
        </select>
    </div>

    <div class="form-group">
        <label for="email">邮箱：</label>
        <input type="email" id="email" name="email" value="<%= student.getEmail() %>" required>
    </div>

    <div class="form-group">
        <label for="phone">电话：</label>
        <input type="text" id="phone" name="phone" value="<%= student.getPhone() %>" required>
    </div>

    <div class="form-group">
        <input type="submit" value="保存修改" class="submit-btn">
        <a href="studentList.jsp">取消</a>
    </div>
</form>
</body>
</html>