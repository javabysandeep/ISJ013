import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo10CallableStatementDropProc {
    public static void main(String[] args) throws SQLException {
        //drop the stored procedure
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
        CallableStatement callableStatement = connection.prepareCall("DROP PROCEDURE isj013.course_proc");
        callableStatement.execute();
        callableStatement.close();
        connection.close();
        System.out.println("procedure dropped");

    }
}
