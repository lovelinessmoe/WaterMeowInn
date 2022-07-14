<%--
  Created by IntelliJ IDEA.
  User: loveliness
  Date: 2022/7/14
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="navbar-fluid">
    <div class="navbar-main">
        <a href="AdminServlet?type=cfList">
            <div class="navbar-main_part1">酒店管理</div>
        </a>
        <a href="AdminServlet?type=userList">
            <div class="navbar-main_part2">用户管理</div>
        </a>
        <a href="AdminServlet?type=listAllOrder">
            <div class="navbar-main_part2">订单管理</div>
        </a>
        <a href="#">
            <div class="navbar-main_part3">你好${sessionScope.user.name}</div>
        </a>
        <a href="AdminServlet?type=logout">
            <div class="navbar-main_part3">退出登录</div>
        </a>
    </div>
</div>

<a class="clear"></a>
<div class="clear"></div>

</body>
</html>
