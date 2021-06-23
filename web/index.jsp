<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jc</title>
    <link rel="stylesheet" href="static/css/iconfont.css">
    <link rel="stylesheet" href="static/css/index.css">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <!-- 使用ajax作出错误提示 -->
    <script >
        function err() {
            $.post({
                url: "${pageContext.request.contextPath}/ajaxForLogin",
                data:{'username':$("#name").val(),'password':$("#pwd").val()},
                success:function (data) {
                    if (data!=null){
                        // var html = "";
                        // html += "<p>"+data+"</p>";
                        // console.log(html);
                        // $("#errorMsg").html(html).css("color","red");
                        document.getElementById("errorMsg").innerHTML=data;
                    }
                }
            });
        }
    </script>
    <style>
        #index-video {
            position: absolute;
            top: 0;
            left: 0;
            height: 100vh;
            width: 100%;
            object-fit: cover;
            z-index: -1;
        }

    </style>
</head>
<body>

<audio  autoplay="autoplay" loop  id="music">
    <source src="static/audio/summer.mp3">
</audio>
<video id="index-video" muted="" loop="" autoplay="" style="min-width:1440px" width="100%">
    <source src="20210606_212402.mp4" type="video/mp4">
</video>
<div class="login-box">
    <h1>登陆</h1>
    <p style="text-align: center;color: red" id="errorMsg">${error}</p>
<!--    <div id="errorMsg"></div>-->
    <form action="/login" method="post">
        <div class="input-box">
            <div class="input-text">
                <span class='iconfont icon-mine'></span>
                <input id="name" type="text" placeholder="用户名" name="username">
            </div>
            <div class="input-text">
                <span class='iconfont icon-lock'></span>
                <input id="pwd" type="password" placeholder="密码" name="password" onblur="err()">
            </div>
            <button type="submit" class="input-btn">登录</button>
            <div class="sign-up">
                还没账户？<a href="${pageContext.request.contextPath}/register">立即注册</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>