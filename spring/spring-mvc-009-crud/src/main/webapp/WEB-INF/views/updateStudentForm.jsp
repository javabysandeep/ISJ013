<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student Form</title>
</head>
<body>
<h3>Update Student Form</h3>
<table>

    <form action="http://localhost:8080/spring_mvc_009_crud_war/students/update" method="post">
        <tr>
            <td>Enter Id</td>
            <td><input type="number" name="id"/></td>
        </tr>
        <tr>
            <td>Enter Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Enter Age</td>
            <td><input type="number" name="age"/></td>
        </tr>
        <tr>
            <td>Enter Address</td>
            <td><input type="text" name="address"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Update Student"/></td>
        </tr>
    </form>

</table>

</body>
</html>
