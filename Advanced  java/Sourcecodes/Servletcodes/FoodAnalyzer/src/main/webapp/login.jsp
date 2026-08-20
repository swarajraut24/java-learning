 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | Secure Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
    
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-card {
            background: rgba(255, 255, 255, 0.9);
            backdrop-filter: blur(10px);
            border-radius: 20px;
            border: none;
            box-shadow: 0 15px 35px rgba(0,0,0,0.2);
            width: 100%;
            max-width: 400px;
            padding: 2rem;
        }
        .form-floating > label { color: #6c757d; }
        .btn-login {
            background: #764ba2;
            border: none;
            padding: 12px;
            font-weight: 600;
            transition: 0.3s;
        }
        .btn-login:hover {
            background: #5a3782;
            transform: translateY(-2px);
        }
        .input-group-text {
            cursor: pointer;
            background: transparent;
            border-left: none;
        }
        .form-control:focus {
            box-shadow: none;
            border-color: #764ba2;
        }
    </style>
</head>
<body>

<div class="login-card animate__animated animate__fadeInDown">
    <div class="text-center mb-4">
        <div class="bg-primary d-inline-block p-3 rounded-circle mb-3 shadow">
            <i class="fas fa-lock text-white fa-2x"></i>
        </div>
        <h3 class="fw-bold text-dark">Welcome Back</h3>
        <p class="text-muted small">Please enter your credentials</p>
    </div>

    <% if(request.getAttribute("error") != null) { %>
        <div class="alert alert-danger d-flex align-items-center small py-2" role="alert">
            <i class="fas fa-exclamation-circle me-2"></i>
            <div><%= request.getAttribute("error") %></div>
        </div>
    <% } %>

    <form action="login" method="post" class="needs-validation" novalidate>
        <div class="form-floating mb-3">
            <input type="email" name="email" class="form-control" id="email" placeholder="name@example.com" required>
            <label for="email">Email address</label>
        </div>

        <div class="input-group mb-3">
            <div class="form-floating flex-grow-1">
                <input type="password" name="password" class="form-control" id="password" placeholder="Password" style="border-right:none" required>
                <label for="password">Password</label>
            </div>
            <span class="input-group-text border-start-0" id="togglePassword">
                <i class="fas fa-eye text-muted"></i>
            </span>
        </div>

        <div class="d-flex justify-content-between mb-4">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="remember">
                <label class="form-check-label small" for="remember">Remember me</label>
            </div>
            <a href="#" class="small text-decoration-none">Forgot Password?</a>
        </div>

        <button type="submit" class="btn btn-primary btn-login w-100 mb-3">
            SIGN IN <i class="fas fa-sign-in-alt ms-2"></i>
        </button>

        <p class="text-center small text-muted">
            Don't have an account? <a href="signup.jsp" class="text-decoration-none fw-bold">Register here</a>
        </p>
    </form>
</div>

<script>
    // Password visibility toggle
    const togglePassword = document.querySelector('#togglePassword');
    const password = document.querySelector('#password');

    togglePassword.addEventListener('click', function (e) {
        const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
        password.setAttribute('type', type);
        this.querySelector('i').classList.toggle('fa-eye-slash');
    });

    // Bootstrap validation
    (() => {
        'use strict'
        const forms = document.querySelectorAll('.needs-validation')
        Array.from(forms).forEach(form => {
            form.addEventListener('submit', event => {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }
                form.classList.add('was-validated')
            }, false)
        })
    })()
</script>

</body>
</html>