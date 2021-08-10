
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Model.Link, java.sql.*" %>
<%@ page import="pack.JdbcConnection, java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.time.LocalDate" %>
<!Doctype html>
<html>
<head>
    <title>UWSR</title>
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body style="background-image: url('Competencies_Pattern_Grey_BG.jpg'); background-size: cover;" >
<header>
    <h1 align="center"><u>Useful web-sites references</u></h1>
    <div id="Search">
        <form method="post" action="Search">
            <input onfocus="this.value=''" value="Type here to search..." style="background: aliceblue; border-radius: 3px; width: 200px;" type="text" width="250px" name="find">
            <input style="background: #c8a2c8; border-radius: 3px; width: 73px;" type="submit" value="Search">
        </form>
    </div>
</header>
<main>
    <% if (request.getParameter("admin")!=null){ %>
    <div id="FormAddLink">
        <form method="POST" action="AddLink">
            <table>
                <tr>
                    <td>Link: </td><td><input type="text" width="250px" name="Ref" onfocus="this.value=''" value="Type here new link..." style="background: aliceblue; border-radius: 3px; width: 200px;"></td>
                </tr>
                <tr>
                    <td>Keywords:</td></td><td><input type="text" width="250px" name="DescriptionLink" onfocus="this.value=''" value="Type here some wordkeys..." style="background: aliceblue; border-radius: 3px; width: 200px;"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input  type="submit" value="Add Link" width="150px" style="background: #c8a2c8; border-radius: 3px; width: 73px;" align="center"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <%}%>
    <p align="center"><h1>Search result</h1></p>
    <hr>
    <div id="FindedLinks">
        <%  HttpSession ses = request.getSession();
            if(ses.getAttribute("findedLinks") != null){
                ArrayList<Link> findedLinks = (ArrayList<Link>) ses.getAttribute("findedLinks");
                //  if (!findedLinks.isEmpty())
                for(Link link: findedLinks){
        %>
        <div class="Link" >
            <a href="<%=link.get_Ref()%>"><h1><%=link.get_DescriptionLink()%></h1></a>
            <div class="btns">
                <a href="AddLink?Id=<%=link.get_id()%>&action=true">Like</a>
                <a href="AddLink?Id=<%=link.get_id()%>&action=false">Dislike</a>
                <a href="Comment.jsp?Id=<%=link.get_id()%>" target="_blank">Comments</a>
                <span class="Useful"><%=link.get_IsUseful()%></span>
                <span class="Useless"><%=link.get_IsUseless()%></span>
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
                    if (UserName != null && UserName.equals(p)){
                %>
                <% if (request.getParameter("admin")!=null){ %>
                <a href="EditLink.jsp?Id=<%=link.get_id()%>&action=edit" >Update</a>
                <a href="DeleteLink?Id=<%=link.get_id()%>">Delete</a>
                <%}%>
                <%}%>
            </div>
        </div>
        <%}}%>
    </div>
    <br/>
    <p align="center"><h1>Links</h1></p>
    <hr/>
    <div Id="ListOfLinks">
        <%
            try {
                Connection connection = JdbcConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet listOfLinks = statement.executeQuery("SELECT * FROM Links");
                ArrayList<Link> links = new ArrayList<Link>();

                while(listOfLinks.next()){
                    Link link = new Link(listOfLinks.getInt(1),listOfLinks.getString(2), listOfLinks.getString(3), listOfLinks.getInt(4), listOfLinks.getInt(5));
                    links.add(link);
                }

                for(Link link: links){

        %>
        <div class="Link" >
            <a href="<%=link.get_Ref()%>"><h1><%=link.get_DescriptionLink()%></h1></a>
            <div class="btns">
                <a href="AddLink?Id=<%=link.get_id()%>&action=true">Like</a>
                <a href="AddLink?Id=<%=link.get_id()%>&action=false">Dislike</a>
                <a href="Comment.jsp?Id=<%=link.get_id()%>" target="_blank">Comments</a>
                <% if (request.getParameter("admin")!=null){ %>
                <a href="EditLink.jsp?Id=<%=link.get_id()%>&action=edit" >Update</a>
                <a href="DeleteLink?Id=<%=link.get_id()%>">Delete</a>
                <%}%>
                <span class="Useful"><%=link.get_IsUseful()%></span>
                <span class="Useless"><%=link.get_IsUseless()%></span>
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
                    if (UserName != null && UserName.equals(p)){
                %>
                <a href="DeleteLink?Id=<%=link.get_id()%>">Delete</a>
                <%}%>
            </div>
        </div>
        <%}

        }catch(SQLException e){
            e.printStackTrace();
        }%>
    </div>
</main>
</body>
</html>
