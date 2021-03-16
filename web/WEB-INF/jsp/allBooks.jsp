<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: XueyanLiu
  Date: 2021/3/4
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column"></div>
        <div class="page-header">
            <h1>
                <center>
                <small>书籍列表 —————— 显示所有书籍</small>
                </center>
            </h1>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBook">新增书籍</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBooks">显示全部</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">

                <form  class="form-inline" action="${pageContext.request.contextPath}/book/searchBook" method="post" style="float: right">
                    <input type="text" name="bookName" class="form-control" placeholder="请输入要查询的书籍名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>

    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="book" items="${booksList}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/editBook?id=${book.bookID}">修改</a>
                            &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<center>
    <a href="${pageContext.request.contextPath}/logOut">注销</a>
</center>
</body>
</html>
