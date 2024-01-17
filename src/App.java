import java.sql.Connection;
import java.sql.ResultSet;


public class App {
    public static void main(String[] args) throws Exception {
        String sql = "SELECT * FROM task";

        ConnectionConfig connect = new DBConnection();
        ResultSet result = connect.getConnection().prepareStatement(sql).executeQuery();

        while (result.next()) {
            System.out.println(result.getString("task_name"));
        }
        
    }
}
