 <!DOCTYPE html>
<html>
<head>
    <title>Page 2</title>
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
            background: green;
            color: white;
            border: none;
        }
    </style>
</head>
<body>

<div class="box">
    <h3>Address Details</h3>

    <form action="Page2Servlet" method="post">
        Address:
        <input type="text" name="address" required>

        City:
        <input type="text" name="city" required>

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>