<%--
  Created by IntelliJ IDEA.
  User: MC
  Date: 2021/1/29
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">点击查询所有账户信息</a>
    <form action="account/save" method="post">
        姓名<input type="text" name="name"><br/>
        金额<input type="text" name="money"><br/>
        <input type="submit" value="保存">
    </form>
</body>
</html>
