<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<title>Insert title here</title>
</head>
<body>

<%

String un=request.getParameter("un");
String pwd=request.getParameter("pwd");

if(un.equals("swaraj") && pwd.equals("raut")){
	out.println("Login Succesfulll");
//	response.sendRedirect("https://chatgpt.com");

	RequestDispatcher rd=request.getRequestDispatcher("./Display");
    rd.forward(request,response);	
}
else{
	out.println("Failed");
	out.println("<a href='./Login.html'>Go Home</a>");
}
 

%>
</body>
</html>