<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .form-group {
        margin-bottom: 25px;
    }

    .form-group label {
        display: block;
        color: #333;
        margin-bottom: 8px;
        font-weight: bold;
    }

    .form-group input, .form-group select {
        width: 100%;
        padding: 12px;
        border: 2px solid #e0e0e0;
        border-radius: 8px;
        font-size: 1em;
        transition: border-color 0.3s ease;
    }

    .form-group input:focus, .form-group select:focus {
        outline: none;
        border-color: #667eea;
    }

    .btn-submit {
        width: 100%;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        color: white;
        border: none;
        padding: 15px;
        border-radius: 8px;
        font-size: 1.1em;
        cursor: pointer;
        transition: all 0.3s ease;
    }

    .btn-submit:hover {
        transform: translateY(-2px);
        box-shadow: 0 5px 20px rgba(102, 126, 234, 0.4);
    }

    .result {
        background: #f0f7ff;
        padding: 20px;
        border-radius: 8px;
        margin-top: 20px;
        text-align: center;
    }

    .result-label {
        color: #666;
        margin-bottom: 10px;
    }

    .result-value {
        font-size: 2em;
        color: #667eea;
        font-weight: bold;
    }
</style>

<form action="calculatorResult.jsp" method="post">
    <div class="form-group">
        <label for="num1">第一个数字：</label>
        <input type="number" id="num1" name="num1" step="any" required placeholder="请输入数字">
    </div>

    <div class="form-group">
        <label for="operator">运算符：</label>
        <select id="operator" name="operator" required>
            <option value="+">+ (加法)</option>
            <option value="-">- (减法)</option>
            <option value="*">× (乘法)</option>
            <option value="/">÷ (除法)</option>
        </select>
    </div>

    <div class="form-group">
        <label for="num2">第二个数字：</label>
        <input type="number" id="num2" name="num2" step="any" required placeholder="请输入数字">
    </div>

    <button type="submit" class="btn-submit">计 算</button>
</form>

<%
    String result = (String) request.getAttribute("result");
    String expression = (String) request.getAttribute("expression");
    if (result != null) {
%>
<div class="result">
    <div class="result-label">计算结果：</div>
    <div class="result-value"><%= expression %> = <%= result %></div>
</div>
<%
    }
%>