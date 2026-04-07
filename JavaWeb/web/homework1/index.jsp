<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/21
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>整合版框架布局</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .top {
            height: 250px;
            border: 1px solid #000;
            padding: 20px;
        }
        .container {
            display: flex;
            height: calc(100vh - 250px);
        }
        .left {
            width: 150px;
            border: 1px solid #000;
            border-top: none;
            padding: 20px;
        }
        .right {
            flex: 1;
            border: 1px solid #000;
            border-left: none;
            border-top: none;
            padding: 20px;
        }
        iframe {
            width: 100%;
            height: 100%;
            border: none;
        }
        a {
            text-decoration: none;
            color: #2196F3;
            display: block;
            margin: 10px 0;
        }
        a:hover {
            color: #1976D2;
        }
    </style>
</head>
<body>
<div class="top">
    <iframe name="topFrame" src="top.jsp" width="100%" height="100%" frameborder="0"></iframe>
</div>

<div class="container">
    <div class="left">
        <h3>treemenu.jsp (Section B)</h3>
        <a href="login.jsp" target="mainFrame">Login</a>
        <a href="register.jsp" target="mainFrame">Register</a>
        <a href="author.jsp" target="mainFrame">作者个人简介</a>
    </div>

    <div class="right">
        <iframe name="mainFrame" src="main.jsp" width="100%" height="100%" frameborder="0"></iframe>
    </div>
</div>
</body>
</html>