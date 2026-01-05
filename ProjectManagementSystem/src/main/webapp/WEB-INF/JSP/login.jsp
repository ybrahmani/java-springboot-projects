<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Employee Login</h2>


<form action="/login" method="post">
    Username:
    <input type="text" name="username" /><br><br>

    Password:
    <input type="password" name="password" /><br><br>

    <input type="submit" value="Login" />
</form>

<br>
<a href="register">New Employee? Register here</a>

</body>
</html>
