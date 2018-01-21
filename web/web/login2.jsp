<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <base href="<%=basePath%>">

    <title>带有验证码登陆页面</title>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>

<h3>登陆界面</h3>

<form action="loginValidateAction.action" theme="simple">

    用户名:<s:textfield name="ausername" id="username"></s:textfield><input type="text" id="tips" readonly/><br>
    密码    :<s:password name="apassword"></s:password><br>
    验证码:<s:textfield name="checkCode"></s:textfield>
    <img src="createImageAction.action" onclick="this.src='createImageAction.action?'+ Math.random()" title="点击图片刷新验证码"/><br>
    <s:actionerror cssStyle="color:#7c83ff"/>

    <s:submit value="提交"></s:submit>

</form>

</body>
</html>