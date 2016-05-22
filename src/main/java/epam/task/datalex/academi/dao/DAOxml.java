package epam.task.datalex.academi.dao;


import epam.task.datalex.academi.bean.*;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DAOxml implements IDAO {
    private static final Logger log = Logger.getLogger(DAOxml.class);
    private final Namespace DOCUMENT_NAMESPACE = Namespace.getNamespace("urn:reservation.rqrs.datalex.com");

    public Reservation getReservation(String nameFile) {
        Reservation reservation = new Reservation();
        Element rootNode = getRootElement(nameFile);
        reservation.setCode(rootNode.getAttributeValue("Code"));
        reservation.setDescription(rootNode.getAttributeValue("Description"));
        @SuppressWarnings("unchecked")
        List<Element> listResComponent = rootNode.getChildren("ResComponent",DOCUMENT_NAMESPACE);
        for (Element elementRes : listResComponent) {
            Reservation.ReservationComponent resComponent = new Reservation.ReservationComponent();
            resComponent.setComponentTypeCode(elementRes.getAttributeValue("ComponentTypeCode"));
            resComponent.setInternalStatus(InternalStatus.valueOf(elementRes.getAttributeValue("InternalStatus")));
            String dateTime = elementRes.getAttributeValue("CreateDateTime");
            resComponent.setCreateDateTime(LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            reservation.getReservationComponents().add(resComponent);
        }
        return reservation;
    }

    public Customer getCustomer(String nameFile) {

        Customer customer = new Customer();
        Element rootNode = getRootElement(nameFile);
        Element currentCustomer = rootNode.getChild("Customer", DOCUMENT_NAMESPACE);
        customer.setFirstName(currentCustomer.getAttributeValue("FirstName"));
        customer.setLastName(currentCustomer.getAttributeValue("LastName"));
        customer.setPhone(currentCustomer.getChild("Phone", DOCUMENT_NAMESPACE).getAttributeValue("PhoneNumber"));
        customer.setEmail(currentCustomer.getChild("Email", DOCUMENT_NAMESPACE).getAttributeValue("EmailAddress"));
        @SuppressWarnings("unchecked")
        List<Element> listPayments = currentCustomer.getChildren("Payment", DOCUMENT_NAMESPACE);
        for (Element currentPayment : listPayments){
            Customer.Payment payment = new Customer.Payment();
            payment.setAmountPaid(new BigDecimal(currentPayment.getAttributeValue("AmountPaid")));
            payment.setCurrencyCode(CurrencyCode.valueOf(currentPayment.getAttributeValue("CurrencyCode")));
            payment.setFormOfPaymentTypeCode(FormOfPaymentTypeCode.
                    valueOf(currentPayment.getAttributeValue("FormOfPaymentTypeCode")));
            customer.getPayments().add(payment);
        }
        return customer;
    }

    public FareFamily getFareFamily(String nameFile) {
        FareFamily fareFamily = new FareFamily();
        Element rootElement = getRootElement(nameFile);
        Element currentFareFamily  = rootElement.getChild("FareFamily", DOCUMENT_NAMESPACE);
        fareFamily.setFareFamilyCode(currentFareFamily.getAttributeValue("FareFamilyCode"));
        @SuppressWarnings("unchecked")
        List<Element> listAncillaryAirComponent = currentFareFamily.getChildren("AncillaryAirComponent",DOCUMENT_NAMESPACE);
        for (Element currentAncillaryAirComponent :listAncillaryAirComponent){
            fareFamily.getAncillaryAirComponentCode().
                    add(currentAncillaryAirComponent.getAttributeValue("AncillaryAirComponentCode"));
        }
        return fareFamily;
    }


    private Element getRootElement(String nameFile) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(nameFile);
        try {
            Document document =  builder.build(xmlFile);
            return document.getRootElement();
        } catch (IOException io) {
            log.error(io);
            throw new IllegalStateException(io);
        } catch (JDOMException jdomEx) {
            log.error(jdomEx);
            throw new IllegalStateException(jdomEx);
        }

    }

}

