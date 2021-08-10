package stafftag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class Submit extends TagSupport{
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print("<input type=\"submit\" name=\"press\" value=\"ok\" size=\"20\">"+"\t"+
                    "<input type=\"submit\" name=\"press\" value=\"cancel\" size=\"20\">");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
