<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/22
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
  <head>
    <title>Login</title>
    <style>
      * {
        margin: 0;
        padding: 0;
      }

      html {
        height: 100%;
        width: 100%;
        overflow: hidden;
        margin: 0;
        padding: 0;
        background: url(imgs/pink.jpg) no-repeat;
        background-size: 100% 100%;
        -moz-background-size: 100% 100%;
      }

      body {
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100%;
      }

      #loginDiv {
        width: 40%;
        height: 320px;
        display: flex;
        justify-content: center;
        align-items: center;
        background-color: rgba(75, 81, 95, 0.3);
        box-shadow: 7px 7px 17px rgba(52, 56, 66, 0.5);
        border-radius: 5px;
      }

      #name_trip {
        margin-left: 15px;
        margin-top: 10px;
        color: azure;
      }

      #password_trip {
        margin-left: 7px;
        margin-top: 10px;
        color: azure;
      }

      .switch{
        color: azure;
      }

      input {
        margin-left: 30px;
        border-radius: 5px;
        border-style: hidden;
        height: 30px;
        width: 140px;
        background-color: rgba(216, 191, 216, 0.5);
        outline: none;
        color: #f0edf3;
        padding-left: 10px;
      }

      .button {
        border-color: cornsilk;
        background-color: rgba(100, 149, 237, .7);
        color: aliceblue;
        border-style: hidden;
        border-radius: 5px;
        width: 100px;
        height: 35px;
        font-size: 16px;
      }
    </style>
  </head>

  <body>
    <div id="loginDiv">
      <form id="form" action = "LoginServlet" method = "post">
        <h1 style="text-align: center;color: aliceblue;">LOGIN    IN</h1><br/>
       <label id="name_trip">
         Account:<input type="text" name="account"/><br><br/>
        </label>

        <label id="password_trip">
          Password:<input type="password" name="password"/>
        </label>

        <div style="text-align: center;margin-top: 30px;">
          <input class="button" type = "submit" value = "Login">
          <br><br><p class="switch">No account? Click to Register:</p><br/>
          <input class="button" type = "button" value = "Register" onclick="jumpRegister()">
        </div>
      </form>
    </div>
  </body>
  <script type="text/javascript">
    function jumpRegister() {
      window.location.href = "Register.jsp";
    }
  </script>
</html>
