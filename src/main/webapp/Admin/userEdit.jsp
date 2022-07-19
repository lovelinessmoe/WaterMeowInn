<%--
  Created by IntelliJ IDEA.
  User: 刺猬
  Date: 2021/6/25
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>用户信息</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            padding: 0;
            margin: 0;
            font-family: 'Nunito', sans-serif;
            background-color: #262527;
            overflow:hidden;
        }

        input, textarea, button ,select{
            font-family: 'Nunito', sans-serif;
        }

        .wrapper {
            width: 100%;
            height: 100vh;
            color: #fae881;
            overflow:hidden;
        }

        .flex_box {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }

        form {
            position: absolute;
            padding: 30px 20px;
            width: 320px;
            border-radius: 7px;
            background-color: white;
            backdrop-filter: blur(5px);
            background-color: rgba(158, 189, 199, 0.288);
            overflow: hidden;
        }

        input, textarea ,select {
            padding: 8px 10px;
            margin: 3px 8px 16px 8px;
            background-color: rgba(222, 239, 248, 0.877);
            border: 0px transparent;
            border-radius: 5px;
            color:rgb(97, 4, 184);
            font-size: 16px;
            word-break: break-all; /* haven't found the best solution here yet, paragraphs are difficult to deal with */
            hyphens: auto;
            z-index: 1;
        }

        label {
            margin: 0 8px;
            font-size: 14px;
            color: white;
        }

        button {
            padding: 8px 14px;
            margin: 20px 8px 0 0;
            border-width: 0px;
            border-radius: 5px;
            color: white;
            background-color: #b69269;
            transition: 0.3s;
            z-index: 1;
        }

        button:hover {
            color: rgb(60, 35, 153);
            background-color: white;
        }

        .star svg {
            height: 100%;
            width: auto;
        }


        .ghost > div {
            margin: 0;
            padding: 0;
            transition: 5s;
        }


        @keyframes fade {
            0% {
                opacity: 1;
                transform: translate(0vw, 0) skew(0);
            }
            20% {
                opacity: 0.8;
                transform: translate(0vw, 0) skew(0);
            }

            100% {
                opacity: 0;
                transform: translate(50vw, -50vh) skew(-45deg);
            }
        }

        @keyframes fade_in {
            0% {
                opacity: 0;
                transform: translate(-50vw, 150vh) skew(-45deg);
            }
            50% {
                opacity: 0;
            }
            100% {
                opacity: 1;
                transform: translate(0) skew(0);
            }
        }

        ::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
            color: rgb(140, 145, 216);
        }

        :-ms-input-placeholder { /* Internet Explorer 10-11 */
            color: rgb(140, 145, 216);
        }

        ::-ms-input-placeholder { /* Microsoft Edge */
            color: rgb(140, 145, 216);
        }
    </style>

</head>
<body>

<div class="wrapper flex_box">
    <form method="post" action="AdminServlet?type=editUserHandle">
        <input type="hidden" value="${editingUserBean.id }" name="id">
        账号：<input type="text" name="account" value="${editingUserBean.account }"><br>
        密码：<input type="text" name="password" value="${editingUserBean.password }"><br>
        姓名：<input type="text" name="name" value="${editingUserBean.name }"><br>
        性别：
        <select name="sex" >
            <option value="0" ${editingUserBean.sex ==0?"selected":""}>女</option>
            <option value="1" ${editingUserBean.sex ==1?"selected":""}>男</option>
        </select><br>
        生日：<input type="date" name="birth" value="${editingUserBean.birth }"><br>
        电话：<input type="text" name="mob" value="${editingUserBean.mob }"><br>
        类型：
        <select name="type1" >
            <option value="1" ${editingUserBean.type ==1?"selected":""}>管理员</option>
            <option value="2" ${editingUserBean.type ==2?"selected":""}>用户</option>
        </select><br>
        <input type="submit" value="提交" style="color: black;margin-left: 110px">
    </form>
</div>


</body>
</html>
