<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引用bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1 style="text-align: center;color: rgba(47,192,234,0.5)">
                    修改书籍
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form action="/book/updateBook" method="post">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名字</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="text" name="bookID" class="text-input" value="${book.getBookID()}"></td>
                        <td><input type="text" name="bookName" class="text-input"  value="${book.getBookName()}" ></td>
                        <td><input type="text" name="bookCounts" class="text-input" value="${book.getBookCounts()}" ></td>
                        <td><input type="text" name="detail" class="text-input" value="${book.getDetail()}"></td>
                        <td><button type="submit" class="button">提交</button></td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</div>

