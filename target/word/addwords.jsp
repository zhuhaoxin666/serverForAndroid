<%--
  Created by IntelliJ IDEA.
  User: ZHX
  Date: 2021/5/11
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add words</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>

<body>
<div id="container" style="position: relative;width: 100%;height: 100%">
    <div id="header" style="width: 100%;">
        <h1 style="text-align: center;font-family: 'Sitka Text'">${username},快来录入生词吧</h1>
        <p style="text-align: center;font-family: 微軟正黑體;font-size: large">新的一天，从记忆单词开始！</p>
        <hr style="border: solid black">
    </div>

    <div id="indexBody" style="width: 85%;padding-top: 7%">
        <form class="form-horizontal" style="text-align: center" action="${pageContext.request.contextPath}/addMeaning" method="post">

            <div class="form-group">
                <label for="inputword" class="col-sm-2 control-label">单词</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputword" placeholder="请输入您要记录的单词" name="word">
                </div>
            </div>

            <div class="form-group">
                <label for="interpretaion" class="col-sm-2 control-label">解释</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="interpretaion" placeholder="请输入该单词的解释" name="meaning">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-10">
                    <input type="text" id="inputusername" value="${username}"  name="username" hidden>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="添加" class="btn btn-default">
                </div>
            </div>
        </form>
    </div>


</div>
</body>

</html>
