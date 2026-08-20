<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    height:100vh;
    background: linear-gradient(135deg,#4facfe,#00f2fe);
    display:flex;
    justify-content:center;
    align-items:center;
}

.welcome-card{
    width:500px;
    border-radius:20px;
    padding:40px;
    box-shadow:0 10px 30px rgba(0,0,0,0.2);
}

</style>

</head>
<body>

<%
String name = (String) session.getAttribute("nm");
%>

<div class="card welcome-card text-center bg-white">

<h1 class="text-primary mb-3">Welcome <%= name %></h1>

<h4 class="text-success mb-4">You are successfully logged in</h4>

<div class="alert alert-info">
Your session is active.
</div>

</div>

</body>
</html>