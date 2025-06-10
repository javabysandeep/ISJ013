import java.sql.*;

public class Demo1Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : create the project and add the necessary jar - mysql
        //step 02 : set up the database and get connection details
        //step 03 : Load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");//this is automated from Java 7

        //step 04: Get the connection
        String url = "jdbc:mysql://localhost:3306/isj013";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 05 : create the statement object in order to call method to execute query
        Statement statement = connection.createStatement();

        //step 06 : execute the query
        ResultSet resultSet = statement.executeQuery("select * from student");

        //step 07 : read the rows from ResultSet object
        System.out.println("ID" + "\t" + "Name");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("name"));
        }

        //step 08 : close the connection
        resultSet.close();
        statement.close();
        connection.close();

    }
}
