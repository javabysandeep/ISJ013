<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 08-07-2025
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student </title>
</head>
<body>
<%
    out.println("Object from controller " + request.getAttribute("student"));
    out.println("input from the client " + request.getAttribute("id"));
%>

</body>
</html>
