<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/23
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background: url(imgs/pink.jpg) no-repeat center 0px fixed;
            background-size: cover;
        }

        .login {
            position: absolute;
            top: 35%;
            left: 48%;
            margin: -150px 0 0 -150px;
            width: 320px;
            height: 300px;
        }

        .login h1 {
            color: #B4A0FF;
            text-shadow: 0px 10px 10px #9CA8B8;
            letter-spacing: 2px;
            text-align: center;
            margin-bottom: 20px;
            margin-left: 10px;
        }

        input {
            padding: 10px;
            width: 80%;
            margin-bottom: 10px;
            /*background-color: #555555;*/
            border: none;
            border-radius: 5px;
            letter-spacing: 2px;
        }

        label {
            color: #1781B5;
        }

        .button {
            margin-left: 40px;
            width: 100px;
            padding: 10px;
            margin-bottom: 10px;
            color: whitesmoke;
            background-color: #CCC1D2;
            /*border: 1px solid black;*/
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="headtop"></div>
<div class="login">
    <h1>Register</h1>
    <form action="UserServlet?type=register" method="post">
        <label>
            账号:&nbsp&nbsp&nbsp<input type="text" name="account"/>
        </label><br><br>
        <label>
            密码:&nbsp&nbsp&nbsp<input type="text" name="password"/>
        </label><br><br>
        <label>
            姓名:&nbsp&nbsp&nbsp<input type="text" name="name"/>
        </label><br><br>
        <label>
            性别:&nbsp&nbsp&nbsp<input type="text" name="sex"/>
        </label><br><br>
        <label>
            生日:&nbsp&nbsp&nbsp<input type="text" name="birth"/>
        </label><br><br>
        <label>
            电话:&nbsp&nbsp&nbsp<input type="text" name="mob"/>
        </label>
        <br><br><br>
        <input class="button" type="button" value="Login" onclick=jumpLogin()>
        <input class="button" type="submit" value="Register">
    </form>
</div>

</body>
<script type="text/javascript">
    function jumpLogin() {
        window.location.href = "Login.jsp";
    }
</script>
</html>
