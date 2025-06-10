import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 02 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //step 03 : create the statement object
        Statement statement = connection.createStatement();

        //step 04 : execute the query
        statement.executeUpdate("delete from course where id=5");

        //step 05 : close the connection
        connection.close();

        System.out.println("Row deleted successfully");

    }
}
