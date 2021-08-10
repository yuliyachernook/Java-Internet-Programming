<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Model.Comment"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.time.LocalDate" %>
<html>
<head>
    <title>Comments</title>
    <link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body style="background-image: url('Competencies_Pattern_Grey_BG.jpg'); background-size: cover;">
<div id="comments">
    <div id="FormComment">
        <form method="post" action="AddComment">
            <H2>Leave your comment!</H2>
            <table>
                <tr>
                    <td>Your name: </td>
                    <td><input onfocus="this.value=''" value="Type here your name..." style="background: aliceblue; border-radius: 3px; width: 200px;" type="text" name="name" width="150px"></td>
                </tr>
                <tr>
                    <td>Your comment: </td>
                    <td>
                        <textarea style="background: aliceblue; border-radius: 3px; width: 200px;" cols="20" rows="5" name="comment"></textarea>
                    </td>
                </tr>
                <tr>
                    <td align="right" colspan="2">
                        <input type="text" value="<%=request.getParameter("Id")%>" style="display: none;" name="Id">
                        <input type="submit" style="background: #c8a2c8; border-radius: 3px; width: 130px;" value="Add a comment">
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div id="ListOfComments">
        <%
            ArrayList<Comment> comments = null;
            try {
                comments = Comment.getCommentsFromDb(Integer.parseInt(request.getParameter("Id")));
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
                e.printStackTrace();
            }
            for(Comment comment: comments){
        %>

        <div class="Comment">
            <p>
                <span><b><%=comment.get_author()%></b></span><br>
                <span><i><%=comment.get_date().toString()%></i></span>
            <p><%=comment.get_CommentText()%></p>
            <%
                Cookie[] cookies = request.getCookies();
                String UserName = null;
                String cookieName = "UserName";
                LocalDate date = LocalDate.now();
                String p = String.valueOf(date.getMonthValue() + date.getDayOfMonth() + date.getYear());
                for(Cookie cookie: cookies){
                    if (cookieName.equals(cookie.getName())) {
                        UserName = cookie.getValue();
                        break;
                    }
                }
                if (UserName.equals(comment.get_author()) || UserName.equals(p) || request.getParameter("admin")!=null){
            %>
            <a href="EditComment.jsp?Id=<%=comment.get_id()%>">Edit comment</a>
            <a href="EditComment?Id=<%=comment.get_id()%>&action=del">Delete comment</a>
            <%}%>
            </p>
        </div>
        <%}%>
    </div>
</div>
</body>
</html>
