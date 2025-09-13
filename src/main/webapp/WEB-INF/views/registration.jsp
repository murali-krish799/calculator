<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>


    <style>


    .error{
    color:red;
    position:fix;

    }
    </style>
</head>
<body>
<div align="center">

    <h2>Registration Here</h2>
    <hr/>

    <form:form action="processRegistration" method="get" modelAttribute="registrationDTO">

name: <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br/><br/>
age: <form:input path="age"/>
    <form:errors path="age" cssClass="error"/><br/><br/>

password: <form:password path="password"/>
    <form:errors path="password" cssClass="error"/><br/><br/>
    Phone: <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/><br/><br/>

Country:
<select name="cuntry">
<option value="IND">Indian</option>
<option value="PAK">Pakistan</option>
<option value="AUS">Australia</option>



</select>


<br/><br/>

Hobbies:
<form:checkbox path="hobbies" value="learning"/>learn &nbsp;&nbsp;
<form:checkbox path="hobbies" value="travelling"/>travelling &nbsp;&nbsp;
<form:checkbox path="hobbies" value="coding"/>code &nbsp;&nbsp;
<form:checkbox path="hobbies" value="cricket"/>cricket &nbsp;&nbsp;
    <form:errors path="hobbies" cssClass="error"/><br/><br/>

<br/>
<br/>

<input type="submit" value="register"/>

    </form:form>


</div>
</body>
</html>
