<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引用bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="static/css/reset.css">
    <style>
        /*.hy{*/
        /*    text-align: center;*/
        /*    font-family:;*/
        /*    font-size: 80px;*/
        /*    color:bisque;*/
        /*    background-color: rgba(0,0,255,0.4);*/
        /*}*/
        /*.nav{*/
        /*    width: 576px;*/
        /*    height: 34px;*/
        /*    background-color:rgba(202, 206, 214, 0.1);*/
        /*    margin: 30px auto;*/
        /*    border-radius: 7px;*/
        /*    box-shadow: 10px 5px 10px rgba(0,0,0,.5);*/
        /*    position: sticky;*/
        /*    top:0px;*/

        /*}*/
        /*.nav li{*/
        /*    line-height:34px;*/
        /*    float: left;*/
        /*}*/

        /*.nav a:hover{*/
        /*    background-color: #a673ff;*/
        /*}*/
        /*.nav a{*/
        /*    display: block;*/
        /*    padding: 0 20px;*/
        /*    text-decoration: none;*/
        /*    font-size: 26px;*/
        /*}*/
    </style>
</head>
<body>
<%--<div class="hy"><i style="font-size: 80px;color: aqua;"></i>welcome to here</div>--%>
<%--<ul class="nav">--%>
<%--    <li><a href="#">精彩瞬间</a></li>--%>
<%--    <li><a href="#">我的历史</a></li>--%>
<%--    <li><a href="#">我的破站</a></li>--%>
<%--    <li><a href="#">我的博客</a></li>--%>
<%--</ul>--%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
<h1>
    <small>书籍列表 —— 显示所有书籍</small>
</h1>
</div>
</div>
</div>
<div class="row">
    <div class="col-md-4 column">
        <a class="btn btn-primary"
           href="${pageContext.request.contextPath}/book/toAddBook">新增</a>
    </div>
</div>
<div class="row clearfix">
    <div class="col-md-12 column">
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
            <c:forEach var="book" items="${requestScope.get('list')}">
                <tr>
                    <td contenteditable="true">${book.getBookID()}</td>
                    <td contenteditable="true">${book.getBookName()}</td>
                    <td contenteditable="true">${book.getBookCounts()}</td>
                    <td contenteditable="true">${book.getDetail()}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/book/toUpdateBook/${book.getBookID()}">更改</a>
                        <a href="${pageContext.request.contextPath}/book/del/${book.getBookID()}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</div>
</body>
