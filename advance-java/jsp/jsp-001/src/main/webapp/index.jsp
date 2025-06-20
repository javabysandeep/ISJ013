<%@ page import="java.io.PrintWriter" %>
<html>
<body>
<h2>Welcome to JSP technology</h2>
<table>
    <%
        class LocalInnerClass{}


        int number = 29;
        for (int i = 1; i <= 10; i++) {

    %>
    <tr>
        <td><%
            PrintWriter writer = response.getWriter();
            writer.println(i * number);

        %>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
