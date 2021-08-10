package pack;

import java.sql.*;
public class JdbcConnection {
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String host = "192.168.56.107";
            int    port = 1521;
            String sid  = "orcl";
            String user = "system";
            String pwd  = "12345";
            String url = String.format("jdbc:oracle:thin:@%s:%d:%s", host, port, sid);
            Connection connection = DriverManager.getConnection(url, user, pwd);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
