<%--
  Created by IntelliJ IDEA.
  User: zgp
  Date: 2021/3/8
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>获取List</h1>
    <form action="/SpringMvc_BasisAnnotation/book/addBook4" method="post">
        <table>
            <tr>
                <td>作者的兴趣爱好</td>
                <td>
                    <input type="checkbox" value="足球" name="favorite.favorite">足球
                    <br>
                    <input type="checkbox" value="篮球" name="favorite.favorite">篮球
                    <br>
                    <input type="checkbox" value="乒乓球" name="favorite.favorite">乒乓球
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="提交">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
