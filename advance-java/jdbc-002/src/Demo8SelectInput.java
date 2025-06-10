import java.sql.*;
import java.util.Scanner;

public class Demo8SelectInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", Constants.USERNAME, Constants.PASSWORD);
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter the employee last name");
        String lastName = scanner.nextLine();
        String query = "select * from employees where first_name='" + firstName + "' and last_name='" + lastName + "'";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));

        }
        scanner.close();
        connection.close();
    }
}
