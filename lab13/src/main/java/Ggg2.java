import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Ggg2 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Ggg2() {
        super();
        System.out.println("Ggg2: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Ggg2: init");
        //printWriter.println("init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Ggg2: destroy");
    }

    //task_2
    protected void service(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        System.out.println("Ggg2: service " + rq.getMethod());
        String firstname = rq.getParameter("firstname");
        String lastname = rq.getParameter("lastname");
        printWriter.print("\nPost (Ggg2): firstname: " + firstname);
        printWriter.print("\nPost (Ggg2): lastname: " + lastname);
        //printWriter.close();
    }
}