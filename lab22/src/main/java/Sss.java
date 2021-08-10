import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class Sss extends HttpServlet implements Servlet  {
    public Sss() {
        super();
        System.out.println("Sss : constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Sss: init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Sss: destroy");
    }

    protected void service(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        System.out.println("Sss: servlet");
        PrintWriter pw = rs.getWriter();
        pw.println("Sss: servlet");
        pw.close();
    }
}
