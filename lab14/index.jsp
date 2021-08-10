<%@ page import="jspclass.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type"
          content="text/html; charset=ISO-8859-1">
    <title>Lab14</title>
    <%!  Regimex r = new Regimex();
        Integer n = r.GetHOUR();
        Integer d = r.GetDAY();
        String table = null;

        protected String DisplayTable(Integer count){
            Regimex r1 = new Regimex();
            table = "<table>";
            table+="<tr> <td>" + r1.GetDATE() + "</td>";
            table += " <td>" + r1.GetDayOfWeek() + "</td></tr>";

            for(int i = 1;i < count;i++){
                table += "<tr> <td>" + r1.AddDay(1) + "</td>";
                table += " <td>" + r1.GetDayOfWeek() + "</td></tr>";
            }
            table+="</table>";
            return table;
        }%>
</head>
<body>
    <%=r.Salutation(n)%>
    <%=DisplayTable(7)%>
    <br>-----------------------------------------
    <br>

    <form>
        <input type="submit" name = "T5" value="PRESS 5"/>
    </form>

    <% if("PRESS 5".equals(request.getParameter("T5"))){ %>
        <%if ((n >= 0) && (n <= 6)){%>
            <%@ include file="night.jsp" %>
        <%}else if ((n > 6) && (n <= 12)){%>
            <%@ include file="morning.jsp" %>
        <%}else if ((n > 12) && (n <= 17)){%>
            <%@ include file="afternoon.jsp" %>
        <%}else{%>
            <%@ include file="evening.jsp" %>
        <%}%>
    <%}%>

    <br>-----------------------------------------
    <br>

    <form>
        <input type="submit" name = "T6" value="PRESS 6"/>
    </form>

    <% if("PRESS 6".equals(request.getParameter("T6"))) { %>
        <%if ((n >= 0) && (n <= 6)){%>
            <jsp:include page="night.jsp" />
        <%}else if ((n > 6) && (n <= 12)){%>
            <jsp:include page="morning.jsp" />
        <%}else if ((n > 12) && (n <= 17)){%>
            <jsp:include page="afternoon.jsp" />
        <%}else{%>
            <jsp:include page="evening.jsp" />
    <%}%>
    <%}%>

    <br>-----------------------------------------
    <br>

    <form>
        <input type="submit" name = "T7" value="PRESS 7"/>
    </form>

    <% if("PRESS 7".equals(request.getParameter("T7"))) { %>
        <jsp:include page="Afternoon" />
    <%}%>

    <br>-----------------------------------------
    <br>

    <form>
        <input type="submit" name = "T8" value="PRESS 8"/>
    </form>

    <% if("PRESS 8".equals(request.getParameter("T8"))) { %>
    <%if ((n >= 0) && (n <= 6)){%>
    <jsp:forward page="night.jsp" />
    <%}else if ((n > 6) && (n <= 12)){%>
    <jsp:forward page="morning.jsp" />
    <%}else if ((n > 12) && (n <= 17)){%>
    <jsp:forward page="afternoon.jsp" />
    <%}else{%>
    <jsp:forward page="evening.jsp" />
    <%}%>
    <%}%>

    <br>-----------------------------------------
    <br><a href = "Jjj">TASK 11 Go to Jjj</a>

    <br>-----------------------------------------
    <br><a href = "Jjj">TASK 12 Go to Jjj</a>

    <br>-----------------------------------------
    <br>
    <form action="Jjj" method="post">
        <input type="submit" name="submit" value="TASK 13 Go to Jjj">
    </form>

</body>
</html>