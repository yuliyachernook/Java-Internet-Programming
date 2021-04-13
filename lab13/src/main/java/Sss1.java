import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class Sss1 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Sss1() {
        super();
        System.out.println("Sss1: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Sss1: init");
        //printWriter.println("init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Sss1: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        printWriter.print("Sss1: service");
        printWriter.print("\nSss1: host: " + rq.getRemoteHost());
        RequestDispatcher rd=null;
        //task_1
        rd=rq.getRequestDispatcher("/Ggg1");
        rd.forward(rq,rs);
    }
}