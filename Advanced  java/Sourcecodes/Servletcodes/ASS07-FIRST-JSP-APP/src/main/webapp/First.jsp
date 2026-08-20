<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import ="java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
  <!-- -Header Logic -->
  
 <h1>Techno Comp Academy</h1>
 <hr>
 
 <%--Logic to Print message in JSP--%>
 
         <%
         String un=request.getParameter("uname");
         
         Date d =new Date();
         
         int hr=d.getHours();
         String msg="";
         
         if(hr<12)
        	  msg="Good Morning";
         else if(hr<14)
        	  msg="Good Afternoon";
         else 
        	 msg="Good Evening";
         
         
         
         out.println(msg +" "+ un);
         
         %>
         
         <h1> Pune,Mahrastra</h1>
</body>
</html>