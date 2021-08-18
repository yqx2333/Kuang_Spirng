<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2021/8/18
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
</head>
<body>

<form action="/helloServlet" method="post">
    <%-- method会被提交到后台接收处理 --%>
    method:<input type="text" name="method">
    <input type="submit" name="提交">
</form>


</body>
</html>
