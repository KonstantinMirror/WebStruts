import epam.task.datalex.academi.bean.Customer;
import epam.task.datalex.academi.bean.FareFamily;
import epam.task.datalex.academi.bean.Reservation;
import epam.task.datalex.academi.dao.DAOxml;
import epam.task.datalex.academi.dao.IDAO;
import org.apache.log4j.Logger;
import org.junit.Test;


public class TestDAOxml {
    private static final Logger log = Logger.getLogger(TestDAOxml.class);


    @Test
    public void testReservation() {
        IDAO xmlImpl = new DAOxml();
        Reservation reservation = xmlImpl.getReservation("g:\\Training\\Source\\data.xml");
        log.info(reservation);

    }

    @Test
    public void testCustomer(){
        IDAO xmlImpl = new DAOxml();
        Customer customer = xmlImpl.getCustomer("g:\\Training\\Source\\data.xml");
        log.info(customer);
    }

    @Test
    public void testFareFamily(){
        IDAO xmlImpl = new DAOxml();
        FareFamily fareFamily = xmlImpl.getFareFamily("g:\\Training\\Source\\data.xml");
        log.info(fareFamily);
    }

}
