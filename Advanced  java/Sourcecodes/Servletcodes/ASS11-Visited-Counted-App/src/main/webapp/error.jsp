<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isErrorPage="true" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 
 String msg="";
 
 if(exception instanceof ArrayIndexOutOfBoundsException){
	    msg="array is not in a range!";
 }
 
 
 if(exception instanceof  NumberFormatException){
	    msg="Given input number is not a number!";
 }
 
 %>
  <font color="red"> 
  
  
  problem:<%= msg %> 
  
  
  </font>

</body>
</html>