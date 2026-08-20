 <!DOCTYPE html>
<html>
<head>
    <title>Page 1</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }

        .box {
            width: 300px;
            margin: 100px auto;
            padding: 20px;
            background: white;
            border-radius: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
        }

        button {
            width: 100%;
            padding: 10px;
            background: blue;
            color: white;
            border: none;
        }
    </style>
</head>
<body>

<div class="box">
    <h3>Personal Details</h3>

    <form action="Page1Servlet" method="post">
        Name:
        <input type="text" name="name" required>

        Email:
        <input type="email" name="email" required>

        <button type="submit">Next</button>
    </form>
</div>

</body>
</html>