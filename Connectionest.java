
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionest {
 public static Connection Connectivity() throws ClassNotFoundException, SQLException
 {
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/motivity";
  String username="root";
  String password="root";
  Connection con=DriverManager.getConnection(url, username, password);

 return con;
 }

}
