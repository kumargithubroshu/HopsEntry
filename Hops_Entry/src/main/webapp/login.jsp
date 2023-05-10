<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form !!!</title>
<style>
.a{text-align:center}

</style>
</head>
<body style="margin-left: 35%;">
<div style="border:groove;width:400px;padding:50px;background-color:#42f5bf;opacity:0.8">
  <form action="Login" method="post">
  <table>
  <tr>
  <td>User-Id   :</td>
  <td><input type="email" name="emailid" placeholder="emailid" required /></td>
  </tr>
  
  <tr>
  <td>Password :</td>
  <td><input type="password" name="password" placeholder="password" required /></td>
  </tr>
  
  <%@include file="captcha.jsp" %>
  
  <tr>
  <td><input style="background-color: #f5ad42"name="captcha" value='<%=captcha %>' readonly="readonly" /></td>
  <td><input type="text" name="captcha1" placeholder="enter captcha" /></td>
  </tr>
  
  <tr>
  <td  colspan="2">
  <div class="a"><input type="submit" value="Login"></div> 
  </td>
  </tr>
  
  <tr>
  <td><h5 style="color:blue">new user ?</h5></td>
  <td> <a href="registration.jsp">register here</a></td>
  </tr>
  
  </table>
  </form>
</div>
</body>
</html>