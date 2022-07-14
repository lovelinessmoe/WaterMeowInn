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
        html,body {
            color: #333;
            margin: 0;
            height: 100%;
            font-family: "Myriad Set Pro","Helvetica Neue",Helvetica,Arial,Verdana,sans-serif;
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

        button,input,optgroup,select,textarea {
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

        .clearfix::after {
            clear: both;
            content: ".";
            display: block;
            height: 0;
            visibility: hidden;
        }

        .clearfix {
        }

        .divHeight {
            width: 100%;
            height: 10px;
            background: #f5f7fc;
            position: relative;
            overflow: hidden;
        }

        .r-line {
            position: relative;
        }

        .r-line:before {
            content: '';
            position: absolute;
            z-index: 0;
            top: 0;
            right: 0;
            height: 100%;
            border-right: 1px solid #D9D9D9;
            -webkit-transform: scaleX(0.5);
            transform: scaleX(0.5);
            -webkit-transform-origin: 100% 0;
            transform-origin: 100% 0;
        }

        .b-line {
            position: relative;
        }

        .b-line:after {
            content: '';
            position: absolute;
            z-index: 2;
            bottom: 0;
            left: 0;
            width: 100%;
            height: 1px;
            border-bottom: 1px solid #e2e2e2;
            -webkit-transform: scaleY(0.5);
            transform: scaleY(0.5);
            -webkit-transform-origin: 0 100%;
            transform-origin: 0 100%;
        }

        .aui-arrow {
            position: relative;
            padding-right: 0.8rem;
            color: #7f8699;
            font-size: 0.85rem;
        }

        .aui-arrow span {
            font-size: 0.8rem;
            color: #9b9b9b;
        }

        .aui-arrow:after {
            content: " ";
            display: inline-block;
            height: 6px;
            width: 6px;
            border-width: 2px 2px 0 0;
            border-color: #848484;
            border-style: solid;
            -webkit-transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);
            transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);
            position: relative;
            top: -2px;
            position: absolute;
            top: 50%;
            margin-top: -6px;
            right: 2px;
            border-radius: 1px;
        }

        .aui-flex {
            display: -webkit-box;
            display: -webkit-flex;
            display: flex;
            -webkit-box-align: center;
            -webkit-align-items: center;
            align-items: center;
            padding: 15px;
            position: relative;
        }

        .aui-flex-box {
            -webkit-box-flex: 1;
            -webkit-flex: 1;
            flex: 1;
            min-width: 0;
            font-size: 14px;
            color: #333;
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

        .aui-navBar {
            height: 44px;
            position: relative;
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            z-index: 102;
            background-color: #fff;
        }

        .aui-navBar-item {
            height: 44px;
            min-width: 15%;
            -webkit-box-flex: 0;
            -webkit-flex: 0 0 15%;
            -ms-flex: 0 0 15%;
            flex: 0 0 15%;
            padding: 0 0.9rem;
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-align: center;
            -webkit-align-items: center;
            -ms-flex-align: center;
            align-items: center;
            font-size: 0.7rem;
            white-space: nowrap;
            overflow: hidden;
            color: #808080;
            position: relative;
        }

        .aui-navBar-item:first-child {
            -webkit-box-ordinal-group: 2;
            -webkit-order: 1;
            -ms-flex-order: 1;
            order: 1;
            margin-right: -25%;
            font-size: 0.9rem;
            font-weight: bold;
        }

        .aui-navBar-item:last-child {
            -webkit-box-ordinal-group: 4;
            -webkit-order: 3;
            -ms-flex-order: 3;
            order: 3;
            -webkit-box-pack: end;
            -webkit-justify-content: flex-end;
            -ms-flex-pack: end;
            justify-content: flex-end;
            font-size: 14px;
            color: #333333;
        }

        .aui-center {
            -webkit-box-ordinal-group: 3;
            -webkit-order: 2;
            -ms-flex-order: 2;
            order: 2;
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-pack: center;
            -webkit-justify-content: center;
            -ms-flex-pack: center;
            justify-content: center;
            -webkit-box-align: center;
            -webkit-align-items: center;
            -ms-flex-align: center;
            align-items: center;
            height: 44px;
            width: 80%;
            margin-left: 22%;
        }

        .aui-center-title {
            text-align: center;
            width: 100%;
            white-space: nowrap;
            overflow: hidden;
            display: block;
            text-overflow: ellipsis;
            font-size: 1rem;
            color: #333;
        }

        .icon {
            width: 19px;
            height: 19px;
            display: block;
            border: none;
            float: left;
            background-size: 19px;
            background-repeat: no-repeat;
        }

        .aui-flex-box h1 {
            color: #303741;
            font-weight: 500;
            font-size: 1rem;
            overflow: hidden;
        }

        .aui-flex-box h2 {
            color: #333333;
            font-weight:500;
            font-size: 1rem;
            overflow: hidden;
            display: -webkit-box;
            -webkit-line-clamp: 1;
            -webkit-box-orient: vertical;
            word-break: break-all;
            text-overflow: ellipsis;
        }


        .aui-flex-box p{
            color:#aba9a3;
            font-size:12px;
        }

        .icon-return{
            background-image:url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAYAAAA6/NlyAAAEv0lEQVRoQ+Xaa2gcVRQA4HMzm7jUYlFRqmi0IlpBDJr6QHzic4272XvTcaMYjaipqFhUxAeiwaLSUsUnxSqlVoppN7nndhNE8kMQ/CFKEfwjRRAf+EPiD6Mrgvs4csJNsWnm7mazm5nZ3r8DM/PNuc9zRsAx1sQx5oUVA0spz6tUKqJQKBwK8yO3HCylvICItgoh0hb6ixDiOq31D2HAWwoeGBhYX61W8wBw4QKcRsSBtgJzFwYAxl60EEZEfxpj1rQNOJPJnOt53jgA9ASgvkLEy9sCrJQ6p1qtjgshLg4CEdEmY8zO2IPT6fS6RCLB3bjXgXkJEV8MA8vPbNqkpZQ6i4gYe6kjsluMMS+EhW0auL+//8yOjg4es5c5MC8j4vNhYpsCVkqdYSN7RRBGCPGq1vq5sLHLBmcymdN5zBLRlQ7MVkR8JgrYZYF9319bLpd5zF7liOw2rfXTUcE2DJZSnmo3Fdc4MNsR8akoYRsC+75/io3stQ7M64j4ZNSwSwZLKU+2kb3esfS8YYx5PIrYJYH7+vpO7Orq4jF7gwPzFiJujiq2brDv+2tsN77JEdm3jTGPRRlbFziVSp2QTCY5sjc7MO8i4qNRx9YE+76/2kb2VsfSs0Nr/XAcsE5wOp1e1dnZyZuK2xyY9xDxobhgA8HDw8PJ2dlZ7sa3OyK7U2u9KU7YRcGpVOq4ZDK5HwAyDswHiPhg3LBHgUdGRjpnZmY4sv0OzC5EvD+O2CPAvu97doKSjqVntzHmvrhi/w/uUErtJyJXJnEPIt4bZ+xhsJTyOwBY75igPtJa3xN37BxYKcVLz0YHZi8i3t0O2DmwlPIvAFgdAPoYEe9qF+w8+G8AWBWAilS2ohkfnrv0p0R0i+NmkTzIN4pn8DARbQcAPusu2ogo0mfcpeDn8tKZTOZ8z/P2OUojQESxOP7Vwh9OxNt6EKMvcSxPsToZLeY4ovKQzWbPFkIwOjChLoSI5aFhHn9UqYWrCJ7njdXINcd2P71obUkpdRoRcaSvdoyJDxFxuNaYidr1wGKazT2PAUBghhIAYrcLc1YPfd8/qVQq7RNC3OiI1Bgi3hm1SAZOvLVe1GYsOdKBeS0AGO/p6cmNjo5Wa90v7Ot11YeHhoaOLxaLPKb7HC+MiURiMJ/P/xs2yvX8usB8A5vn4kgHZkOEEJOe5+Xy+fw/UUXXDWZAb29vZ3d3N6OVY3PySblcHiwUCnwKi1xbEti+PR8pGX2HQzNNRDljzB9REzcCnjMopfYSkeus/Fm5XM5NTk7+HiV0w2BGZLPZPUKIIQfo80qlkisUCr9FBb0sMCOklLsAwJXJ/KJUKg1OTU39GgX0ssEW/T4APOAAfZlIJHj2/jlsdFPAFr0DAFx1pq+FEINh/UU7/6GbBrbodwDgkaAoEtE3vE5PTEx8H1akmwq26DcBwFUY/xYABhGRc+Er3poOtujXAOAJx+ZkUmvtKta17EO0BGzR2wAg8LclIlpnjPmxZbKAG7cMbDcnrxDRs4s9m4g2GGMOthXYorcQ0cKfSg8i4oaVxvLzWhrheZCUkrs2d3FuPwHAZkQ80LZghtkfUdcWi8VD09PTXN4Jpa1IhEORhTFpRQk6/y7/AShlrEzAvtqIAAAAAElFTkSuQmCC');

        }


        .icon-more{
            background-image:url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAYAAAA6/NlyAAADVElEQVRoQ+1YS2sUQRCumt1fYIwRxYMHTUxOgqhgwOSiHlwyNcvqWQ8KilHB10/QKPhCQQ961mW7JqwH9WKECCqCp8TXwYMoxtcv2J2SDklIzM5sT4+HYdN97fqqv6++mp6aQVhhC1eYXnCCO91x57BzuMMq4Fq6wwxdJsc57BzusAq4lu4wQ92l5VratXSHVcC1dIcZ6m5p19K6B4hoMyL2RVG01fO8tyLynpk/Zm13IuqKoqjX87wBnSuKoinP8z4w8+//kNuI8xKHgyDYKSKXAWCwBYFJRDyrlHppQ46ILgLAOYBlPw4FAMaY+YJN3rScFwQHQXBKRK62OxQRTyulrrWLW7xPRO8AoK8NRnfRljR5bTjPCvZ9fzsivjI9TER2hGH42iSeiJ4BwJBJLABMMPOwSawtZ6xUKquazeYbEdlocpCOQcTPhUJhW7Va/ZOECYLghIjcMM07l3tUKXUzCZOFMxKRfmbPpCE1F3uFmc/G4SqVSnej0Zhp8cy2O0qKxWJPtVr9GReYhbMW/AQA9rRj0WL/KTPvjcP5vj+EiLqdUy8RGQ7DcCJBsDVnLfg7APSkZgUww8xr43BBEBwTkVsWefUjc1wpdTtBsDVnLfgrAKyzIPaNmdcnOHwEEe9Y5AURORqG4d0EwdacteA6AOy3IPaImUsJDu8SkUmLvNrhQaXUiwTBVpwRsY5BEFwSET0QpFqIOKaUOh8HKpVKq4vFYuzFk3RYo9HortfrvxKKacVZRMZwZGRkgx4fAaArheLfeuwcHx//koQhojEAiL3JY7CXmTnRgCyc5wePA4j4wFSwiBwMw/ChSTwRvQeAXpNYANBzdbuJbDaV7/tWnBdGSyI6BAD3DIgdZub7BnHzIfqe0K+n3W0wz+emLD1bGy0bzks+Hsrl8qYoivRktK/FiY89zxut1WqfjNj8E0REowBwPQZ7kplTTWTzedJybvU9jOVyub/ZbA54ntcfRdF0oVCYqtVq0wBgXP1WwohoDSIOiEi/3kfEaRGZYuYfNkVchDHm7H4AZKx07uHO4dxblJGgczhjAXMPdw7n3qKMBJ3DGQuYe7hzOPcWZSToHM5YwNzDncO5tygjQedwxgLmHu4czr1FGQk6hzMWMPfwv3/PYWU+2WNBAAAAAElFTkSuQmCC');

        }


        .aui-chang-box{
            width:94%;
            margin:20px auto;
            background-color: #937cfa;
            background: -webkit-linear-gradient(to right,#11c7ff, #16a5ff);
            background: -o-linear-gradient(to right,#11c7ff, #16a5ff);
            background: -moz-linear-gradient(to right,#11c7ff, #16a5ff);
            background: linear-gradient(to right,#11c7ff, #16a5ff);
            border-radius:5px;
            box-shadow:0 5px 20px #28b2ff;
            padding:50px 0 40px 0;
        }


        .aui-sept-box{
            width:100%;
        }


        .aui-sept-cell{
            overflow: hidden;
        }
        .aui-sept-cell li{
            width:33.33%;
            float:left;
            text-align:center;
            position:relative;
        }
        .aui-sept-cell li em{
            width:18px;
            height:18px;
            display:block;
            margin:0 auto;
            border-radius:100px;
            border:3px solid #fff;
            text-align:center;
        }

        .aui-sept-cell li p{
            color:#fff;
            font-size:14px;
            padding-top:20px;
        }

        .aui-sept-cell li:after{
            height: 1px;
            position: absolute;
            z-index: 0;
            top: 8px;
            left: 80px;
            content: "";
            width: 75%;
            background-image: -webkit-linear-gradient(bottom,#ececec 50%,transparent 0);
            background-image: linear-gradient(
                    0deg
                    ,#ececec 50%,transparent 0);
        }

        .aui-sept-cell li:last-child:after{
            height:0;
        }


        .aui-content-box{
            padding:20px 0;
            width:100%;
            text-align:center;
            color:#777778;
            font-size:14px;
        }
        .aui-yes {
            width:100px;
            height:100px;
            margin:0 auto;
        }

        .aui-content-box h1{
            color:#222;
            font-size:22px;
            margin-bottom:10px;

        }

        .aui-content-box button{
            background-color: #937cfa;
            background: -webkit-linear-gradient(to right,#11c7ff, #16a5ff);
            background: -o-linear-gradient(to right,#11c7ff, #16a5ff);
            background: -moz-linear-gradient(to right,#11c7ff, #16a5ff);
            background: linear-gradient(to right,#11c7ff, #16a5ff);
            border-radius:100px;
            box-shadow:0 5px 20px #28b2ff;
            border:none;
            width:40%;
            color:#fff;
            height:44px;
            line-height:44px;
            margin-top:20px;
        }


        .aui-Card-box{
            width:90%;
            margin:0 auto;
            padding-top:20px;
        }

        .aui-Card-box .aui-flex{
            margin-top:10px;
            background:#fbf4e4;
            border-radius:5px;
        }

        .aui-text h1{
            color:#161616;
            font-size:40px;
            position:relative;
            padding-left:20px;
            margin-right:15px;
        }

        .aui-text h1 i{
            font-size:14px;
            font-style:normal;
            font-weight:normal;
            position:absolute;
            top: 10px;
            left:10px;
        }


        .aui-get-box{
            position:relative;
            height:50px;

        }

        .aui-get-box:after{
            content: "";
            position: absolute;
            z-index: 0;
            top: 0;
            left: -30px;
            width: 1px;
            height: 100%;
            background-image: -webkit-linear-gradient(left,#ffd66b 50%,transparent 0);
            background-image: linear-gradient(
                    90deg
                    ,#ffd66b 50%,transparent 0);
        }

        .aui-get-box button{
            background-color: #ffbf1b;
            background: -webkit-linear-gradient(to right,#ffdd86, #ffbf1b);
            background: -o-linear-gradient(to right,#ffdd86, #ffbf1b);
            background: -moz-linear-gradient(to right,#ffdd86, #ffbf1b);
            background: linear-gradient(to right,#ffdd86, #ffbf1b);
            border-radius:100px;
            border:none;
            color:#fff;
            padding:3px 25px;
            font-size:14px;
            margin-top:12px;
            position:relative;
        }

        .aui-get-box button:after{
            content: "";
            position: absolute;
            z-index: 0;
            top: -40px;
            left: -40px;
            width: 20px;
            height: 20px;
            background:#fff;
            border-radius:100px;
        }

        .aui-get-box button:before{
            content: "";
            position: absolute;
            z-index: 0;
            bottom: -40px;
            left: -40px;
            width: 20px;
            height: 20px;
            background:#fff;
            border-radius:100px;
        }
    </style>
</head>
<body>

<section class="aui-flexView">
    <header class="aui-navBar aui-navBar-fixed ">
        <a href="javascript:;" class="aui-navBar-item">
            <i class="icon icon-return"></i>
        </a>
        <div class="aui-center">
            <span class="aui-center-title">支付下单</span>
        </div>
        <a href="javascript:;" class="aui-navBar-item">
            <i class="icon icon-more"></i>
        </a>
    </header>
    <section class="aui-scrollView">
        <div class="aui-chang-box">
            <div class="aui-sept-box">
                <ul class="aui-sept-cell">
                    <li>
                        <em></em>
                        <p>加入购物车</p>
                    </li>
                    <li>
                        <em></em>
                        <p>商品下单</p>
                    </li>
                    <li>
                        <em></em>
                        <p>支付成功</p>
                    </li>
                </ul>
            </div>
        </div>
        <div class="aui-content-box">
            <div class="aui-yes">
                <img src="imgs/yes.png" alt="">
            </div>
            <h1>恭喜支付成功</h1>
            <p>请在指定时间内办理入住</p>
            <button type="button">查看订单详情</button>
        </div>
    </section>

</section>
</body>
</html>
