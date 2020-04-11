<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div>
    <p>${error_msg}</p>
    <form action="/login" method="post">
        <div><span>账号：</span><input name="username" type="text"/></div>
        <div><span>密码：</span><input name="password" type="password"/></div>
        <div><input type="submit"/></div>
    </form>
</div>
</body>
</html>
