<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here is Your captcha fields</title>
</head>
<body>
 
 <%
  String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower="abcdefghijklmnopqrstuvwxyz";
	String digits="0123456789";
	//String special="~!@#$%^&*()_+-=;':,.?/";
	String symbol=upper+lower+digits;
	
	int m=symbol.length();
	String captcha="";
	java.util.Random r=new java.util.Random();
	for(int i=0; i<4; i++)
	{
		captcha +=symbol.charAt(r.nextInt(m));
	}
  %>
  
  
</body>
</html>