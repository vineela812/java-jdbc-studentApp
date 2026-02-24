import java.sql.*;
public class DBConnection {
    static String url="jdbc:mysql://localhost:3306/jdbc_db";
    static String user="root";
    static String password="Vineela@123";
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,user,password);
    }
}
