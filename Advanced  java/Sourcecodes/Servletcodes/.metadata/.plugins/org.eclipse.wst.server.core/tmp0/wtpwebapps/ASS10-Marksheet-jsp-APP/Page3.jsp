<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

    <h1>Marksheet</h1>
     <hr>
       
       <%
       
       String fname=(String) session.getAttribute("fn");
       String lname=(String) session.getAttribute("ln");
       session.invalidate();
       
       String per=request.getParameter("p");
       String grade=request.getParameter("g");
       
      // out.println("First Name: "+fname+"<br>");
       //out.println("Last Name: "+lname+"<br>");
       
      //out.println("Percentage: "+ per + "<br>");
      // out.println("Grade: "+grade+"<br>");
       
     
       %>
       
       First Name: <b> <%=fname%></b><br>
       Last Name : <%=lname %><br>
       Percentage:<%=per %><br>
       Grade:<%=grade %><br>
       
       Date: <%=new Date() %><br>
       
       <a href="./Page1.html">Go Home</a>
</body>
</html>