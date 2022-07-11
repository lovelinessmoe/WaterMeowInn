<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/25
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>管理众筹</title>
    <style>
        *{margin:0px;padding:0px;}
        li{list-style:none;float:left;width:100px;height:50px;text-align:center;}
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

        .navbar-main_part1:hover{
            background-color: #363432;
        }

        .navbar-main_part2 {
            height: 50px;
            width: 150px;
            float: left;
            text-align: center;
        }

        .navbar-main_part2:hover{
            background-color: #363432;
        }

        .navbar-main_part3 {
            height: 50px;
            width: 150px;
            float: left;
            text-align: center;
        }

        .navbar-main_part3:hover{
            background-color: #363432;
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

        tr:hover {background-color: #f5f5f5;}

        th{
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
    </style>
</head>
<body>
<form action="AdminServlet" method="post">
    <div class="navbar-fluid">

        <div class="navbar-main">
            <a href="AdminServlet?type=cfList">
                <div class="navbar-main_part1">众筹管理</div>
            </a>
            <a href="AdminServlet?type=userList">
                <div class="navbar-main_part2">用户管理</div>
            </a>
            <a href="AdminServlet?type=logout">
                <div class="navbar-main_part3">退出登录</div>
            </a>
        </div>
    </div>

    <a class="clear"></a>
    <div class="clear"></div>

    <div class="main">
        <h1>欢迎，${sessionScope.user.name}！</h1>

        <div class="main_right" style="background-color: white;">


            <div>
                <table class="table">
                    <tr>
                        <td>项目编号</td>
                        <td>image</td>
                        <td>项目</td>
                        <td>描述</td>
                        <td>众筹金额</td>
                        <td>已筹金额</td>
                        <td>进度</td>
                    </tr>
                    <c:forEach items="${cfList }" var="item">
                        <tr>
                            <td>${item.id }</td>
                            <td>${item.pic }</td>
                            <td>${item.name }</td>
                            <td>${item.exp }</td>
                            <td>￥${item.est }</td>
                            <td>￥${item.raised }</td>
                            <td>${item.pct }%</td>
                            <td><a href="AdminServlet?type=editCF&id=${item.id }">编辑</a></td>
                            <td><a href="javascript:deleteCF(${item.id });">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</form>



    <br>
    <a href="AdminServlet?type=editCF&id=0">添加</a>
    <script type="text/javascript" src="js/jquery.js"></script>

    <script>
        function deleteCF(id) {
            var r = confirm("确定要删除该方案吗？");
            if (r === true) {
                $.ajax({
                    type: "post",
                    url: "AdminServlet?type=deleteCF",
                    data: {id:id},
                    dataType: "json",
                    success: function(data){
                        if(data.status==="success"){
                            alert(data.message);
                            window.location.href="AdminServlet?type=cfList";
                        }else{
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
