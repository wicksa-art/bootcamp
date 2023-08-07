import java.sql.*;
import java.sql.SQLException;

public class DBManager {
    private Connection conn;

    public DBManager(String dbURL, String username, String password) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC driver not found. Make sure it is added to the classpath.", e);
        }
    }

    public void createAccount(BankAccount account) throws SQLException {

    }

    public void updateAccount(BankAccount account) throws SQLException {

    }
}
