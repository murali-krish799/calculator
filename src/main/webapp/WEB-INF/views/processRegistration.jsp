<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator</title>
</head>
<body>
<div align="center">

    <h2>Registration Details</h2>


    <hr/>

registration details:
<br/>

${registrationDTO.name}<br/>

${registrationDTO.age}<br/>

${registrationDTO.password}<br/>

${registrationDTO.cuntry}<br/>

${registrationDTO.hobbies}<br/>

<br/><br/>
<a href="/spring-mvc-love-calculator">backToHome</a>
</div>
</body>
</html>
