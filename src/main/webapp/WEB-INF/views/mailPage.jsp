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

    <form:form action="toMailProcessPage" method="get" modelAttribute="destinationDTO">

        DestinationMail: <form:input path="toMail"/>
    <form:errors path="toMail" cssClass="error"/><br/><br/>

Your subject: <form:input path="subject"/>
              <form:errors path="subject" cssClass="error"/><br/><br/>

      content :
      <br/>
       <form:textarea path="body" rows="5" cols="40"/>
         <form:errors path="body" cssClass="error"/><br/><br/>

                Your mail Id: <form:input path="userMail"/>
                    <form:errors path="userMail" cssClass="error"/><br/><br/>




                       <input type="submit" value="sendMail"/>
    </form:form>

<a href="registration">please Register here</a>

</div>
</body>
</html>
