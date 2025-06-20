<%@ page import="java.io.PrintWriter" errorPage="handler.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operator = request.getParameter("operator");
    PrintWriter writer = response.getWriter();
    switch (operator) {
        case "+" -> out.println("Addition is " + (number1 + number2));
        case "-" -> out.println("Substraction is " + (number1 - number2));
        case "*" -> out.println("Multiplication is " + (number1 * number2));
        case "/" -> out.println("Division Quotient is " + (number1 / number2));
        case "%" -> out.println("Division Remainder is " + (number1 % number2));
        default -> out.println("invalid operator");
    }
%>
</body>
</html>
