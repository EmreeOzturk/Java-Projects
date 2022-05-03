import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlConnection {

    public static Connection connectToDatabase() {
        String dbUrl = "jdbc:mysql://localhost:3306/world";
        String userName = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connection success");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection fail \n Error:"+e.getMessage()+"\n Error Code:"+e.getErrorCode());
            return connection;
        }


    }
}
