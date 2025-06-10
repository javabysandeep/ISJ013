import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo11CallableStatementCreateProcedure {
    public static void main(String[] args) throws SQLException {
        //create the stored procedure
        Connection connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
        String query = "create procedure isj013.course_proc() begin insert into course(name,price) values('FSJ',100);end";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        callableStatement.close();
        connection.close();
        System.out.println("procedure created");

    }
}
