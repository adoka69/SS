package sample;
import java.sql.*;

public class DBworker {

    private static String URL ="jdbc:sqlserver://localhost:1433;instanceName=Адока;databaseName=Students";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    private Connection connection;

    public DBworker(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
