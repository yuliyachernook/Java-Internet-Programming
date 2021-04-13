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

    protected void service(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        System.out.println("Sss: service: " + var1.getMethod());
        PrintWriter var3 = var2.getWriter();
        var3.write("Sss: service: " + var1.getMethod() + "\n");
        var3.write("Server name: " + var1.getServerName() + "\n");
        var3.write("Addr: " + var1.getRemoteAddr() + " Port: " + var1.getRemotePort() + "\n\n");
        var3.write(this.showRequest(var1) + "\n");
        super.service(var1, var2);
    }

    private String showRequest(HttpServletRequest var1) throws ServletException, IOException {
        StringBuilder var2 = new StringBuilder();
        var2.append(var1.getMethod() + " ");
        var2.append(var1.getRequestURL() + " ");
        var2.append(var1.getProtocol() + "\n");
        Enumeration var3 = var1.getHeaderNames();

        while(var3.hasMoreElements()) {
            String var4 = (String)var3.nextElement();
            var2.append(var4 + ": " + var1.getHeader(var4) + "\n");
        }

        return var2.toString();
    }
}