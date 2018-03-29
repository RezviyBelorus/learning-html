<%--
  Created by IntelliJ IDEA.
  User: alexfomin
  Date: 11.09.17
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<b>Мой почтовый сервер</b>
<form method="GET" action="sendmail">
    <table>
        <tr>
            <td><b>To(email):</b></td>
            <td>
                <input name="to" type="text" size=40></td>
        </tr>
        <tr>
            <td><b>From(email):</b></td>
            <td>
                <input name="from" type="text" size=40></td>
        </tr>
    </table>
    <tr>
        <td><b>Subject:</b></td>
        <td>
            <input name="subj" type="text" size=40></td>
    </tr>
    <hr>
    <textarea name="body" type="text" rows=5 cols=45>
    Добрый день!
    </textarea>
    <br>
    <input type="submit" value="Отправить!">
</form>
</body>
</html>
