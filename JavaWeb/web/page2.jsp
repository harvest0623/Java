<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/19
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String numStr = request.getParameter("number");
    int num = Integer.parseInt(numStr);
    int cube = num * num * num;
%>
<html>
<body>
    <h3>页面2</h3>
    <p>数值<%= num %>的立方是：<%= cube %></p>
</body>
</html>
