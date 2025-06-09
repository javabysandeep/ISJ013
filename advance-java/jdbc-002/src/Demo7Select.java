import java.sql.*;

public class Demo7Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 01 : load and register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 02 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);

        //step 03 : create the statement object
        Statement statement = connection.createStatement();

        //step 04 : execute the query
        System.out.println("id"+"\t"+"name"+"\t"+"price");
        ResultSet resultSet = statement.executeQuery("select * from course");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            System.out.println(id+"\t"+name+"\t"+price);
        }

        //step 05 : close the connection
        connection.close();


    }
}
