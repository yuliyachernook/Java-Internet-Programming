import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sss extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Sss() {
        System.out.println("Sss: constructor");
    }

    public void init(ServletConfig var1) throws ServletException {
        super.init();
        System.out.println("Sss: init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Sss: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {


        rs.setContentType("text/html");
        // Hello
        PrintWriter out = rs.getWriter();
        out.println("<h1>remote servlet</h1>");


    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("text/html");
        // Hello
        PrintWriter out = rs.getWriter();
        out.println("<html><body>");
        out.println("<h1>remote servlet</h1>");
        out.println("SSS</body></html>");
    }
}
