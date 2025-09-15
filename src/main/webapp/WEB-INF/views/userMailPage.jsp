<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Mail Details</title>

    <style>


    .error{
    color:red;
    position:fix;

    }
    </style>

</head>
<body>
<div align="center">

    <h2>${userDTO.name} Mail Details </h2>
<br/>
<br/>
    <span style="color:blue;"> ${userDTO.name}  First give your details<span>
    <hr/>

    <form:form action="processUserMailDetails" method="get" modelAttribute="userMailDetail">

        Your host: <form:select path="host">

        <form:option value="smtp.gmail.com">gmailHost</form:option>
        </form:select>
    <form:errors path="host" cssClass="error"/><br/><br/>

        Your port: <form:select path="port">

                           <form:option value="587">gmailPort</form:option>


                           </form:select>
         <form:errors path="port" cssClass="error"/><br/><br/>

           Your userMail: <form:input path="userMail"/>
              <form:errors path="userMail" cssClass="error"/><br/><br/>

                Your password: <form:input path="password"/>
                    <form:errors path="password" cssClass="error"/><br/><br/>


           <form:checkbox path="smtpAuth"/><span style="color:green;">Please give smtp has true </span>
    <form:errors path="smtpAuth" cssClass="error"/><br/><br/>

           <form:checkbox path="smtpEnable"/><span style="color:green;">Please smtp Enable here </span>
    <form:errors path="smtpEnable" cssClass="error"/><br/><br/>

                       <input type="submit" value="sendMail"/>
    </form:form>

<a href="registration">please Register here</a>

</div>
</body>
</html>
