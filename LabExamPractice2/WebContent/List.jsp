<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr><th>Movie ID</th><th>Movie Name</th><th>Director Name</th><th>Release Date</th><th>Disk Format</th></tr>
	

	<s:iterator value="movies">
	<tr>
		<td><s:property value="movieid"/></td>
		<td><s:property value="moviename"/></td>
		<td><s:property value="directorname"/></td>
		<td><s:property value="releasedate"/></td>
		<td><s:property value="DiskFormat"/></td>
	</tr>
	
	
	
	
	</s:iterator>
</table>
<s:form action="logout">
<s:submit value="logout"></s:submit>
</s:form>


</body>
</html>