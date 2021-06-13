<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>注册微雨</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">


</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="page-header text-center">
                <h1>注册微雨书屋</h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2 col-md-offset-5">
            <form action="/user/register" class="form-signin">
                <div class="form-group" style="margin-top: 80px;">
                    <label for="exampleInputEmail1">输入邮箱或者手机号</label>
                    <input name="user" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">输入密码</label>
                    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="checkbox">
                    <button type="submit" class="btn btn-primary btn-block" style="margin-top: 10px;">提交</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>