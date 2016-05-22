import epam.task.datalex.academi.bean.Customer;
import epam.task.datalex.academi.bean.Reservation;
import epam.task.datalex.academi.dao.DAOxml;
import epam.task.datalex.academi.dao.IDAO;
import org.junit.Test;


public class TestDAOxml {
    @Test
    public void testReservation() {
        IDAO xmlImpl = new DAOxml();
        Reservation reservation = xmlImpl.getReservation("g:\\Training\\Source\\data.xml");

    }

    @Test
    public void testCustomer(){
        IDAO xmlImpl = new DAOxml();
        Customer customer = xmlImpl.getCustomer("g:\\Training\\Source\\data.xml");
    }

}
