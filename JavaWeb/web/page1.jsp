<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/19
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int num = 5;
    int square = num * num;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>页面1</h3>
    <p>数值<%= num %>的平方是：<%= square %></p>

    <!-- 隐藏表单 -->
    <form action="page2.jsp" method="post">
        <input type="hidden" name="number" value="<%= num %>">
        <input type="submit" value="查看立方">
    </form>
</body>
</html>
