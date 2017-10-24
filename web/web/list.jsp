<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/list.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<title>会员列表页面</title>
</head>
<body>
    <input type="text" name="findVal" id="text"/>
    <input type="button" value="搜索" id="btn"/>
    <a href="Admintest.action">回到列表</a>
	<table border="1px solid black" id="tbl">
        <tr>
            <th>管理员id</th>
            <th>管理员账号</th>
            <th>管理员密码</th>
            <th>操作</th>
        </tr>
        <c:forEach var="l" items="${requestScope.list}">
            <tr>
                <td class="aid">${l.aid}</td>
                <td class="ausername">${l.ausername}</td>
                <td class="apassword">${l.apassword}</td>
                <td>
                    <a href="AdmindeleteAdmin?aid=${l.aid}"><input type="button" value="删除"/></a>
                    <a href="AdminqueryAdminById?aid=${l.aid}"><input type="button" value="修改"/></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        第${requestScope.page.pageno}/${requestScope.page.totalpage}页&nbsp;&nbsp;
        <a href="Admintest.action">首页</a>
        <c:choose>
            <c:when test="${requestScope.page.pageno > 1}">
                <a href="Admintest.action?no=${requestScope.page.pageno-1 }">上一页</a>
                <a href="javascript:alert(${requestScope.page.pageno});"
            </c:when>
            <c:otherwise>
                <a href="javascript:alert('已经是第一页了,没有上一页!');">上一页</a>
            </c:otherwise>
        </c:choose>
        <c:choose>
            <c:when test="${requestScope.page.pageno < requestScope.page.totalpage}">
                <a href="Admintest.action?no=${requestScope.page.pageno+1}">下一页</a>
            </c:when>
            <c:otherwise>
                <a href="javascript:alert('已经是最有一页了,没有下一页!');">下一页</a>
            </c:otherwise>
        </c:choose>

        <a href="Admintest.action?no=${requestScope.page.totalpage}">末页</a>
        &nbsp;&nbsp;
        共${requestScope.page.totalcount}条

    </div>
    <a href="index.jsp">回到首页</a>
    <a href="register.jsp">注册页面</a>
    <a href="login.jsp">登录页面</a>
</body>
</html>