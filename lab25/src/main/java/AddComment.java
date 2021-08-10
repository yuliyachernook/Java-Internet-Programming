import pack.JdbcConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddComment extends HttpServlet {
    public AddComment() {
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        Cookie cookie = new Cookie("UserName", name);
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        String comment = req.getParameter("comment");
        String Id = req.getParameter("Id");

        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(String.format("INSERT INTO comments(link_id, author, stamp, comtext) VALUES (\'%s\',\'%s\',sysdate,\'%s\')", Id, name, comment));
            statement.close();
            connection.close();
        } catch (SQLException var10) {
            System.out.println(var10);
            var10.printStackTrace();
        }

        resp.sendRedirect("Comment.jsp?Id=" + Id);
    }
}