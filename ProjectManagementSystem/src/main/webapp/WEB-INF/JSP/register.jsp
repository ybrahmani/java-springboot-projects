<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Register</title>
</head>
<body>

<h2>Employee Registration</h2>

<form:form method="post" modelAttribute="emp">

    Employee No:
    <form:input path="empNo" /><br><br>

    Username:
    <form:input path="username" /><br><br>

    Password:
    <form:password path="password" /><br><br>

    Employee Name:
    <form:input path="eName" /><br><br>

    Salary:
    <form:input path="sal" /><br><br>

    Details:
    <form:input path="details" /><br><br>

    <input type="submit" value="Register" />

</form:form>

<br>
<a href="login">Back to Login</a>

</body>
</html>
