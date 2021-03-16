<%--
  Created by IntelliJ IDEA.
  User: XueyanLiu
  Date: 2021/3/5
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<center>
    <h1>书籍管理系统登录</h1>
    <p>请先登录</p>

    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名<input type="text" name="userName"/>
        密码<input type="password" name="password"/>
        <input type="submit" value="提交">
    </form>
</center>

</body>
</html>
