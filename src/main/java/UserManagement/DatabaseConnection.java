package UserManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:simple_user_management.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
