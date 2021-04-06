import java.io.IOException; // исключения ввода/вывода
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.*; // интерфейсы и классы общего типа
import javax.servlet.http.*; // расширение javax.servlet для http

public class Sss extends HttpServlet implements Servlet {

    public Sss() {
        super();
        System.out.println("Sss:constructor");
    }
    public void init(ServletConfig sc) throws ServletException {
        // инициализация сервлета
        super.init();
        System.out.println("Sss:init");
    }
    public void destroy() {
        // перед уничтожением сервлета
        super.destroy();
        System.out.println("Sss:destroy");
    }
    protected void service(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        // обработка http-запроса
        System.out.println("Sss:service:"+rq.getMethod());
        PrintWriter var = rs.getWriter();
        var.write("Sss: service: " + rq.getMethod() + "\n");
        var.write("Server name: " + rq.getServerName() + "\n");
        var.write("Addr: " + rq.getRemoteAddr() + " Port: " + rq.getRemotePort() + "\n\n");
    }

    public void doGet(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        System.out.println("Sss: doGet");
        PrintWriter var3 = var2.getWriter();
        String var4 = var1.getParameter("firstname");
        String var5 = var1.getParameter("lastname");
        var3.write("Sss: doGet\n");
        var3.write("firstname: " + var4 + " lastname: " + var5 + "\n");
    }

    public void doPost(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        System.out.println("Sss: doPost");
        PrintWriter var3 = var2.getWriter();
        String var4 = var1.getParameter("firstname");
        String var5 = var1.getParameter("lastname");
        var3.write("Sss: doPost\n");
        var3.write("firstname: " + var4 + " lastname: " + var5 + "\n");
    }
}