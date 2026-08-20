<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page import="java.util.Date" %>   
<!DOCTYPE html> <html> <head>  
<meta charset="UTF-8">  
<title>Welcome</title>  
</head>  
<body>  
<c:if test="${empty sessionScope.user}">  
<c:redirect url="login.jsp"/>  
</c:if>  
<h2>Welcome, ${sessionScope.user}</h2>  
<p>Current Server Time: <%= new Date() %></p>  
</body> </html> 