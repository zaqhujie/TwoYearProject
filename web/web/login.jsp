<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册页面</title>
<meta name="author" content="DeathGhost">
<link rel="stylesheet" type="text/css" href="css/style.css" tppabs="css/style.css">
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="js/jquery.js"></script>
<script src="js/verificationNumbers.js" tppabs="js/verificationNumbers.js"></script>
<script src="js/Particleground.js" tppabs="js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码
  createCode();
  //测试提交，对接程序删除即可
  $(".submit_btn").click(function(){
	  location.href="javascrpt:;"/*tpa=http://***index.html*/;
	  });
});
</script>
</head>
<body>
<dl class="admin_login">
 <dt>
  <strong>会员登录</strong>
  <em>VIP Login</em>
 </dt>
 <dd>
  <input type="text" placeholder="账号" class="login_txtbx">
 </dd>
 <dd>
  <input type="password" placeholder="密码" class="login_txtbx">
 </dd>
 
 <dd>
  <input type="button" value="立即登陆" class="submit_btn">
 </dd>
 <dd>
	<a href="register.jsp">注册</a>
 </dd>
</dl>
<script src="http://www.w2bc.com/scripts/2bc/_gg_980_90.js" type="text/javascript"></script></body>
</html>
    