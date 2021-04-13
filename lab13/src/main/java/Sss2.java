import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class Sss2 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Sss2() {
        super();
        System.out.println("Sss2: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Sss2: init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Sss2: destroy");
    }

    //task_2
    protected void service(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        String firstname = rq.getParameter("firstname");
        String lastname = rq.getParameter("lastname");
        System.out.println("Sss2: service " + rq.getMethod());
        printWriter.print("\nPost (Sss2): firstname: " + firstname);
        printWriter.print("\nPost (Sss2): lastname: " + lastname);
        /*RequestDispatcher rd = null;
        rd = rq.getRequestDispatcher("/Ggg2");
        rd.forward(rq, rs);*/
        //task_6
        String path=rq.getContextPath()+"/Ggg2";
        rs.sendRedirect(path);

    }
}