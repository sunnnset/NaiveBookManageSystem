<%--
  Created by IntelliJ IDEA.
  User: XueyanLiu
  Date: 2021/3/4
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 30px;
      }

      h3{
        width: 300px;
        height: 40px;
        margin: 100px auto;
        text-align: center;
        line-h: 40px;
        background: lightblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
<h3>
  <a href="${pageContext.request.contextPath}/book/allBooks">进入书籍页面</a>
</h3>
  </body>
</html>
