<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>企业级员工管理平台</title>
    <link rel="stylesheet" href="css/font-awesome.min.css"/>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        html, body {
            height: 100%;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
        }

        .welcome-container {
            width: 100%;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        }

        .welcome-box {
            text-align: center;
            color: white;
            padding: 40px;
            animation: fadeInUp 0.8s ease-out;
        }

        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(40px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        .welcome-icon {
            width: 100px;
            height: 100px;
            background: rgba(255, 255, 255, 0.2);
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 30px;
            backdrop-filter: blur(10px);
            animation: pulse 2s ease-in-out infinite;
        }

        @keyframes pulse {
            0%, 100% {
                transform: scale(1);
            }
            50% {
                transform: scale(1.05);
            }
        }

        .welcome-icon i {
            font-size: 48px;
        }

        .welcome-title {
            font-size: 36px;
            font-weight: 700;
            margin-bottom: 16px;
            letter-spacing: 2px;
        }

        .welcome-desc {
            font-size: 16px;
            opacity: 0.9;
            margin-bottom: 40px;
            line-height: 1.6;
        }

        .welcome-btn {
            display: inline-flex;
            align-items: center;
            gap: 10px;
            padding: 14px 40px;
            background: white;
            color: #667eea;
            border: none;
            border-radius: 50px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            text-decoration: none;
            transition: all 0.3s ease;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
        }

        .welcome-btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.3);
        }

        .welcome-btn i {
            font-size: 18px;
        }
    </style>
</head>
<body>
<div class="welcome-container">
    <div class="welcome-box">
        <div class="welcome-icon">
            <i class="fa fa-users"></i>
        </div>
        <h1 class="welcome-title">企业级员工管理平台</h1>
        <p class="welcome-desc">
            高效、便捷的企业员工信息管理系统<br>
            支持员工信息的增加、删除、修改、查询和分页展示
        </p>
        <a href="login.html" class="welcome-btn">
            <i class="fa fa-sign-in"></i>
            进入系统
        </a>
    </div>
</div>
</body>
</html>
