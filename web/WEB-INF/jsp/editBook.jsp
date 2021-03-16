<%--
  Created by IntelliJ IDEA.
  User: XueyanLiu
  Date: 2021/3/4
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column"></div>
        <div class="page-header">
            <h1>
                <center>
                    <small>书籍列表 —————— 修改书籍</small>
                </center>
            </h1>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/editBook" method="post">
        <!--这里需要令bookID为只读-->
        <!--也可以将input type 设为hidden，不在页面上显示-->
        <div class="form-group">
            <label>书籍ID</label>
            <input type="text" name="bookID" class="form-control" value="${editBook.bookID}" readonly>
        </div>
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${editBook.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${editBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" name="detail" class="form-control" value="${editBook.detail}" required>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="提交" required>
        </div>

    </form>


</div>

</body>
</html>
