<%--
  Created by IntelliJ IDEA.
  User: 33677
  Date: 2026/3/5
  Time: 08:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>$Title$</title>
    </head>
    <body>
        <%--现在时间是：<%=new java.util.Date()%>--%>

        <%--方法一：纯 JSP（使用 Java for 循环）--%>
        <%--<%--%>
        <%--    for (int i = 0; i < 50; i++) {--%>
        <%--        out.println("hello world<br>");--%>
        <%--    }--%>
        <%--%>--%>


        <%--方法二：纯 JavaScript（在客户端生成）--%>
        <%--<div id="output"></div>--%>
        <%--<script>--%>
        <%--    let html = '';--%>
        <%--    for (let i = 0; i < 50; i++) {--%>
        <%--        html += 'hello world<br>';--%>
        <%--    }--%>
        <%--    document.getElementById('output').innerHTML = html;--%>
        <%--</script>--%>


        <%--方法三：JSP 生成 JavaScript 数组，由 JavaScript 输出--%>
        <%--<div id="output"></div>
        <script>
            // 服务器端生成的数组（JSP 部分）
            var messages = [
                <% for (int i = 0; i < 50; i++) { %>
                "hello world"<% if (i < 49) { %>,<% } %>
                <% } %>
            ];

            // 客户端 JS 负责显示
            let html = '';
            for (let i = 0; i < messages.length; i++) {
                html += messages[i] + '<br>';
            }
            document.getElementById('output').innerHTML = html;
        </script>--%>

        <%--输出 1 - 100 的和--%>
        <%--<%
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
        %>
        <p>1 - 100 的和为：<%=sum%></p>--%>

        <%-- 5秒弹出消息框（alert），每隔1秒在页面中输出 hello world --%>
        <%--<script>
            setTimeout(function () {
                alert('5秒后弹出消息框');
            }, 5000);

            setInterval(function () {
                document.write('hello world<br>');
            }, 1000);
        </script>--%>

        <%--<div id="output"></div>  <!-- 用来显示输出的内容 -->
        <script type="text/javascript">
            var count = 0;  // 计数器，记录输出了几次
            var outputDiv = document.getElementById("output");  // 获取输出位置

            // 设置定时器，每隔1秒执行一次
            var timer = setInterval(function() {
                count++;  // 次数加1

                // 方式1：在页面上输出hello
                outputDiv.innerHTML += "hello " + count + "<br>";

                // 方式2：如果也想在控制台看到，可以加上这一行
                console.log("hello " + count);

                // 输出了5次后，清除定时器
                if(count >= 5) {
                    clearInterval(timer);
                    outputDiv.innerHTML += "-----输出结束-----";
                }
            }, 1000);  // 1000毫秒 = 1秒
        </script>--%>


        <%--<fieldset style="text-align: center">
            用户名：<input type="text" name="username"> <br>
            密码：<input type="password" name="password"> <br>
            确认密码：<input type="password" name="confirmPassword"> <br>
            邮箱：<input type="email" name="email"> <br>
            爱好：<input type="checkbox" name="hobby" value="reading" checked="checked"> 阅读
            <input type="checkbox" name="hobby" value="programmin"> 编程
            <input type="checkbox" name="hobby" value="dancing"> 跳舞
            <input type="checkbox" name="hobby" value="football"> 足球
            <br>
            <button onclick="register()">注册</button>
            <button>重置</button>
        </fieldset>

        <script type="text/javascript">
            function register() {
                var username = document.getElementById("username").value;
                if (username.trim() === '') {
                    alert("用户名不能为空");
                    return;
                }
                alert('注册成功，' +  username + '欢迎您!');
            }
        </script>--%>

    </body>
</html>
