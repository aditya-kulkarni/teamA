<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:actionmessage/>
	<s:form action="index">
		<s:textfield name="username" label="UserName" requiredLabel="true" />
		<s:textfield name="password" label="Password" requiredLabel="true" />
		<s:submit></s:submit>
	</s:form>

</body>
</html>