<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.tca.entities.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    height:100vh;
    background:linear-gradient(135deg,#6a11cb,#2575fc);
    display:flex;
    justify-content:center;
    align-items:center;
}

.login-card{
    width:400px;
    padding:30px;
    border-radius:15px;
    box-shadow:0px 10px 25px rgba(0,0,0,0.2);
}
</style>

</head>

<body>

<div class="card login-card bg-white">

<h2 class="text-center mb-4">Login Page</h2>

<form method="get" action="./display">

<div class="mb-3">
<label class="form-label">Username</label>
<input type="text" name="name" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">Password</label>
<input type="password" name="pwd" class="form-control">
</div>

<div class="d-grid">
<input type="submit" value="Submit" class="btn btn-primary">
</div>

</form>

<%
if("123".equals(request.getAttribute("name"))){
    out.println("<p class='text-danger text-center mt-3'>Username or password is incorrect</p>");
}
%>

</div>

</body>
</html>