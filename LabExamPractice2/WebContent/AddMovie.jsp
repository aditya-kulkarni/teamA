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

<s:form action="addmovie">
		<s:textfield name="movieid" label="Movie Id" requiredLabel="true" />
		<s:textfield name="moviename" label="Movie Name" requiredLabel="true" />
		<s:textfield name="directorname" label="Diector Name" requiredLabel="true" />
		<s:textfield name="releasedate" label="Release Date" requiredLabel="true" />
		<s:select list="#{'CD':'CD','DVD':'DVD'}" name="DiskFormat"></s:select>
		<s:submit></s:submit>
	</s:form>

</body>
</html>