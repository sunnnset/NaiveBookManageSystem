<%--
  Created by IntelliJ IDEA.
  User: XueyanLiu
  Date: 2021/3/4
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column"></div>
        <div class="page-header">
            <h1>
                <center>
                    <small>书籍列表 —————— 新增书籍</small>
                </center>
            </h1>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" name="bookName" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" name="bookCounts" class="form-control">
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" name="detail" class="form-control" required>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="提交" required>
        </div>

    </form>


</div>

</body>
</html>
