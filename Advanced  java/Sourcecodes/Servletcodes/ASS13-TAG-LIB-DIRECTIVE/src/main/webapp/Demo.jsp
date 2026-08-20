<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1><c:out value="Advance Java Batch-20"/></h1>
 
 <c:forEach var="i" begin="1" end="5" step="1">
 
 <h2>
 
 <c:out value="${i}"/>:Hello World
 
 </h2>
 
 </c:forEach>
</body>
</html>