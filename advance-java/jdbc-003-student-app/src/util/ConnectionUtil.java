package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection con;

    public static Connection getConnection() {
        try {
            return con != null ? con : DriverManager.getConnection("jdbc:mysql://localhost:3306/isj013", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
