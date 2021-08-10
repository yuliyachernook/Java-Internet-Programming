package stafftag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class Name extends TagSupport {
    static String in = "<label>stafftag.Name&nbsp &nbsp</label>"
            + "<input name =\"Name\" type = \"text\" width = \"150\" "
            + " maxlength= \"30\" ";
    public String value = "";
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print(in + (this.value.equals("")
                    ? " "
                    : "value =\"" + this.value + "\" />"));
        } catch (IOException e) {
            System.out.println("stafftag.Name: " + e);
        }
        return SKIP_BODY;
    }
}
