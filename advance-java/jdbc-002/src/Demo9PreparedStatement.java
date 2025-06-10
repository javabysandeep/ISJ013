import java.sql.*;
import java.util.Scanner;

public class Demo9PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", Constants.USERNAME, Constants.PASSWORD);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter the employee last name");
        String lastName = scanner.nextLine();

        //using preparedStatement
        String query = "select * from employees where first_name=? and last_name=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));

        }
        scanner.close();
        connection.close();
    }
}
