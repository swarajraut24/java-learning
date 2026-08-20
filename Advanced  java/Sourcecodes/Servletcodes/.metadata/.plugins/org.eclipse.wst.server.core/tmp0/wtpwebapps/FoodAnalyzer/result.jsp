<!DOCTYPE html>
<html>
<head>
<title>Result</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(to right, #ff758c, #ff7eb3);
}
.card {
    border-radius: 15px;
}
</style>

</head>
<body>

<div class="container mt-5">

<div class="card p-4 shadow col-md-6 mx-auto">

<h3 class="text-center">Product Analysis</h3>

<p><b>Product:</b> ${product.name}</p>
<p><b>Ingredients:</b> ${product.ingredients}</p>

<%
int score = (int) request.getAttribute("score");
String color = "green";

if(score < 50) color = "red";
else if(score < 80) color = "orange";
%>

<p><b>Health Score:</b> <span style="color:<%=color%>"><%=score%></span></p>

<p><b>Category:</b> ${category}</p>
<p><b>Your BMI:</b> ${bmi}</p>
<p><b>Recommendation:</b> ${recommendation}</p>

<div class="text-center mt-3">
    <button onclick="window.print()" class="btn btn-success">Download Report</button>
</div>

<br>

<div class="text-center">
    <a href="index.jsp" class="btn btn-primary">Scan Again</a>
</div>

</div>

</div>

</body>
</html>