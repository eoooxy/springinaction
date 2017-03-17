<%--
  Created by IntelliJ IDEA.
  User: eoooxy
  Date: 2017/2/21
  Time: 下午8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<body>
<h1>Welcome to Spring</h1>
<h1>Multipart上传测试</h1>
<form id="form" enctype="multipart/form-data" action="/upload.do" method="post">
    <input id="file" name="file" type="file">
    <input type="submit" value="开始上传">
</form>
</body>
</html>
