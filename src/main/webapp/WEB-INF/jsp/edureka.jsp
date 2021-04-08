<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Edureka Customers</title>
</head>
<body>
	<h2 class="hello-title">Hello ${name}!</h2>
	<form method="post" action="details">
		Enter customer ID: <input type="text" name="cid"><br>
		Enter customer Name: <input type="text" name="cname"><br>
		Enter customer email address: <input type="text" name="cemail"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>