import Model.Comment;
import pack.JdbcConnection;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/EditComment"})
public class EditComment extends HttpServlet {
    public EditComment() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String Id = request.getParameter("Id");
        String action = request.getParameter("action");
        if (action.equals("del")) {
            try {
                Connection connection = JdbcConnection.getConnection();
                Statement statement = connection.createStatement();
                Comment comment = Comment.getCommentFromDb(Integer.parseInt(request.getParameter("Id")));
                statement.execute("DELETE FROM comments WHERE comment_id = " + Id);
                response.sendRedirect("Comment.jsp?Id=" + comment.get_LinkId());
            } catch (ClassNotFoundException | IOException | SQLException var9) {
                var9.printStackTrace();
            }
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String Id = request.getParameter("Id");
        String CommentText = request.getParameter("comment");
        Comment comment = null;

        try {
            comment = Comment.getCommentFromDb(Integer.parseInt(request.getParameter("Id")));
        } catch (SQLException var11) {
            var11.printStackTrace();
        } catch (ClassNotFoundException var12) {
            var12.printStackTrace();
        }
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException var10) {
//            var10.printStackTrace();
//        }

        try {
            Connection connection = JdbcConnection.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(String.format("UPDATE comments SET comtext = \'" + CommentText + "\' WHERE comment_id = " + Id));
            statement.close();
            connection.close();
        } catch (SQLException var9) {
            var9.printStackTrace();
        }

        response.sendRedirect("Comment.jsp?Id=" + comment.get_LinkId());
    }
}
