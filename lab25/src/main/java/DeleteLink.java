import pack.JdbcConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteLink extends HttpServlet {
    public DeleteLink() {
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) {
        String Id = rq.getParameter("Id");

        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Links WHERE Link_Id = " + Id);
            rs.sendRedirect("index.jsp");
        } catch (IOException | SQLException var12) {
            System.out.println(var12);
        }

    }
}