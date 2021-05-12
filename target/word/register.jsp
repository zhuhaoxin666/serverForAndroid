<%--
  Created by IntelliJ IDEA.
  User: ZHX
  Date: 2021/5/8
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/1.6/jquery.min.js">

    </script>
</head>
<div id="container" style="position: relative;width: 100%;height: 100%">
    <div id="header" style="width: 100%;">
        <h1 style="text-align: center;font-family: 'Sitka Text'">Welcome to register</h1>
        <p style="text-align: center;font-family: 微軟正黑體;font-size: large">欢迎您的注册！</p>
        <hr style="border: solid black">
    </div>

    <div id="indexBody" style="width: 85%;padding-top: 7%">
        <form class="form-horizontal" style="text-align: center" action="${pageContext.request.contextPath}/registerRequest">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputEmail3" placeholder="请输入用户名" name="name">
                </div>
            </div>

            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码" name="password">
                </div>
            </div>

            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputAge" placeholder="请输入您的年龄" name="age">
                </div>
            </div>

            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">个性签名(选填)</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputMotto" placeholder="请输入您的个性签名" name="motto">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="注册" class="btn btn-default">
                </div>
            </div>
        </form>
    </div>


</div>
</body>
</html>

<%--<form action="register.jsp">--%>
<%--    <button type="submit" class="btn btn-default" id="registerBtn">注册</button>--%>
<%--</form>--%>

<%--<form action="${pageContext.request.contextPath}/registerRequest">--%>
