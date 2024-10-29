package UserManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.connect()) {
            if (conn != null) {
                System.out.println("Datenbankverbindung erfolgreich.");

                // Beispiel für CRUD-Operationen
                // createRole(conn, "Admin");
                // createUser(conn, "Max", "max@example.com", 1);
            }
        } catch (SQLException e) {
            System.out.println("Fehler bei der Verbindung zur Datenbank: " + e.getMessage());
        }
    }

    public static void createRole(Connection conn, String roleName) {
        String sql = "INSERT INTO roles(role_name) VALUES('" + roleName + "')";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Rolle erstellt: " + roleName);
        } catch (SQLException e) {
            System.out.println("Fehler beim Erstellen der Rolle: " + e.getMessage());
        }
    }

    // Weitere Methoden wie createUser, createPermission etc.
}
