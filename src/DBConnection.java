import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection implements ConnectionConfig {

    private final String DB_USER = "postgres";
    private final String DB_PASSWORD = "mysecretpassword";
    private final String DB_URL = "jdbc:postgresql://localhost:8080/taskcrud";
    private Connection connect;

    @Override
    public Connection getConnection() throws SQLException {
        
        if (connect == null) {
            connect = java.sql.DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }

        return connect;
    }
}
