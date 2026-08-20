<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@
   page import="java.util.*,com.tca.entities.*"
  
  %>
    <%@ include file="header.jsp" %>
  
  
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Delete student</title>
    
    
    <script>
    
     function del(srno){
    	  var status=confirm("Do you want to delete Student for Roll Number:"+srno);
    	  if(status==true){
    		  
    		  
    		  fetch("http://localhost:8080/APP-Student-Mgmt-System/delete",
    				  {
    			        method:'POST',
    			        body : new URLSearchParams({'trno':srno})
    				  }
    		  )
    		.then(response=>response.text())
    		.then(data=>
    		{
    		   if(data.trim()=="success"){
    			   alert(" Record is  Deleted  for roll number:"+srno);
    			   var tr=document.getElementById(srno);
    		    	 tr.remove();
    		   }
    		   if(data.trim()=="failed"){
    			   alert(" Failed to delete Record  for roll number:"+srno);
    		   }
    		
    		}
    		
    		)
    		
    		
    		.catch(error=> console.error("Myerror while deleting roll number= "+ srno));
    				  
    	
    	 }
    	  else{
    		  alert("Delete Skipped");
    	  }
     }
    </script>
</head>
<body>
<div class="container" style="margin-top:100px;"> 

   <h2 class="text-center text-primary mt-3 mt-5"> Student Information</h2>
  
  <div class="container-fluid d-flex justify-content-end">
  
  <form  class="d-flex  mb-4" role="search" method="GET" action="./update">
     <input  class="form-control me-3" placeholder="Search Here" type="search"  name="srno">
     <input class="btn btn-outline-success me-3" type="submit" name="sbtn" value="Search" >
       <input class="btn btn-outline-success" type="submit" name="sbtn" value="Refresh" >
       
  </form>
 </div>
 
  <br>
  
<table class="table table-hover table-bordered text-center">
<thead>
<tr class="table-primary">
    <th>Rno</th> <th>Name</th> <th>Percentage</th> <th>Action</th>
</tr>
</thead>
     <%
     
     List<Student> L = (List<Student>)request.getAttribute("students");
    
     if(L.isEmpty()){
   %>
    	 <tr>	 
    	 <td class="text-danger bg-danger-subtle" colspan="4">No Data Found !!!</td>
    	 </tr>
   <%
     }
     else{
     for(Student s : L){
   %>
   
     <tr id="<%= s.getRno() %>">
      <td><%= s.getRno() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getPer() %></td>
    <td>
    <button type="button" class="btn btn-danger" onclick="del(<%= s.getRno() %>)">Delete</button>
    
    
    </td>
      </tr>

   
 <%
     }
     }
     %>
     
 </table>
 </div>
  
</body>
</html>