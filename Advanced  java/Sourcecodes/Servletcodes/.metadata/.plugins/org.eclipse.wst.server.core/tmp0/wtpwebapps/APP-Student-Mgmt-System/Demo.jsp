<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Script>

function display(name){
  alert("Hello, "+name);
}

function modify(){
	var a=document.getElementById("msg");
	a.innerText="I love India";
}

function update(){
	var sname=document.getElementById("sname");
    var data=sname.value;
     sname.value=data.toUpperCase();
}

</Script>

</head>
<body>
       <input type="button" value="click here" onclick="display('swaraj')"/><br>
       --------------------------------------------------<br>
       
      <h1 id="msg">Welcome to TCA</h1>
      <input id="msg" type="button" value="modify me" onclick="modify()"/><br>
        ---------------------------------------------------<br>
        
        <br>
       <input id="sname" type="text" onkeydown="update()"/><br>
      <input  type="button" value="update me" onclick="update()" />
           
</body>
</html>