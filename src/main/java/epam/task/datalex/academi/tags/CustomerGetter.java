package epam.task.datalex.academi.tags;

import epam.task.datalex.academi.bean.Customer;
import epam.task.datalex.academi.constants.Constants;
import epam.task.datalex.academi.dao.DAOFabric;
import epam.task.datalex.academi.dao.IDAO;
import javax.servlet.jsp.*;
import java.io.IOException;

public class CustomerGetter extends CustomTag  {


    @Override
    public void doTag() throws JspException, IOException {
        IDAO dao = DAOFabric.getInstance();
        Customer customer = dao.getCustomer(getRealPath() + Constants.XML_FILE_NAME);
        getJspContext().setAttribute(getVar(), customer);
    }
}
