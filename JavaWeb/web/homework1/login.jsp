<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/23
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            padding: 20px;
            font-family: Arial, sans-serif;
        }
        form div {
            margin: 15px 0;
        }
        label {
            display: inline-block;
            width: 80px;
        }
        input[type="text"], input[type="password"] {
            padding: 5px;
            width: 200px;
        }
        input[type="submit"] {
            padding: 6px 15px;
            cursor: pointer;
        }
        h3 {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<h3>Please Log In</h3>
<form action="loginServlet" method="post">
    <div>
        <label>Login:</label>
        <input type="text" name="login" required>
    </div>
    <div>
        <label>Password:</label>
        <input type="password" name="password" required>
    </div>
    <div>
        <input type="submit" value="OK">
        <input type="submit" value="forget password">
    </div>
</form>
</body>
</html>