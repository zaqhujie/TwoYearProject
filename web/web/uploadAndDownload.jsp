<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/24
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UploadAndDownload</title>
</head>
<body>
<!--在进行文件上传时，表单提交方式一定要是post的方式，因为文件上传时二进制文件可能会很大，
    还有就是enctype属性，这个属性一定要写成multipart/form-data，不然就会以二进制文本上传到服务器端-->
    <form action="fileUpload.action" method="post" enctype="multipart/form-data">
        username: <input type="text" name="username"><br>
        file: <input type="file" name="file"><br>
        <input type="submit" value="submit"> 　　
    </form>
</body>
</html>
