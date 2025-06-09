import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2CreateTable {
    public static void main(String[] args) throws SQLException {
        //load and register the Driver with DriverManager
        //Class.forName("com.mysql.cj.jdbc.Driver");

        //get the connection
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);


        //create the statement object
        Statement statement = connection.createStatement();

        //execute the query
        String query = "create table course(id int primary key auto_increment, name varchar(100), price int)";
        statement.execute(query);

        //close the connection
        connection.close();
        System.out.println("table created");

    }
}
