<%--
  Created by IntelliJ IDEA.
  User: zgp
  Date: 2021/3/8
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/SpringMvc_BasisAnnotation/book/addBook5" method="post">
         出版时间：<input type="text" name="info['publish']"><br/>
         出版社<input type="text" name="info[editor]">
        <input type="submit" value="提交">
    </form>
</body>
</html>
