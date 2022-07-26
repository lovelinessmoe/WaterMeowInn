<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2022/7/12
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理订单</title>
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

        .main_right {
            margin: 0 auto;
            border: 10px solid white;
            border-radius: 5px;
            margin-top: 0px;
            margin-bottom: 90px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 10px 120px 0px 0px;
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
        .cz{
            text-decoration: none;

        }
        #rz{
            color: cadetblue;
        }
        #td{
            color: crimson;
        }
    </style>
</head>
<body>
<form action="AdminServlet" method="post">
    <%@include file="AdminHead.jsp"%>

    <div class="main">
        <h1>${hotel_order_msg}</h1>

        <div class="main_right" style="background-color: white;">

                <table class="table">
                    <tr>
                        <th>订单号</th>
                        <th>支付宝订单号</th>
                        <th>用户ID</th>
                        <th>房间号</th>
                        <th>状态</th>
                        <th>价格</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${odlt }" var="item">
                        <tr>
                            <td>${item.orderId }</td>
                            <td>${item.ali_id }</td>
                            <td>${item.userId }</td>
                            <td>${item.roomNum }</td>
                            <td>${item.state eq 0? "未支付":(item.state eq 1? "已支付":(item.state eq 2? "已完成":"已退款"))}</td>
                            <td>${item.price }</td>
                            <td id="using">
                                <c:if test="${item.state eq 2}">
                                    <a class="cz" href="javascript:;">该订单已完成</a>
                                </c:if>
                                <c:if test="${item.state!=2}">
                                    <a id="rz" class="cz" href="AdminServlet?type=live&orderId=${item.orderId }" >入住</a>&nbsp
                                    <a id="js" class="cz" href="OrderServlet?type=finishorder&orderId=${item.orderId}">结束订单</a>&nbsp
                                    <a id="td" class="cz" href="OrderServlet?type=unsubscribe&orderId=${item.orderId}">退订</a>
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
        </div>
    </div>
</form>


<br>

<script type="text/javascript" src="../js/jquery.js"></script>

<script>

</script>
</body>
</html>
