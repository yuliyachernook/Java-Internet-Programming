import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Ggg1 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Ggg1() {
        super();
        System.out.println("Ggg1: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Ggg1: init");
        //printWriter.println("init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Ggg1: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        //task_1
       /* System.out.println("Ggg1: service: " + rq.getMethod());
        printWriter.print("\nGgg1: host: " + rq.getRemoteHost());*/
        RequestDispatcher rd=null;
        rd=rq.getRequestDispatcher("/htmlFromServlet.html");
        rd.forward(rq,rs);
    }
}