<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression Tag</title>
</head>
<body>
<%=10 + 20 %>
<%="string " + 100 %>
<%=100 % 3%>
<%="Addition is " + add(100, 200)%>

<%!
    public int add(int number1, int number2) {
        return number1 + number2;
    }

%>
</body>
</html>
