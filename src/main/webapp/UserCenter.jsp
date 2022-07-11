<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/23
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>UserCenter</title>
    <style type="text/css">
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


        .main_left a {
            text-decoration: none;
            color: white;
            font-size: 18px;
        }

        .clear {
            clear: both;
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

        .navbar-fluid {
            color: whitesmoke;
        }

    </style>
</head>
<body>

<form action="UserServlet" method="post">
    <div class="navbar-fluid">
        <h1>欢迎，${sessionScope.user.name}！</h1>
    </div>

    <a class="clear"></a>
    <div class="clear"></div>

    <div class="main">


        <div class="main_right" style="background-color: white;">


            <div>
                <table class="table">

                    <tr>
                        <td>门牌号</td>
                        <td>价格</td>
                        <td>房间类型</td>
                        <td>房间状态</td>
                        <td>众筹金额</td>
                        <td>已筹金额</td>
                        <td>进度</td>
                    </tr>
                    <c:forEach items="${hotelList }" var="item">
                        <tr>
                            <td>${item.roomNum }</td>
                            <td>${item.price }</td>
                            <td>${item.type }</td>
                            <td>${item.state }</td>
                            <td>
                                <div class="button"><a href="javascript:fundMoney1(${item.roomNum });">捐赠￥10</a></div>
                            </td>
                            <td>
                                <div class="button"><a href="javascript:fundMoney2(${item.roomNum });">捐赠￥50</a></div>
                            </td>
                            <td>
                                <div class="button"><a href="javascript:fundMoney3(${item.roomNum });">捐赠￥100</a></div>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <br>
                <a href="UserServlet?type=logout">退出登录</a>

            </div>
        </div>
    </div>
</form>


<script type="text/javascript" src="js/jquery.js"></script>

<script src="js/script.js"></script>

<script>
    function fundMoney3(id) {
        var r = confirm("要向该项目捐赠￥100吗？");
        if (r === true) {
            $.ajax({
                type: "post",
                url: "UserServlet?type=increase&value=100",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    if (data.status === "success") {
                        alert(data.message);
                        window.location.href = "UserServlet?type=query";
                    } else {
                        alert(data.message);
                    }
                }
            });
        } else {
            return false;
        }
    }

    function fundMoney2(id) {
        var r = confirm("要向该项目捐赠￥50吗？");
        if (r === true) {
            $.ajax({
                type: "post",
                url: "UserServlet?type=increase&value=50",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    if (data.status === "success") {
                        alert(data.message);
                        window.location.href = "UserServlet?type=query";
                    } else {
                        alert(data.message);
                    }
                }
            });
        } else {
            return false;
        }
    }

    function fundMoney1(id) {
        var r = confirm("要向该项目捐赠￥10吗？");
        if (r === true) {
            $.ajax({
                type: "post",
                url: "UserServlet?type=increase&value=10",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    if (data.status === "success") {
                        alert(data.message);
                        window.location.href = "UserServlet?type=query";
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
