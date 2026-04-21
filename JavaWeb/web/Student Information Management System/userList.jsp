<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/21
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.hh.bean.User" %>
<%@ page import="com.hh.dao.UserDao" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>注册用户列表</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Microsoft YaHei', Arial, sans-serif;
            background: #f5f5f5;
            min-height: 100vh;
            padding: 20px;
        }

        .container {
            max-width: 1000px;
            margin: 0 auto;
            background: white;
            border-radius: 15px;
            padding: 40px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.1);
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

        .info {
            background: #e3f2fd;
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 30px;
            border-left: 4px solid #2196f3;
        }

        .info h4 {
            color: #1976d2;
            margin-bottom: 10px;
        }

        .info code {
            background: #f5f5f5;
            padding: 2px 4px;
            border-radius: 4px;
            font-family: 'Courier New', monospace;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 30px;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            font-weight: bold;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .btn-group {
            text-align: center;
        }

        .btn {
            padding: 10px 20px;
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

        .btn-danger {
            background: #f44336;
            color: white;
        }

        .btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.2);
        }

        .footer {
            text-align: center;
            margin-top: 30px;
            color: #666;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>注册用户列表</h2>
        </div>

        <div class="info">
            <h4>JavaBean 知识点：</h4>
            <ul>
                <li><strong>User.java</strong> - JavaBean 实体类，封装用户数据</li>
                <li><strong>UserDao.java</strong> - 数据访问对象，封装数据库操作</li>
                <li>本页面使用 <code>user.getXXX()</code> 方法获取Bean属性值</li>
            </ul>
        </div>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>用户名</th>
                    <th>密码</th>
                    <th>注册时间</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    UserDao userDao = new UserDao();
                    List<User> users = userDao.getAllUsers();
                    if (users != null && !users.isEmpty()) {
                        for (User user : users) {
                %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getUsername() %></td>
                    <td>********</td>
                    <td><%= user.getCreateTime() %></td>
                    <td>
                        <a href="deleteUser.jsp?id=<%= user.getId() %>" class="btn btn-danger" onclick="return confirm('确定要删除这个用户吗？');">删除</a>
                    </td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5" style="text-align: center; padding: 20px;">暂无用户数据</td>
                </tr>
                <% 
                    }
                %>
            </tbody>
        </table>

        <div class="btn-group">
            <a href="registerUser.jsp" class="btn btn-primary">+ 添加新用户</a>
            <a href="index.jsp" class="btn btn-secondary">返回首页</a>
        </div>

        <div class="footer">
            <p>&copy; 2026 学生信息管理系统 | JSP + JavaBean 模式实验</p>
        </div>
    </div>
</body>
</html><%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/4/21
  Time: 08:57
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