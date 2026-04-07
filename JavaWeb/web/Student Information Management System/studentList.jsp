<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
%>
<html>
<head>
    <title>学生列表</title>
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
            max-width: 1000px;
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

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 30px;
        }

        th {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 15px;
            text-align: left;
        }

        td {
            padding: 12px;
            border-bottom: 1px solid #e0e0e0;
        }

        tr:hover {
            background: #f5f5f5;
        }

        .no-data {
            text-align: center;
            padding: 40px;
            color: #999;
            font-size: 1.2em;
        }

        .btn-group {
            text-align: center;
        }

        .btn {
            padding: 12px 30px;
            border-radius: 25px;
            text-decoration: none;
            transition: all 0.3s ease;
            display: inline-block;
            margin: 0 10px;
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
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>📋 学生信息列表</h2>
        </div>

        <%
            List<Map<String, String>> students = (List<Map<String, String>>) session.getAttribute("students");
            if (students == null || students.size() == 0) {
        %>
        <div class="no-data">
            <p>暂无学生信息，请先登记学生</p>
        </div>
        <%
        } else {
        %>
        <table>
            <thead>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>邮箱</th>
                <th>电话</th>
                <th>登记时间</th>
            </tr>
            </thead>
            <tbody>
            <%
                for (int i = 0; i < students.size(); i++) {
                    Map<String, String> student = students.get(i);
            %>
            <tr>
                <td><%= i + 1 %></td>
                <td><%= student.get("name") %></td>
                <td><%= student.get("age") %></td>
                <td><%= student.get("gender") %></td>
                <td><%= student.get("email") %></td>
                <td><%= student.get("phone") %></td>
                <td><%= student.get("registerTime") %></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
        <%
            }
        %>

        <div class="btn-group">
            <a href="register.jsp" class="btn btn-primary">添加学生</a>
            <a href="index.jsp" class="btn btn-secondary">返回首页</a>
        </div>
    </div>
</body>
</html>