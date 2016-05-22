package epam.task.datalex.academi.dao;


import epam.task.datalex.academi.bean.Customer;
import epam.task.datalex.academi.bean.FareFamily;
import epam.task.datalex.academi.bean.InternalStatus;
import epam.task.datalex.academi.bean.Reservation;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class DAOxml implements IDAO {
    private static final Logger log = Logger.getLogger(DAOxml.class);

    public Reservation getReservation(String nameFile) {
        Reservation reservation = new Reservation();
        Element rootNode = getRootElement(nameFile);
        reservation.setCode(rootNode.getAttributeValue("Code"));
        reservation.setDescription(rootNode.getAttributeValue("Description"));
        @SuppressWarnings("unchecked")
        List<Element> listResComponent = rootNode.getChildren("ResComponent", Namespace.getNamespace("urn:reservation.rqrs.datalex.com"));
        for (Element elementRes : listResComponent) {
            Reservation.ReservationComponent resComponent = new Reservation.ReservationComponent();
            resComponent.setComponentTypeCode(elementRes.getAttributeValue("ComponentTypeCode"));
            resComponent.setInternalStatus(InternalStatus.valueOf(elementRes.getAttributeValue("InternalStatus")));
            String dateTime = elementRes.getAttributeValue("CreateDateTime");
            reservation.getReservationComponents().add(resComponent);
        }
        return reservation;
    }

    public Customer getCustomer(String nameFile) {

        Customer customer = new Customer();
        Element rootNode = getRootElement(nameFile);
        Namespace documentNamespace = Namespace.getNamespace("urn:reservation.rqrs.datalex.com");
        Element currentCustomer = rootNode.getChild("Customer", documentNamespace);
        customer.setFirstName(currentCustomer.getAttributeValue("FirstName"));
        customer.setLastName(currentCustomer.getAttributeValue("LastName"));
        customer.setPhone(currentCustomer.getChild("Phone", documentNamespace).getAttributeValue("PhoneNumber"));
        customer.setEmail(currentCustomer.getChild("Email", documentNamespace).getAttributeValue("EmailAddress"));
        @SuppressWarnings("unchecked")
        List<Element> listPayments = currentCustomer.getChildren("Payment", documentNamespace);
        {

        }

        log.info(customer);

        return customer;
    }

    public FareFamily getFareFamily(String nameFile) {
        return null;
    }


    private Element getRootElement(String nameFile) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(nameFile);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();

            return rootNode;
        } catch (IOException io) {
            log.error(io);
            throw new IllegalStateException(io);
        } catch (JDOMException jdomEx) {
            log.error(jdomEx);
            throw new IllegalStateException(jdomEx);
        }

    }

}

