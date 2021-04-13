import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Ggg7 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Ggg7() {
        super();
        System.out.println("Ggg7: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Ggg7: init");
        //printWriter.println("init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Ggg7: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        System.out.println("Ggg7: service " + rq.getMethod());
        //task_7
        String name = rq.getParameter("name");
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("Ggg7:name = " + name);
        pw.flush();
    }
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        System.out.println("Ggg7: service " + rq.getMethod());
        //task_7
        String sentence = rq.getParameter("sentence");
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("Ggg7:your sentence = " + sentence);
        pw.flush();
    }
}