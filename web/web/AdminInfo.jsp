<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员信息页面</title>
</head>
<body>
    <form action="">
        管理员ID：<input type="text" value="${requestScope.a.aid}" readonly/>
        管理员账号：<input type="text" value="${requestScope.a.ausername}" readonly/>
        管理员密码：<input type="text" value="${requestScope.a.apassword}" readonly/>
    </form>
</body>
</html>