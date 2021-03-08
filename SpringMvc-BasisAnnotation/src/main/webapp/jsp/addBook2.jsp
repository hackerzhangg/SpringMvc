<%--
  Created by IntelliJ IDEA.
  User: zgp
  Date: 2021/3/5
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加图书</h1>
<form action="/SpringMvc_BasisAnnotation/book/addBook2" method="post">
    <table>
        <tr>
            <td>图书名称</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>图书作者</td>
            <td><input type="text" name="author.name"></td>
        </tr>
        <tr>
            <td>图书年龄</td>
            <td><input type="text" name="author.age"></td>
        </tr>
        <tr>
            <td>图书价格</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>出版时间</td>
            <td><input type="date" name="publishDate"></td>
        </tr>
        <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
