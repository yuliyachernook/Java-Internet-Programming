<%@ page import="java.sql.Connection" %>
<%@ page import="Model.Link" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit link</title>
    <link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body style="background-image: url('Competencies_Pattern_Grey_BG.jpg'); background-size: cover;">
<div class="FormEditComment">
    <%
        Link link = null;
        try {
            link = Link.getLinkFromDb(Integer.parseInt(request.getParameter("Id")));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    %>
    <form method="post" action="EditLink">
        <H1>Link:</H1>
        <p>URL:</p>
        <textarea cols="30" rows="5" name="Link"><%=link.get_Ref()%></textarea>
        <br/>
        <p>Keywords:</p>
        <textarea cols="30" rows="5" name="Desc"><%=link.get_DescriptionLink()%></textarea>
        <input type="text" value="<%=request.getParameter("Id")%>" style="display: none;" name="Id">
        <br/>
        <br/>
        <input type="submit" style="background: #c8a2c8; border-radius: 3px; width: 130px;" value="Update link">
    </form>
</div>
</body>
</html>
