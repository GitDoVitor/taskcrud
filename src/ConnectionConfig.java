import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionConfig {
    public Connection getConnection() throws SQLException;
}
