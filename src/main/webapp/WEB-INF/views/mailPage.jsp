<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator mail</title>
</head>
<body>
<div align="center">

    <h2>Mail-Page</h2>
    <hr/>
<h1>HI</h1>
<form action="sendMail" method="get">
Please send the mail : <input type="text" name="mail" placeHolder="krish@gmail.com"/> &nbsp;
<input type="submit" value="send"/>

<a href="processHome">backToHome</a>
</form>
</div>
</body>
</html>
