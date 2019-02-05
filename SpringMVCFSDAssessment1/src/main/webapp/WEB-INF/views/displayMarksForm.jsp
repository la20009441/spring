<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Marks</title>
</head>
<body>
<form:form action="/fsd/displayTotalMarks" method="post" modelAttribute="studentMarks">
Enter Student Name : <form:input type="String" path="stdName"  min="0"/> <br/>
Science Marks : <form:input type="number" path="sciMark"  min="0"/> <br/>
Math Marks : <form:input type="number" path="matMark" min="0"/><br/>
English Marks : <form:input type="number" path="engMark" min="0"/><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
