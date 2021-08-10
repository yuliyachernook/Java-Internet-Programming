import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static java.lang.System.exit;

public class OracleServlet extends HttpServlet implements Servlet {
    protected static String sqlCommand = "select lastname, firstname, age from Users where firstname = ?";


    protected void doGet(HttpServletRequest rq,
                         HttpServletResponse rs)
            throws ServletException, IOException {
        rs.setCharacterEncoding("CP1251");
        PrintWriter pw = rs.getWriter();
        try {
            String host = "192.168.56.107";
            int    port = 1521;
            String sid  = "orcl";
            String user = "system";
            String pwd  = "12345";

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {
                System.out.println("Oracle JDBC Driver is not found");
                e.printStackTrace();
                exit (-1);
            }
            String url = String.format("jdbc:oracle:thin:@%s:%d:%s", host, port, sid);
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, user, pwd);
            } catch (SQLException e) {
                System.out.println("Connection Failed : " + e.getMessage());
                exit (-1);
            }
            if (connection != null) {
                System.out.println("Successful connection!");
            } else {
                System.out.println("Failed to make connection!");
            }
            PreparedStatement stm =
                    connection.prepareStatement(sqlCommand);
            stm.setString(1, "Yuliya");
            ResultSet rss = stm.executeQuery();
            pw.println("<table>");
            while (rss.next()) {
                pw.println("<tr>"+"<td>"+rss.getString(1)+"</td>"
                        +"<td>"+rss.getString(2)+"</td>"
                        +"<td>"+ rss.getInt(3)+"</td>"
                        +"</tr>");
            }
            pw.println("</table>");
            connection.close();
        }catch (SQLException e) {
            System.out.println("Rrr:doGet:SQLException:" + e);
        }
    }

}