<%@ page contentType="text/html; charset=UTF-8" %>

<%
    String q1 = (String)session.getAttribute("q1");
    String q2 = (String)session.getAttribute("q2");
    long time = (Long)request.getAttribute("time");
%>

<html>
<body>

<h2>Result</h2>

Q1: <%=q1%><br>
Q2: <%=q2%><br><br>

Time Taken: <%=time%> seconds<br><br>

<a href="logout">Logout</a>

</body>
</html>