<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2021/8/20
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 5px;
        }
        a{
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/books/allBook">跳转到书籍页面</a>
</h3>
</body>
</html>
