<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name='frm' action='saverecord' method='POST'>
		<input type='text' name='name' value=''
			style='width: 400px; height: 30px' placeholder='Enter the name' /> <br>
		<br> <input type='text' name='email' value=''
			style='width: 400px; height: 30px' placeholder='Enter the name' /> <br>
		<br> <input type='text' name='contact' value=''
			style='width: 400px; height: 30px' placeholder='Enter the name' /> <br>
		<br> <input type='text' name='username' value=''
			style='width: 400px; height: 30px' placeholder='Enter the name' /> <br>
		<br> <input type='password' name='password' value=''
			style='width: 400px; height: 30px' placeholder='Enter the name' /> <br>
		<br> <input type='submit' name='s' value='Login'
			style='width: 200px; height: 30px' />

	</form>
	<br> ${msg}
</body>
</html>