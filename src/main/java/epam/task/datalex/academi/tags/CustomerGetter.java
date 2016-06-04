package epam.task.datalex.academi.tags;


import javax.servlet.jsp.*;
import java.io.IOException;

public class CustomerGetter extends CustomTag {


    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute(getVar(), getFlight().getCustomer());
    }
}
