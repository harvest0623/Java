<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>实验6 - MyBatis Association 多表查询</title>
    <style>
        body { font-family: "微软雅黑", sans-serif; margin: 40px; }
        h2   { color: #2c3e50; }
        table{ border-collapse: collapse; width: 100%; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }
        th,td{ border: 1px solid #ddd; padding: 10px 14px; text-align: center; }
        th   { background-color: #3498db; color: white; }
        tr:nth-child(even){ background-color: #f8f9fa; }
        tr:hover{ background-color: #ecf0f1; }
    </style>
</head>
<body>
<h2>📦 商品列表（含关联用户）</h2>
<p>共 <b>${goodsList != null ? goodsList.size() : 0}</b> 条记录</p>

<table>
    <tr>
        <th>商品编号</th>
        <th>商品标题</th>
        <th>类型</th>
        <th>价格</th>
        <th>库存</th>
        <th>所属用户ID</th>
        <th>用户名</th>
        <th>联系电话</th>
        <th>地址</th>
    </tr>

    <!-- 如果 goodsList 为空或未请求 Servlet，显示提示 -->
    <c:if test="${empty goodsList}">
        <tr>
            <td colspan="9" style="padding:30px; color:#999;">
                请先访问 <a href="${pageContext.request.contextPath}/goodsList">/goodsList</a> 触发查询
            </td>
        </tr>
    </c:if>

    <!-- 遍历展示，重点是 goods.user.name 这样的级联取值 -->
    <c:forEach items="${goodsList}" var="g">
        <tr>
            <td>${g.id}</td>
            <td>${g.title}</td>
            <td>${g.type}</td>
            <td>¥ ${g.price}</td>
            <td>${g.stock}</td>
            <td>${g.userId}</td>
            <td>${g.user.name}</td>
            <td>${g.user.phone}</td>
            <td>${g.user.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>