<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/23
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Register</title>
    <style>
        *{margin:0;
            padding:0;
            box-sizing:border-box;
        }
        body {
            background: url(imgs/pink.jpg) no-repeat center 0px fixed;
            background-size: cover;
        }
        .login {
            position: absolute;
            top: 50%;
            left: 50%;
            margin: -150px 0 0 -150px;
            width:300px;
            height:300px;
        }
        .login h1 {
            color:#555555;
            text-shadow: 0px 10px 10px #CDC673;
            letter-spacing:2px;text-align:center;
            margin-bottom:20px;
        }
        input{
            padding:10px;
            width:100%;
            color:white;
            margin-bottom:10px;
            background-color: #555555;
            border: 1px solid black;
            border-radius:5px;
            letter-spacing:2px;
        }
        label{
            color: #555555;
        }
        .button{
            margin-left: 30px;
            width:100px;
            padding:10px;
            margin-bottom:10px;
            background-color:#555555;
            border:1px solid black;
            border-radius:5px;
            cursor:pointer;
        }
    </style>
</head>
<body>
<div class="headtop"></div>
<div class="login">
    <h1>Login</h1>
    <form action = "UserServlet?type=register" method = "post">
        <label>
            Account:<input type="text" name="account"/><br>
        </label>
        <label>
            Password:<input type="text" name="password"/><br>
        </label>
        <label>
            Name:<input type="text" name="name"/><br>
        </label>
        <label>
            Sex:<input type="text" name="sex"/><br>
        </label>
        <label>
            Birthday:<input type="text" name="birth"/><br>
        </label>
        <label>
            TEL:<input type="text" name="mob"/><br>
        </label>
        <br><br><br>
        <input class="button" type = "button" value = "Login" onclick=jumpLogin()>
        <input class="button" type = "submit" value = "Register" >
    </form>
</div>

</body>
<script type="text/javascript">
    function jumpLogin() {
        window.location.href = "Login.jsp";
    }
</script>
</html>
