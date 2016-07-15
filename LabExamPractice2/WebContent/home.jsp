<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:actionmessage/>
	<s:a href="AddMovie.jsp">Add a movie</s:a><br>
	<s:a href="DeleteMovie.jsp">Delete a movie</s:a><br>
	<s:a href="list">List Movies</s:a><br>
	
	<s:a href="logout">Logout</s:a>
</body>
</html>