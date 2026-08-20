<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TCA,Pune</title>
     
</head>
<body>


    <div class="container" style="margin-top:100px;">
    <h2 class="text-center text-primary mt-3 mt-5">Registration Form</h2>
    
    <form method="post" action="./addstudent" >
    
    <div class="mb-3">
    
    <label for="exampleInputEmail1" class="form-label">Roll Number</label>
    <input type="text"  name="rno" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
    
  </div>
  
   
    <div class="mb-3">
    
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <input type="text"  name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
    
  </div>
  
   
    <div class="mb-3">
    
    <label for="exampleInputEmail1" class="form-label">Percentage</label>
    <input type="text"  name="per" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
    
  </div>
 
    <div class="d-grid gap-2">
       <input type="submit" value="Save" class="btn btn-primary">
     </div>
     
    </form>
    
   <p>
      ${msg}
    </p>
    </div>
    
    </div>
     
</body>
</html>