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
            margin: 0 auto;
            background-color: pink;
            border: 10px solid pink;
            border-radius: 5px;
            margin-top: 0px;
            margin-bottom: 90px;
        }

        table {
            width: 100%;
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

        .title {
            margin-top: 30px;
            text-align: center;
            background-color: #b69269;
        }

        .text {
            font-size: 25px;
        }

        #yd {
            height: 25px;
            width: 50px;
            cursor: pointer;
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

    </style>
</head>
<body>
<form action="UserServlet" method="post">
    <div class="navbar-fluid">
        <div class="navbar-main">
            <a href="#">
                <div class="navbar-main_part1">${sessionScope.user.name} ！欢迎光临</div>
            </a>
            <a href="AdminServlet?type=logout">
                <div class="navbar-main_part3">退出登录</div>
            </a>
        </div>
    </div>

    <a class="clear"></a>
    <div class="clear"></div>

    <div class="main">
        <div class="title">
            <span class="text">全部房间</span>
        </div>
        <div class="main_right">
            <div>
                <table class="table">
                    <tr>
                        <td>门牌号</td>
                        <td>价格</td>
                        <td>房间类型</td>
                        <td>房间状态</td>
                        <td>操作</td>
                    </tr>
                    <c:forEach items="${hotelList }" var="item">
                        <tr>
                            <td>${item.roomNum }</td>
                            <td>${item.price }</td>
                            <td>${item.type eq 0? "单人间":(item.type eq 1? "双人大床房":"标间")}</td>
                            <td>${item.state eq 0? "空闲":(item.state eq 1? "已预定":"已入住")}</td>
                            <td>
                                <c:if test="${item.state==0}">
                                    <a id="yd${item.roomNum}" onclick="changeState('${item.roomNum}')"
                                       href="PayServlet?roomNum=${item.roomNum}">预定</a>
                                </c:if>
                                <c:if test="${item.state!=0}">
                                    <a id="yd${item.roomNum}" href="javascript:;">已被使用</a>
                                </c:if>

                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <br>
    </div>
</form>


<script type="text/javascript" src="../js/jquery.js"></script>

<script src="js/script.js"></script>

<script>
    function changeState(id) {
        document.getElementById("yd" + id).innerHTML = '取消预定'
    }

</script>
</body>
</html>
