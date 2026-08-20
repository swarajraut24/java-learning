 <%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${not empty param.username}">
    <c:set var="user" value="${param.username}" scope="session"/>
</c:if>

<c:if test="${empty sessionScope.user}">
    <c:redirect url="login.jsp"/>
</c:if>

<html>
<body>

<h2>Welcome ${sessionScope.user}</h2>

<p>Server Date and Time : <%= new Date() %></p>

<form action="logout.jsp">
<input type="submit" value="Logout">
</form>

</body>
</html>