package epam.task.datalex.academi.tags;


import epam.task.datalex.academi.bean.Reservation;
import epam.task.datalex.academi.constants.Constants;
import epam.task.datalex.academi.dao.DAOxml;
import epam.task.datalex.academi.dao.IDAO;

import javax.servlet.jsp.JspException;
import java.io.IOException;

public class ReservationGetter  extends CustomTag{
    @Override
    public void doTag() throws JspException, IOException {
        IDAO idao = new DAOxml();
        Reservation reservation = idao.getReservation(getRealPath() + Constants.XML_FILE_NAME);
        getJspContext().setAttribute("reservation", reservation);
    }
}
