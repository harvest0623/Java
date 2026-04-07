<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>错误页面</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Microsoft YaHei', Arial, sans-serif;
            background: linear-gradient(135deg, #f44336 0%, #e91e63 100%);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .error-container {
            background: white;
            border-radius: 15px;
            padding: 40px;
            text-align: center;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.2);
            max-width: 600px;
            width: 100%;
        }

        .error-icon {
            font-size: 4em;
            color: #f44336;
            margin-bottom: 20px;
        }

        h2 {
            color: #f44336;
            margin-bottom: 20px;
        }

        .error-message {
            background: #fee;
            color: #c33;
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 30px;
            text-align: left;
        }

        .error-details {
            color: #666;
            margin-bottom: 10px;
            word-break: break-all;
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
    <div class="error-container">
        <div class="error-icon">⚠</div>
        <h2>发生错误</h2>

        <div class="error-message">
            <p class="error-details"><strong>错误类型：</strong><%= exception.getClass().getName() %></p>
            <p class="error-details"><strong>错误信息：</strong><%= exception.getMessage() %></p>
        </div>

        <div>
            <a href="index.jsp" class="btn btn-primary">返回首页</a>
            <a href="javascript:history.back()" class="btn btn-secondary">返回上一页</a>
        </div>
    </div>
</body>
</html>