<%@ page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exception handler</title>
</head>
<body>
<%
    out.println("exception occurred due to " + exception.getMessage());
%>
</body>
</html>
