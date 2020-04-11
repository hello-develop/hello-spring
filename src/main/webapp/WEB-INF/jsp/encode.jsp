<%--
  Created by IntelliJ IDEA.
  User: cc
  Date: 2019-4-16
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>中文乱码问题</title>
</head>
<body>
欢迎语：${welcome} <br/>
<br/>
${username} 登录..
<form method="post" action="/hello/postEncode">
    <label>
        <input type="text" name="username"/>
    </label>
    <label>
        <input type="password" name="password"/>
    </label>
    <input type="submit"/>
</form>
</body>
</html>
