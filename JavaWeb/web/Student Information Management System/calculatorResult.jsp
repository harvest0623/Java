<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/24
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");

    String num1Str = request.getParameter("num1");
    String operator = request.getParameter("operator");
    String num2Str = request.getParameter("num2");

    double num1 = Double.parseDouble(num1Str);
    double num2 = Double.parseDouble(num2Str);
    double result = 0;

    switch (operator) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            if (num2 == 0) {
                throw new ArithmeticException("除数不能为零！");
            }
            result = num1 / num2;
            break;
        default:
            throw new IllegalArgumentException("无效的运算符！");
    }

    String expression = num1 + " " + operator + " " + num2;
    request.setAttribute("result", String.valueOf(result));
    request.setAttribute("expression", expression);
%>

<jsp:include page="calculatorForm.jsp" />