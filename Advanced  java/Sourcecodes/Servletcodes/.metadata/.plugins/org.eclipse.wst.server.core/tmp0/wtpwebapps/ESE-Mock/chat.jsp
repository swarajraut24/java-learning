 <%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">

<title>Multi User Chat</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body { background:#0f172a; }

.chat-box {
    height: 80vh;
    overflow-y: auto;
    padding: 15px;
    background: #020617;
}

.msg {
    padding:10px;
    margin:5px;
    border-radius:10px;
    max-width:60%;
    color:white;
}

.me { background:#22c55e; margin-left:auto; }
.other { background:#334155; margin-right:auto; }

.username {
    font-size:12px;
    opacity:0.7;
}
</style>

<script>
let username = localStorage.getItem("username");

if(!username){
    username = prompt("Enter your name:");
    localStorage.setItem("username", username);
}

function loadMessages(){
    fetch("FetchServlet")
    .then(res => res.text())
    .then(data => {

        let chat = document.getElementById("chat");
        chat.innerHTML = "";

        let lines = data.split("\n");

        lines.forEach(line => {
            if(line.trim() !== ""){

                let parts = line.split(":");
                let user = parts[0];
                let msg = parts.slice(1).join(":");

                let div = document.createElement("div");
                div.classList.add("msg");

                if(user === username){
                    div.classList.add("me");
                } else {
                    div.classList.add("other");
                }

                div.innerHTML = 
                    "<div class='username'>" + user + "</div>" +
                    "<div>" + msg + "</div>";

                chat.appendChild(div);
            }
        });

        chat.scrollTop = chat.scrollHeight;
    });
}

function sendMsg(){
    let msg = document.getElementById("msg").value;

    fetch("ChatServlet",{
        method:"POST",
        headers:{"Content-Type":"application/x-www-form-urlencoded"},
        body:"username="+username+"&message="+msg
    });

    document.getElementById("msg").value="";
}

setInterval(loadMessages,1000);
</script>

</head>

<body onload="loadMessages()">

<div class="container mt-3">

```
<h3 class="text-white text-center">💬 Multi User Chat</h3>

<div id="chat" class="chat-box"></div>

<div class="input-group mt-2">
    <input type="text" id="msg" class="form-control">
    <button class="btn btn-success" onclick="sendMsg()">Send</button>
</div>
```

</div>

</body>
</html>
 