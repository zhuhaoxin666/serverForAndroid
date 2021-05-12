<%--
  Created by IntelliJ IDEA.
  User: ZHX
  Date: 2021/5/5
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Recode your words</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/1.6/jquery.min.js">

    </script>
</head>


<body>
<div id="container" style="position: relative;width: 100%;height: 100%">
    <div id="header" style="width: 100%;">
        <h1 style="text-align: center;font-family: 'Sitka Text'">Recode your words</h1>
        <p style="text-align: center;font-family: 微軟正黑體;font-size: large">赶快来注册吧，记录你的生僻词汇。</p>
        <hr style="border: solid black">
    </div>

    <div id="indexBody" style="width: 85%;padding-top: 7%">
        <form class="form-horizontal" style="text-align: center" action="${pageContext.request.contextPath}/existUserPage" method="post">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputEmail3" placeholder="请输入用户名" name="username">
                </div>
            </div>

            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码" name="password">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">登录</button>
                </div>
            </div>
        </form>
    </div>

    <div id="toRegister" style="width: 100%;padding-top: 5%;text-align: center">
        <hr style="border: solid black">
        <h3 style="font-family: 微軟正黑體;font-size: large">无账号？点此注册</h3>
        <form action="register.jsp">
            <button type="submit" class="btn btn-default" id="registerBtn">注册</button>
        </form>
    </div>

</div>
</body>
</html>
