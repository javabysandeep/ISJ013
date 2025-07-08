<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<h1>Greetings from Spring Web MVC</h1>
<%
    out.println(request.getAttribute("data"));
%>
</body>
</html>
