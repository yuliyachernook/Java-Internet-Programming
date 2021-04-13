import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Ggg3_5 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Ggg3_5() {
        super();
        System.out.println("Ggg3_5: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Ggg3_5: init");
        //printWriter.println("init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Ggg3_5: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        //task_3_4_5
        RequestDispatcher rd=null;
        rd=rq.getRequestDispatcher("/htmlFromServlet.html");
        rd.forward(rq,rs);
        /*//task_6
        String path=rq.getContextPath()+"/htmlFromServlet.html";
        rs.sendRedirect(path);
        */
    }
}