package com.itshaala.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection con = null;
    private static String url = "jdbc:mysql://localhost:3306/isj013";
    private static String username = "root";
    private static String password = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("could not load driver");
        }
    }

    public static Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                System.out.println("could not connect to database");
            }
        }
        return con;
    }
}
