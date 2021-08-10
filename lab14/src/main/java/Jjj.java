import jspclass.Regimex;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Jjj extends HttpServlet implements Servlet {
/*
    protected void service(HttpServletRequest rq, HttpServletResponse rs) throws IOException {


        Regimex r = new Regimex();
        Integer n = r.GetHOUR();

        if ((n >= 0) && (n <= 6))
            rs.sendRedirect("night.jsp");
        else if ((n > 6) && (n <= 12))
            rs.sendRedirect("morning.jsp");
        else if ((n > 12) && (n <= 17))
            rs.sendRedirect("afternoon.jsp");
        else
            rs.sendRedirect("evening.jsp");
    }
    */
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.sendRedirect("evening.jsp");
    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.sendRedirect("night.jsp");
    }
}
