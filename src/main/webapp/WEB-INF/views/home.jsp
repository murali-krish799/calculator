<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator Page</title>

    <style>


    .error{
    color:red;
    position:fix;

    }
    </style>

</head>
<body>
<div align="center">

    <h2>Love Calculator</h2>
    <hr/>

    <form:form action="processHome" method="get" modelAttribute="userDTO">
        Your Name: <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br/><br/>
        Crush Name: <form:input path="crushName"/>
    <form:errors path="crushName" cssClass="error"/><br/><br/>

           <form:checkbox path="active"/><span style="color:green;">Agree to Terms</span>
    <form:errors path="active" cssClass="error"/><br/><br/>

                       <input type="submit" value="Calculate"/>
    </form:form>

<a href="registration">please Register here</a>

</div>
</body>
</html>
