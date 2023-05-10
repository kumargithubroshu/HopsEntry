<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
<h1> View Page</h1>
<form action="ViewDetails" >
<pre>
<table>
<tr>
<th>Name &nbsp;&nbsp;</th>
<th>id &nbsp;&nbsp;</th>
<th>age &nbsp;&nbsp;</th>
<th>email &nbsp;&nbsp;</th>
</tr>
  <c:forEach  var="documents" items="${documents}">
<tr>
<td><c:out value="${documents.fname}"></c:out></td>
<td><c:out value="${documents.id}"></c:out></td>
<td><c:out value="${documents.age}"></c:out></td>
<td><c:out value="${documents.email}"></c:out></td>
<!-- <td><a href="update.jsp">Update</a> -->
<td><a href="update?id=<c:out value='${documents.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;
<td><a href="Delete?id=<c:out value='${documents.id}'/>">Delete</a></td>
</tr>


</c:forEach>
<a href="insert.jsp">add_customer</a>
</table>
</pre>
		<%-- <%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
		%>
		<input type ="submit" value = "Logout"> --%>
</form>
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>