<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator result</title>
</head>
<body>
<div align="center">

    <h2>Result-Page</h2>
    <hr/>

Result calculated here and response given below:<br/>
${userDTO.name} & ${userDTO.crushName} are <span style="color:red;"> friends</span> only...
<br/>
<br/>
<a href="userMailDetails">Send to Mail</a><br/><br/>
<a href="/spring-mvc-love-calculator">backToHome</a>
</div>
</body>
</html>
