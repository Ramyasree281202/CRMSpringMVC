<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link type=text/css rel="stylesheet" href="./style2.css">
</head>
<body>
	<h1>Update Application</h1>
<form:form action="registerCus" modelAttribute="customer">
	<table>
	  <tr>
            <td>
                <!-- Hidden field for ID -->
                <form:hidden path="id" />
            </td>
        </tr>
	<tr>
		<td>
			<label>First Name: </label>
			<form:input path="firstName" />
		 </td>
	</tr>
	<tr>
		<td>
			<label>Last Name: </label>
			<form:input path="lastName" />
		 </td>
	</tr>
	
	<tr>
		<td>
			<label>City: </label>
			<form:input path="city" />
		 </td>
	</tr>
	<tr>
		<td>
			
			<input type="submit" value="Update"/>
		 </td>
	</tr>
	
</table>
</form:form >
</body>
</html>