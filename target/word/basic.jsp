<%--
  Created by IntelliJ IDEA.
  User: ZHX
  Date: 2021/5/11
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

</head>
<body>
<div class="jumbotron" style="font-family: 微軟正黑體;text-align: center">
    <h1>$欢迎您，${username}</h1>
    <p>快来录入单词或者查看您录入的单词吧</p>

    <form action="${pageContext.request.contextPath}/inputPage">
        <input type="submit" class="btn btn-primary btn-lg" value="单词录入">
        <input type="text" value="${username}" name="username" hidden>
    </form>

    <form action="${pageContext.request.contextPath}/outputPage" method="post">
        <input type="submit" class="btn btn-primary btn-lg" value="查看单词">
        <input type="text" value="${username}" name="username" hidden>
    </form>

</div>

</body>
</html>
