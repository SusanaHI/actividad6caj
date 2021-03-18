package tagsPersonalizados;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class tagVacio extends SimpleTagSupport{
    
    @Override
    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        out.println("Me llamo Susana Hernández Ibarra y hoy es 16 de marzo del 2021.");
    }
    
}