<%--
  Created by IntelliJ IDEA.
  User: jinhang
  Date: 2022/7/13
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>支付成功</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <style>
        html, body {
            color: #333;
            margin: 0;
            height: 100%;
            font-family: "Myriad Set Pro", "Helvetica Neue", Helvetica, Arial, Verdana, sans-serif;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
            font-weight: normal;
        }

        * {
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        a {
            text-decoration: none;
            color: #000;
        }

        a, label, button, input, select {
            -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
        }

        img {
            width: 100%;
            height: auto;
            display: block;
            border: 0;
        }

        body {
            background: #ffffff;
            color: #666;
        }

        html, body, div, dl, dt, dd, ol, ul, li, h1, h2, h3, h4, h5, h6, p, blockquote, pre, button, fieldset, form, input, legend, textarea, th, td {
            margin: 0;
            padding: 0;
        }

        a {
            text-decoration: none;
            color: #08acee;
        }

        button {
            outline: 0;
        }

        button, input, optgroup, select, textarea {
            margin: 0;
            font: inherit;
            color: inherit;
            outline: none;
        }

        li {
            list-style: none;
        }

        a {
            color: #666;
        }


        /* 必要布局样式css */
        .aui-flexView {
            width: 100%;
            height: 100%;
            margin: 0 auto;
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-orient: vertical;
            -webkit-box-direction: normal;
            -webkit-flex-direction: column;
            -ms-flex-direction: column;
            flex-direction: column;
        }

        .aui-scrollView {
            width: 100%;
            height: 100%;
            -webkit-box-flex: 1;
            -webkit-flex: 1;
            -ms-flex: 1;
            flex: 1;
            overflow-y: auto;
            overflow-x: hidden;
            -webkit-overflow-scrolling: touch;
            position: relative;
            padding-bottom: 10px;
        }

        .aui-flex-box h1 {
            color: #303741;
            font-weight: 500;
            font-size: 1rem;
            overflow: hidden;
        }

        .aui-flex-box h2 {
            color: #333333;
            font-weight: 500;
            font-size: 1rem;
            overflow: hidden;
            display: -webkit-box;
            -webkit-line-clamp: 1;
            -webkit-box-orient: vertical;
            word-break: break-all;
            text-overflow: ellipsis;
        }


        .aui-flex-box p {
            color: #aba9a3;
            font-size: 12px;
        }

        .aui-sept-cell li {
            width: 33.33%;
            float: left;
            text-align: center;
            position: relative;
        }

        .aui-sept-cell li em {
            width: 18px;
            height: 18px;
            display: block;
            margin: 0 auto;
            border-radius: 100px;
            border: 3px solid #fff;
            text-align: center;
        }

        .aui-sept-cell li p {
            color: #fff;
            font-size: 14px;
            padding-top: 20px;
        }

        .aui-sept-cell li:after {
            height: 1px;
            position: absolute;
            z-index: 0;
            top: 8px;
            left: 80px;
            content: "";
            width: 75%;
            background-image: -webkit-linear-gradient(bottom, #ececec 50%, transparent 0);
            background-image: linear-gradient(
                    0deg, #ececec 50%, transparent 0);
        }

        .aui-sept-cell li:last-child:after {
            height: 0;
        }


        .aui-content-box {
            padding: 20px 0;
            width: 100%;
            text-align: center;
            color: #777778;
            font-size: 14px;
        }

        .aui-yes {
            width: 100px;
            height: 100px;
            margin: 0 auto;
        }

        .aui-content-box h1 {
            color: #222;
            font-size: 22px;
            margin-bottom: 10px;

        }

        .aui-content-box button {
            background-color: #937cfa;
            background: -webkit-linear-gradient(to right, #11c7ff, #16a5ff);
            background: -o-linear-gradient(to right, #11c7ff, #16a5ff);
            background: -moz-linear-gradient(to right, #11c7ff, #16a5ff);
            background: linear-gradient(to right, #11c7ff, #16a5ff);
            border-radius: 100px;
            box-shadow: 0 5px 20px #28b2ff;
            border: none;
            width: 40%;
            color: #fff;
            height: 44px;
            line-height: 44px;
            margin-top: 20px;
        }


        .aui-Card-box .aui-flex {
            margin-top: 10px;
            background: #fbf4e4;
            border-radius: 5px;
        }

        .aui-text h1 {
            color: #161616;
            font-size: 40px;
            position: relative;
            padding-left: 20px;
            margin-right: 15px;
        }

        .aui-text h1 i {
            font-size: 14px;
            font-style: normal;
            font-weight: normal;
            position: absolute;
            top: 10px;
            left: 10px;
        }

        .aui-get-box button {
            background-color: #ffbf1b;
            background: -webkit-linear-gradient(to right, #ffdd86, #ffbf1b);
            background: -o-linear-gradient(to right, #ffdd86, #ffbf1b);
            background: -moz-linear-gradient(to right, #ffdd86, #ffbf1b);
            background: linear-gradient(to right, #ffdd86, #ffbf1b);
            border-radius: 100px;
            border: none;
            color: #fff;
            padding: 3px 25px;
            font-size: 14px;
            margin-top: 12px;
            position: relative;
        }

        .aui-get-box button:after {
            content: "";
            position: absolute;
            z-index: 0;
            top: -40px;
            left: -40px;
            width: 20px;
            height: 20px;
            background: #fff;
            border-radius: 100px;
        }

        .aui-get-box button:before {
            content: "";
            position: absolute;
            z-index: 0;
            bottom: -40px;
            left: -40px;
            width: 20px;
            height: 20px;
            background: #fff;
            border-radius: 100px;
        }
    </style>
</head>
<body>

<section class="aui-flexView">

    <section class="aui-scrollView">
        <div class="aui-content-box" >
            <div class="aui-yes">
                <img src="imgs/yes.png" alt="">
            </div>
            <h1>恭喜支付成功</h1>
            <p>请在指定时间内办理入住</p>
            <p>订单号:${outTradeNo}</p>
            <p>付款金额:${totalAmount}</p>
            <button type="button" onclick="jumpUserCenter()">确定</button>
        </div>
    </section>

</section>
</body>
<script>
    function jumpUserCenter(){
        window.location.href="UserServlet?type=query";
    }

</script>
</html>
