 <!DOCTYPE html>
<html>
<head>
<title>Scanner</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://unpkg.com/html5-qrcode"></script>

<style>
body {
    background: linear-gradient(to right, #667eea, #764ba2);
    color: white;
}
.card {
    border-radius: 15px;
}
</style>

</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark px-3">
    <span class="navbar-brand">Food Analyzer</span>
    <div>
        <a href="history" class="btn btn-light btn-sm">History</a>
        <a href="logout" class="btn btn-danger btn-sm">Logout</a>
    </div>
</nav>

<div class="container mt-5 text-center">

<div class="card p-4 shadow mx-auto" style="width:400px;">

<h4>Scan Barcode</h4>

<!-- Button -->
<button class="btn btn-success mb-3" onclick="startScanner()">
    Start Camera
</button>

<!-- Scanner Area -->
<div id="reader" style="width:300px; margin:auto;"></div>

<hr>

<h5>Manual Entry</h5>

<form action="product" method="get">
    <input type="text" name="barcode" class="form-control mb-2" placeholder="Enter barcode" required>
    <button class="btn btn-primary w-100">Submit</button>
</form>

</div>

</div>

<script>

let started = false;

function startScanner() {

    if(started) return; // prevent multiple starts
    started = true;

    const html5QrCode = new Html5Qrcode("reader");

    Html5Qrcode.getCameras().then(devices => {
        if (devices.length > 0) {

            html5QrCode.start(
                devices[0].id,
                { fps: 10, qrbox: 250 },
                (decodedText) => {
                    window.location.href = "product?barcode=" + decodedText;
                }
            );
        }
    }).catch(err => console.log(err));
}

</script>

</body>
</html>