<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="medicijn" class="edu.ap.student.Medicijn" scope="session"/>
<jsp:setProperty property="*" name="student"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>

First name : <%= medicijn.getNaam() %><br>
Last name : <%= medicijn.getVervaldatum() %><br>
Grade : <%= medicijn.getProducent() %><br>
Hoeveelheid: <%= medicijn.getHoeveelheid() %><br>

Grade2 : <%= request.getParameter("grade") %><br>

</body>
</html>