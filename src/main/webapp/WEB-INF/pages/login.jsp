<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<div align="center" >
<h1>Registration</h1>
<form action='add'>
First Name:<input type="text" name="firstName"><br><br>
Last Name:<input type="text" name="lastName"><br><br>
Gender:<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">FeMale<br><br>
Hobbies: <input type="checkbox" name="hobbies" value="VollyBall">VollyBall
<input type="checkbox" name="hobbies" value="Cricket">Cricket
<input type="checkbox" name="hobbies" value="FootBall">FootBall<br><br> 
Address: <textarea name="username"></textarea><br><br>
User Name: <input type="text" name="username"><br><br>
Password: <input type="text" name="password"><br><br>

<input type="submit">
</form>
</div>
</body>
</html>