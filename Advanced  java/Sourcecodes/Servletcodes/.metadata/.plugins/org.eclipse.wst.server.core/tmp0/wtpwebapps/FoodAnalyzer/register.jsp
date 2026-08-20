<!DOCTYPE html>
<html>
<head>
<title>Register</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body {
    background: linear-gradient(to right, #43e97b, #38f9d7);
}
.card {
    border-radius: 15px;
}
</style>

</head>
<body>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card p-4 shadow" style="width: 400px;">

        <h3 class="text-center mb-3">Register</h3>

        <form action="register" method="post">

            <input type="text" name="name" class="form-control mb-2" placeholder="Name" required>
            <input type="email" name="email" class="form-control mb-2" placeholder="Email" required>
            <input type="password" name="password" class="form-control mb-2" placeholder="Password" required>

            <input type="text" name="weight" class="form-control mb-2" placeholder="Weight (kg)" required>
            <input type="text" name="height" class="form-control mb-2" placeholder="Height (m)" required>

            <button class="btn btn-success w-100">Register</button>
        </form>

        <div class="text-center mt-2">
            <a href="login.jsp">Already have account?</a>
        </div>

    </div>
</div>

</body>
</html>