import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLException {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("localhost:8080/", "user", "password");  
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
