package epam.task.datalex.academi.tags;



import javax.servlet.jsp.JspException;
import java.io.IOException;


public class FareFamilyGetter extends CustomTag {


    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute(getVar(), getFlight().getFareFamily());
    }
}
