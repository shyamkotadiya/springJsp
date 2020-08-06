<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color: orange">
<div align="center" >
<h1>Login</h1>
<form action='SpringJsp/checkLogin' method="post">

User Name: <input type="text" name="username"><br><br>
Password: <input type="password" name="password"><br><br>

<input type="submit">
<a href='SpringJsp/register'>Sign up</a>
</form>
</div>
</body>
</html>