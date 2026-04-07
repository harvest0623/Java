<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/23
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <style>
        body {
            padding: 20px;
            font-family: Arial, sans-serif;
        }
        form div {
            margin: 12px 0;
        }
        label {
            display: inline-block;
            width: 100px;
        }
        input[type="text"], input[type="password"], input[type="email"], select {
            padding: 5px;
            width: 220px;
        }
        input[type="checkbox"] {
            margin-right: 8px;
        }
        input[type="submit"], input[type="reset"] {
            padding: 6px 15px;
            cursor: pointer;
            margin-right: 10px;
        }
        h3 {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<h3 style="text-align:center">New Member</h3>
<form action="registerServlet" method="post">
    <div><label>ID:</label><input type="text" name="id" required></div>
    <div><label>Password:</label><input type="password" name="pwd" required></div>
    <div><label>Re-Password:</label><input type="password" name="repwd" required></div>
    <div><label>First Name:</label><input type="text" name="fname" required></div>
    <div><label>Last Name:</label><input type="text" name="lname" required></div>
    <div><label>Address:</label><input type="text" name="addr"></div>
    <div><label>City:</label><input type="text" name="city"></div>
    <div>
        <label>State:</label>
        <select name="state">
            <option>[Select State]</option>
            <option>California</option>
            <option>New York</option>
            <option>Texas</option>
        </select>
    </div>
    <div><label>Country:</label><input type="text" name="country" value="China" readonly></div>
    <div><label>Email Address:</label><input type="email" name="email" required></div>
    <div>
        <label>Select Interest:</label><br>
        <input type="checkbox" name="interest" value="tech">Technology
        <input type="checkbox" name="interest" value="ent">Enterprise
        <input type="checkbox" name="interest" value="res">Research
        <input type="checkbox" name="interest" value="gov">Government
        <input type="checkbox" name="interest" value="people">People
        <input type="checkbox" name="interest" value="life">Life Style
        <input type="checkbox" name="interest" value="opinion">Opinion
    </div>
    <div>
        <label>Question:</label>
        <select name="question">
            <option>[Select Question]</option>
            <option>您的生日？</option>
            <option>您的幸运数字？</option>
            <option>您的宠物名？</option>
        </select>
    </div>
    <div><label>Answer:</label><input type="text" name="answer" required></div>
    <div>
        <input type="submit" value="Submit Information">
        <input type="reset" value="Reset Form">
    </div>
</form>
</body>
</html>