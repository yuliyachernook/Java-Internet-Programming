import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sss extends HttpServlet implements Servlet {
    public Sss() {
            System.out.println("Sss:constructor");
        }

        public void init(ServletConfig var1) throws ServletException {
            super.init();
            System.out.println("Sss:init");
        }

        public void destroy() {
            super.destroy();
            System.out.println("Sss:destroy");
        }

        public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
            System.out.println("Sss: doGet");
            PrintWriter var3 = rs.getWriter();
            var3.write("Sss: doGet\n");
            RequestDispatcher rd=null;
            rd=rq.getRequestDispatcher("/Ggg");
            //Task4
            //rd=rq.getRequestDispatcher("/Ggg3_5");
            rd.forward(rq,rs);
            //Task6
            //String path=rq.getContextPath()+"/Ggg";
            //rs.sendRedirect(path);
        }


        protected void service(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
            System.out.println("Sss: service: " + var1.getMethod());
            PrintWriter var3 = var2.getWriter();
            var3.write("Sss: service: " + var1.getMethod() + "\n");
            var3.write("Server name: " + var1.getServerName() + "\n");
            var3.write("Addr: " + var1.getRemoteAddr() + " Port: " + var1.getRemotePort() + "\n\n");
            super.service(var1, var2);
        }
}
