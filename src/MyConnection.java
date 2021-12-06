
import java.sql.*;  
import java.sql.DriverManager;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/uni", "root", "6630795");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
