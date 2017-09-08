<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grade a student</title>
</head>
<body>

<form method="POST" action="Result.jsp">
Naam : <input type=TEXT name="naam" size=30><br/>
Vervaldatum : <input type=TEXT name="vervaldatum" size=20><br/>
Producent : <input type=TEXT name="producent" size=30><br/>
Hoeveelheid : <input type=TEXT name="hoeveelheid" size=20><br/>
<br/><br/>
<input type=SUBMIT value="Save">
</form>

</body>
</html>