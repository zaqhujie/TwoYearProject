<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
    <title>注册页面</title>
    <meta name="author" content="DeathGhost">
    <link rel="stylesheet" type="text/css" href="css/style.css" tppabs="css/style.css">
</head>
<body>
<form action="Adminlogin.action">
        <strong>会员登录</strong>
        <em>VIP Login</em>
        <input type="text" placeholder="账号" class="login_txtbx" name="ausername"><input type="text" id="tips" readonly/><br>
        <input type="password" placeholder="密码" class="login_txtbx" name="apassword">
        <input type="submit" value="立即登陆" class="submit_btn">
        <a href="register.jsp">注册</a>
</form>
</body>
</html>
