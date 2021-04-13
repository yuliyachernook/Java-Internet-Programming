import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class Sss7 extends HttpServlet implements Servlet {
    PrintWriter printWriter;

    public Sss7() {
        super();
        System.out.println("Sss7: constructor");
    }

    public void init(ServletConfig sc) throws ServletException {
        super.init();
        System.out.println("Sss7: init");
    }

    public void destroy() {
        super.destroy();
        System.out.println("Sss7: destroy");
    }

    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        System.out.println("Sss7: service "+rq.getMethod());
        //task_7
        String parm=rq.getParameter("name");
        HttpClient hc=new HttpClient();
        GetMethod gm;
        String uri="http://localhost:8081"+rq.getContextPath()+"/Ggg7?name="+parm;
        hc.executeMethod(gm=new GetMethod(uri));
        printWriter.println(gm.getResponseBodyAsString());
        printWriter.flush();
    }
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        printWriter = rs.getWriter();
        System.out.println("Sss7: service "+rq.getMethod());
        //task_9
        String parm=rq.getParameter("sentence");
        HttpClient hc=new HttpClient();
        PostMethod gm;
        String uri="http://localhost:8081"+rq.getContextPath()+"/Ggg7?sentence="+parm;
        hc.executeMethod(gm=new PostMethod(uri));
        printWriter.println(gm.getResponseBodyAsString());
        printWriter.flush();
    }
}