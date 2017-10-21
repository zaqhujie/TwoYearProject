<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员列表页面</title>
</head>
<body>
	<table border="1px solid black">
        <tr>
            <th>管理员id</th>
            <th>管理员账号</th>
            <th>管理员密码</th>
            <th>操作</th>
        </tr>
        <c:forEach var="l" items="${requestScope.list}">
            <tr>
                <td>${l.aid}</td>
                <td>${l.ausername}</td>
                <td>${l.apassword}</td>
                <td>
                    <a href="AdmindeleteAdmin?aid=${l.aid}"><input type="button" value="删除"/></a>
                    <a href="AdminqueryAdminById?aid=${l.aid}"><input type="button" value="删除"/></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>