 <%@ page import="java.util.List" %>
<%@ page import="model.History" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User History</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        body { background-color: #f8f9fa; }
        .table-container { margin-top: 50px; }
        .card { border-radius: 15px; border: none; box-shadow: 0 4px 12px rgba(0,0,0,0.1); }
        .table thead { background-color: #0d6efd; color: white; }
        .hover-row:hover { background-color: #e9ecef; transition: 0.3s; }
        .badge-score { font-size: 0.9rem; padding: 0.5em 0.8em; }
    </style>
</head>
<body>

<div class="container table-container">
    <div class="row justify-content-center">
        <div class="col-md-10">
            
            <div class="card">
                <div class="card-header bg-white py-3 d-flex justify-content-between align-items-center">
                    <h4 class="mb-0 text-primary"><i class="fas fa-history me-2"></i>Activity History</h4>
                    <input type="text" id="tableSearch" class="form-control form-control-sm w-25" placeholder="Search product...">
                </div>
                
                <div class="card-body p-0">
                    <div class="table-responsive">
                        <table class="table table-hover mb-0" id="historyTable">
                            <thead>
                                <tr>
                                    <th class="ps-4">Product Name</th>
                                    <th class="text-center">Score</th>
                                    <th class="text-center">Status</th>
                                </tr>
                            </thead>
                            <tbody>
                            <%
                                List<History> list = (List<History>) request.getAttribute("history");
                                if (list != null && !list.isEmpty()) {
                                    for (History h : list) {
                            %>
                                <tr class="hover-row">
                                    <td class="ps-4 align-middle fw-semibold">
                                        <i class="fas fa-box-open text-secondary me-2"></i><%= h.getProductName() %>
                                    </td>
                                    <td class="text-center align-middle">
                                        <span class="badge rounded-pill bg-info text-dark badge-score">
                                            <%= h.getScore() %>
                                        </span>
                                    </td>
                                    <td class="text-center align-middle">
                                        <% if(h.getScore() >= 50) { %>
                                            <span class="text-success"><i class="fas fa-check-circle"></i> Passed</span>
                                        <% } else { %>
                                            <span class="text-danger"><i class="fas fa-times-circle"></i> Review</span>
                                        <% } %>
                                    </td>
                                </tr>
                            <% 
                                    } 
                                } else { 
                            %>
                                <tr>
                                    <td colspan="3" class="text-center py-5 text-muted">
                                        <i class="fas fa-folder-open fa-3x mb-3"></i>
                                        <p>No history records found for your account.</p>
                                    </td>
                                </tr>
                            <% } %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            
            <div class="mt-3 text-center">
                <a href="dashboard.jsp" class="btn btn-outline-secondary btn-sm">
                    <i class="fas fa-arrow-left me-1"></i> Back to Dashboard
                </a>
            </div>

        </div>
    </div>
</div>

<script>
    document.getElementById('tableSearch').addEventListener('keyup', function() {
        let value = this.value.toLowerCase();
        let rows = document.querySelectorAll('#historyTable tbody tr');
        rows.forEach(row => {
            row.style.display = row.innerText.toLowerCase().includes(value) ? '' : 'none';
        });
    });
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>