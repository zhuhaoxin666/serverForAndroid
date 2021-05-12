<%--
  Created by IntelliJ IDEA.
  User: ZHX
  Date: 2021/5/11
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html id="noApplicationRecord">
<head>
    <title>display words</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

</head>
<body>
<h1 style="text-align: center;font-family: 微軟正黑體">${username},加油,胜利就在眼前</h1>
<hr style="border: solid black">
<table class="table table-striped;table table-hover" style="text-align: center">
    <tr style="text-align: center">
        <th style="text-align: center">#</th>
        <th style="text-align: center">WORD</th>
        <th style="text-align: center">MEANING</th>
    </tr>

    <tr style="text-align: center">
        <td>1</td><td>${word0}</td><td>${meaning0}</td>
    </tr>

    <tr>
        <td>2</td><td>${word1}</td><td>${meaning1}</td>
    </tr>

    <tr style="text-align: center">
        <td>3</td><td>${word2}</td><td>${meaning2}</td>
    </tr>

    <tr style="text-align: center">
        <td>4</td><td>${word3}</td><td>${meaning3}</td>
    </tr>

    <tr style="text-align: center">
        <td>5</td><td>${word4}</td><td>${meaning4}</td>
    </tr>

    <tr style="text-align: center">
        <td>6</td><td>${word5}</td><td>${meaning5}</td>
    </tr>

    <tr style="text-align: center">
        <td>7</td><td>${word6}</td><td>${meaning6}</td>
    </tr>

    <tr style="text-align: center">
        <td>8</td><td>${word7}</td><td>${meaning7}</td>
    </tr>
</table>
<hr style="border: solid black">

<form action="${pageContext.request.contextPath}/deletePage" method="post" style="text-align: center">
    <input type="submit" class="btn btn-primary btn-lg" value="背完了,真简单,全部删掉">
    <input type="text" value="${username}" name="username" hidden>
</form>
</body>
</html>
