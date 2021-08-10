import Model.Comment;
import pack.JdbcConnection;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Model.Link;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditLink extends HttpServlet {
    public EditLink() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String Id = request.getParameter("Id");
        String linkValue = request.getParameter("Link");
        String desc = request.getParameter("Desc");
        Link link = null;

        try {
            link = Link.getLinkFromDb(Integer.parseInt(request.getParameter("Id")));
        } catch (SQLException var11) {
            var11.printStackTrace();
        } catch (ClassNotFoundException var12) {
            var12.printStackTrace();
        }


        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(String.format("UPDATE links SET url = \'" + linkValue + "\' , description = \'" + desc + "\'  WHERE link_id = " + Id));
            statement.close();
            connection.close();
        } catch (SQLException var9) {
            var9.printStackTrace();
        }

        response.sendRedirect("index.jsp");
    }
}
