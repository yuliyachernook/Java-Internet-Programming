<%@ page import="java.sql.Connection" %>
<%@ page import="Model.Comment" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit comment</title>
    <link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body style="background-image: url('Competencies_Pattern_Grey_BG.jpg'); background-size: cover;">
<div class="FormEditComment">
    <%
        Comment comment = null;
        try {
            comment = Comment.getCommentFromDb(Integer.parseInt(request.getParameter("Id")));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    %>
    <form method="post" action="EditComment">
        <H1>Your comment:</H1>
        <br/>
        <textarea cols="15" rows="5" name="comment"><%=comment.get_CommentText()%></textarea>
        <input type="text" value="<%=request.getParameter("Id")%>" style="display: none;" name="Id">
        <br/>
        <br/>
        <input type="submit" style="background: #c8a2c8; border-radius: 3px; width: 130px;" value="Terminate editing">
    </form>
</div>
</body>
</html>
