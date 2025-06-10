import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo12CallableStatementCallProcedure {
    public static void main(String[] args) throws SQLException {
        //call the stored procedure
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
        String query = "call isj013.course_proc";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        callableStatement.close();
        connection.close();
        System.out.println("procedure executed successfully");

    }
}
