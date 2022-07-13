<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/25
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理用户</title>
    <style>
        * {
            margin: 0px;
            padding: 0px;
        }

        li {
            list-style: none;
            float: left;
            width: 100px;
            height: 50px;
            text-align: center;
        }

        * {
            margin: 0px;
            padding: 0px;
        }

        .navbar-fluid {
            height: 50px;
            width: 100%;
            background-color: #3c4043;
            line-height: 50px
        }


        .navbar-main a {
            color: white;
            font-size: 16px;
            text-decoration: none;
        }

        .navbar-main_part1 {
            background-color: #3c4043;
            float: left;
            height: 50px;
            width: 150px;
            text-align: center;
        }

        .navbar-main_part1:hover {
            background-color: #363432;
        }

        .navbar-main_part2 {
            height: 50px;
            width: 150px;
            float: left;
            text-align: center;
        }

        .navbar-main_part2:hover {
            background-color: #363432;
        }

        .navbar-main_part3 {
            height: 50px;
            width: 150px;
            float: right;
            text-align: center;
        }

        .navbar-main_part3:hover {
            background-color: #363432;
        }

        .clear {
            clear: both;
        }

        .main_left {
            width: 400px;
            height: 500px;
            margin-top: 50px;
            margin-left: 50px;
            float: left;
        }

        .main_right {
            margin-right: 40px;
            width: 920px;
            border: 10px solid white;
            border-radius: 5px;
            float: right;
            margin-top: 35px;
            margin-bottom: 90px;
        }

        table {
            width: 900px;
            border-collapse: collapse;
            margin: 10px 120px 30px 10px;
            line-height: 40px;
            text-align: center;
        }

        table #ae {
            color: cadetblue;
        }

        table #ad {
            color: crimson;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        th {
            background-color: #3F3F3F;
            color: white;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        td {
            height: 30px;
            vertical-align: middle;
            border-bottom: 1px solid #ddd;
        }

        .btn_add {
            width: 80px;
            height: 35px;
            background-color: #3F3F3F;
            text-decoration: none;
            color: whitesmoke;
            cursor: pointer;
        }
    </style>
</head>
<body>
<form action="AdminServlet" method="post">
    <div class="navbar-fluid">
        <div class="navbar-main">
            <a href="AdminServlet?type=cfList">
                <div class="navbar-main_part1">酒店管理</div>
            </a>
            <a href="AdminServlet?type=userList">
                <div class="navbar-main_part2">用户管理</div>
            </a>
            <a href="">
                <div class="navbar-main_part2">订单管理</div>
            </a>
            <a href="AdminServlet?type=logout">
                <div class="navbar-main_part3">退出登录</div>
            </a>
        </div>
    </div>

    <a class="clear"></a>
    <div class="clear"></div>

    <div class="main">
        <h1>欢迎，管理员${sessionScope.user.name}！</h1>
        <div class="main_left" style="background-color: gray;">
            <a href="AdminServlet?type=editUser&id=0">
                <button type="button" class="btn_add">录入</button>
            </a>
        </div>
        <div class="main_right" style="background-color: white;">
            <div>
                <table class="table">
                    <tr>
                        <th>ID</th>
                        <th>账号</th>
                        <th>密码</th>
                        <th>用户名</th>
                        <th>性别</th>
                        <th>生日</th>
                        <th>手机号</th>
                        <th>用户类型</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${ubList }" var="item">
                        <tr>
                            <td>${item.id }</td>
                            <td>${item.account }</td>
                            <td>${item.password }</td>
                            <td>${item.name }</td>
                            <td>${item.sex }</td>
                            <td>${item.birth }</td>
                            <td>${item.mob }</td>
                            <td>${item.type }</td>
                            <td>
                                <a id="ae" href="AdminServlet?type=editUser&id=${item.id }">编辑</a>
                                <a id="ad" href="javascript:deleteUser(${item.id });">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</form>

<script type="text/javascript" src="js/jquery.js"></script>

<script>
    function deleteUser(id) {
        var r = confirm("确定要删除该用户信息吗？");
        if (r === true) {
            $.ajax({
                type: "post",
                url: "AdminServlet?type=deleteUser",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    if (data.status === "success") {
                        alert(data.message);
                        window.location.href = "AdminServlet?type=userList";
                    } else {
                        alert(data.message);
                    }
                }
            });
        } else {
            return false;
        }
    }
</script>
</body>
</html>