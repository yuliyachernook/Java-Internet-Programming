import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ttt extends HttpServlet {
    public Ttt() {
    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        System.out.println("classes.Ttt:doPost");
        if("ok".equals(rq.getParameter("press")))
        {
            rs.setContentType("text/html");
            PrintWriter pw = rs.getWriter();
            pw.println("<html><body>"
                    +"Surname:        " + rq.getParameter("surname")
                    +"<br>Name:   " + rq.getParameter("Name")
                    +"<br>Sex:        " + rq.getParameter("sex")
                    +"</body></html>");
            pw.close();
        }
        else {
            RequestDispatcher rd = rq.getRequestDispatcher("index.jsp");
            rd.forward(rq, rs);
        }

    }
    protected void service(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        super.service(var1, var2);
    }
}