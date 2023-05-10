<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page...!!!</title>
<style>


.a{ text-align:center}
.b{
margin-left:35%;
}

</style>
</head>
<body  class="b">
<div  style="border-style: dotted;width:400px;background-color:#42f5ef;padding:50px" >
     <h2 style="margin-left:60px">Registration Form</h2>  
     <form action="Registration" method="post">
     <table>
     
     <tr>
     <td>Enter First Name :</td>
     <td><input type="text" name="firstname" placeholder="Enter here" required/></td>
     </tr>
     
     <tr>
     <td>Enter Middle Name :</td>
     <td><input type="text" name="middlename" placeholder="Enter here"/></td>
     </tr>
     
     <tr>
     <td>Enter Last name :</td>
     <td><input type="text" name="lastname" placeholder="Enter here" required/></td>
     </tr>
     
      <tr>
     <td>Select your Course :</td>
     <td><select name="user_course">
     <option value="Java">Java</option>
     <option value="J2EE">J2EE</option>
     <option value="C++">C++</option>
     <option value="PHP">PHP</option>
     <option value=".Net">.Net</option>
     <option value="MySql">MySql</option>
     <option value="Mongodb">MongoDb</option>
     <option value="C#">C#</option>
     </select>
     </td>
     </tr>
     
     <tr>
     <td>Enter Password :</td>
     <td><input type="password" name="password" placeholder="Password" required/></td>
     </tr>
     
     <tr>
     <td>Re-enter Password :</td>
     <td><input type="password" name="password1" placeholder="password1" required/></td>
     </tr>
     
     <tr>
     <td>Enter Mobile Number :</td>
     <td><input type="number" name="mobilenumber" placeholder="mobilenumber" required/></td>
     </tr>
     
     <tr>
     <td>Enter Email-Id :</td>
     <td><input type="email" name="emailid" placeholder="emailid" required/></td>
     </tr>
     
     <tr>
     <td>Select Gender :</td>
     <td><input type="radio" name="user_gender" value="male"> Male &nbsp; &nbsp;
         <input type="radio" name="user_gender" value="female"> Female
         </td>
         </tr>
     
     <%@include file="captcha.jsp" %>
  
  <tr>
  <td><input style="background-color: #f5ad42" name="captcha" value='<%=captcha %>' readonly="readonly" /></td>
  <td><input type="text" name="captcha1" placeholder="enter captcha" /></td>
  </tr>
     
     <tr>
     <td colspan="2">
     <div class="a">
      <input type="checkbox" /> Agree term and conditions
     </div>
     </td>
     </tr>
     
     <tr>
     <td colspan="2">
     <div class="a">
      <input  style="background-color:yellow;" type="submit"/>
      <h5>Already registered : <a href="login.jsp">click here</a></h5>
     </div>
     </td>
     </tr>
     
     </table>
     
     
     </form>
 </div>   

</body>
</html>