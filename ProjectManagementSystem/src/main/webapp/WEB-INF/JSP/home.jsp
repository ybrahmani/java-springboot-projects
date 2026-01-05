<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
    <title>Home</title>
</head>
<body>

<h2>Welcome ${emp.eName}</h2>

<p>
    Employee Number : ${emp.empNo}
</p>

<p>
    Username : ${emp.username}
</p>

<p>
    Salary : ${emp.sal}
</p>

<p>
    Details : ${emp.details}
</p>

<br>
<a href="logout">Logout</a>

</body>
</html>
