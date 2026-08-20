 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.History, model.User, service.BMIService" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FoodAnalyzer | Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <script src="https://unpkg.com/html5-qrcode"></script>
    
    <style>
        :root { --sidebar-bg: #111827; --accent: #3b82f6; }
        body { background-color: #f9fafb; font-family: 'Segoe UI', sans-serif; }
        .sidebar { width: 260px; height: 100vh; position: fixed; background: var(--sidebar-bg); color: white; }
        .main-content { margin-left: 260px; padding: 40px; }
        .nav-link { color: #9ca3af; padding: 12px 20px; border-radius: 8px; margin: 4px 15px; border: none; background: none; width: 85%; text-align: left;}
        .nav-link.active { background: var(--accent); color: white; }
        .nav-link:hover:not(.active) { background: #1f2937; color: white; }
        .card { border: none; border-radius: 15px; box-shadow: 0 4px 6px rgba(0,0,0,0.05); }
        #reader { width: 100%; border-radius: 12px; overflow: hidden; }
        .bmi-indicator { font-size: 2.5rem; font-weight: 800; color: var(--accent); }
    </style>
</head>
<body>

<%
    List<History> list = (List<History>) request.getAttribute("history");
    User user = (User) session.getAttribute("user");
    double bmi = BMIService.calculateBMI(user.getWeight(), user.getHeight());
    String bmiStatus = BMIService.getBMIStatus(bmi);
    
    int high = 0, med = 0, low = 0;
    if (list != null) {
        for (History x : list) {
            if (x.getScore() >= 80) high++;
            else if (x.getScore() >= 50) med++;
            else low++;
        }
    }
%>

<div class="sidebar d-flex flex-column p-3 shadow-lg">
    <div class="text-center py-4">
        <h3 class="fw-bold text-primary"><i class="fas fa-microchip me-2"></i>FoodAnalyzer</h3>
    </div>
    <div class="nav nav-pills flex-column" id="v-pills-tab" role="tablist">
        <button class="nav-link active mb-2" data-bs-toggle="pill" data-bs-target="#tab-home"><i class="fas fa-house me-2"></i> Overview</button>
        <button class="nav-link mb-2" data-bs-toggle="pill" data-bs-target="#tab-scan" onclick="startScanner()"><i class="fas fa-barcode me-2"></i> Scanner</button>
        <button class="nav-link mb-2" data-bs-toggle="pill" data-bs-target="#tab-bmi"><i class="fas fa-weight-scale me-2"></i> BMI Tracker</button>
        <button class="nav-link mb-2" data-bs-toggle="pill" data-bs-target="#tab-history"><i class="fas fa-clock-rotate-left me-2"></i> History</button>
    </div>
    <div class="mt-auto p-3 bg-dark rounded mx-2 mb-3">
        <div class="d-flex align-items-center">
            <div class="flex-grow-1 overflow-hidden">
                <p class="mb-0 small fw-bold text-truncate"><%= user.getName() %></p>
                <p class="mb-0 x-small text-muted" style="font-size: 0.7rem;"><%= user.getEmail() %></p>
            </div>
            <a href="logout" class="text-danger ms-2"><i class="fas fa-power-off"></i></a>
        </div>
    </div>
</div>

<div class="main-content">
    <div class="tab-content">
        
        <div class="tab-pane fade show active" id="tab-home">
            <h2 class="fw-bold mb-4">Hello, <%= user.getName().split(" ")[0] %>! 👋</h2>
            <div class="row g-4 mb-5">
                <div class="col-md-4">
                    <div class="card p-4 border-start border-primary border-5">
                        <p class="text-muted small fw-bold mb-1">HEALTHY CHOICES</p>
                        <h2 class="m-0"><%= high %></h2>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4 border-start border-warning border-5">
                        <p class="text-muted small fw-bold mb-1">MODERATE</p>
                        <h2 class="m-0"><%= med %></h2>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4 border-start border-danger border-5">
                        <p class="text-muted small fw-bold mb-1">UNHEALTHY</p>
                        <h2 class="m-0"><%= low %></h2>
                    </div>
                </div>
            </div>
            
            <div class="card p-4">
                <h5 class="fw-bold mb-3">Your Health Profile</h5>
                <div class="row align-items-center">
                    <div class="col-md-3 border-end">
                        <div class="bmi-indicator"><%= String.format("%.1f", bmi) %></div>
                        <span class="badge bg-primary px-3 py-2"><%= bmiStatus %></span>
                    </div>
                    <div class="col-md-9 ps-4">
                        <p class="text-muted mb-0">Weight: <b><%= user.getWeight() %> kg</b></p>
                        <p class="text-muted mb-0">Height: <b><%= user.getHeight() %> m</b></p>
                        <button class="btn btn-sm btn-outline-primary mt-3" onclick="document.querySelector('[data-bs-target=\'#tab-bmi\']').click()">Update Stats</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="tab-pane fade" id="tab-scan">
            <h2 class="fw-bold mb-4">Product Scanner</h2>
            <div class="row g-4">
                <div class="col-md-6">
                    <div class="card p-4">
                        <h5 class="mb-3"><i class="fas fa-camera me-2"></i>Live Barcode Scan</h5>
                        <div id="reader"></div>
                        <p class="small text-muted mt-3 text-center">Center the barcode in the frame</p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card p-4">
                        <h5 class="mb-3"><i class="fas fa-keyboard me-2"></i>Manual Entry</h5>
                        <form action="product" method="get">
                            <input type="text" name="barcode" class="form-control form-control-lg mb-3" placeholder="Enter barcode number..." required>
                            <button class="btn btn-primary btn-lg w-100 shadow">Analyze Content</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="tab-pane fade" id="tab-bmi">
            <h2 class="fw-bold mb-4">Body Metrics</h2>
            <div class="card p-4 shadow-sm" style="max-width: 500px;">
                <form action="updateProfile" method="post">
                    <div class="mb-3">
                        <label class="form-label fw-bold">Current Weight (kg)</label>
                        <input type="number" step="0.1" name="weight" class="form-control" value="<%= user.getWeight() %>" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label fw-bold">Current Height (m)</label>
                        <input type="number" step="0.01" name="height" class="form-control" value="<%= user.getHeight() %>" required>
                    </div>
                    <button class="btn btn-primary w-100 py-2">Save and Recalculate</button>
                </form>
            </div>
        </div>

        <div class="tab-pane fade" id="tab-history">
            <div class="card shadow-sm overflow-hidden">
                <div class="card-header bg-white py-3 d-flex justify-content-between">
                    <h5 class="m-0 fw-bold">Recent History</h5>
                    <input type="text" id="liveSearch" class="form-control w-25 shadow-sm" placeholder="Filter log...">
                </div>
                <table class="table table-hover align-middle mb-0" id="histTable">
                    <thead class="table-light">
                        <tr>
                            <th class="ps-4">Product Name</th>
                            <th class="text-center">Score</th>
                            <th>Category</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% if (list != null) { for (History h : list) { %>
                        <tr>
                            <td class="ps-4 fw-bold"><%= h.getProductName() %></td>
                            <td class="text-center">
                                <span class="badge <%= h.getScore() >= 50 ? "bg-primary" : "bg-secondary" %>">
                                    <%= h.getScore() %> / 100
                                </span>
                            </td>
                            <td><span class="text-muted"><%= h.getCategory() %></span></td>
                        </tr>
                        <% } } %>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script>
    // Scanner Logic
    let html5QrcodeScanner;
    function startScanner() {
        if(!html5QrcodeScanner) {
            html5QrcodeScanner = new Html5QrcodeScanner("reader", { fps: 10, qrbox: 250 });
            html5QrcodeScanner.render((code) => {
                window.location.href = "product?barcode=" + code;
            });
        }
    }

    // Search Logic
    document.getElementById('liveSearch').addEventListener('keyup', function() {
        let val = this.value.toLowerCase();
        let rows = document.querySelectorAll('#histTable tbody tr');
        rows.forEach(r => r.style.display = r.innerText.toLowerCase().includes(val) ? '' : 'none');
    });
</script>
</body>
</html>