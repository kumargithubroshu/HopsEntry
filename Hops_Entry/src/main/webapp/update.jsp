<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <form action="update" method="post"> -->

<%-- <c:forEach  var="documents" items="${documents}" /> --%>
 
  <c:if test="${customer != null}"><form action="update" method="post">
  </c:if>
 
 
enter id<input type="number" name="id" value="<c:out value="${customer.id}"/>" readonly /><br> 

enter name<input type="text" name="fname"   <c:out value="${customer.fname}"/>  /><br>
enter email<input type="email" name="email"   <c:out value="${customer.email}"/>  /><br>
enter age<input type="number" name="age"  <c:out value="${customer.age}"/>  /><br>
<input type="submit" />


</form>

</body>
</html>