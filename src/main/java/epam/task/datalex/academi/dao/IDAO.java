package epam.task.datalex.academi.dao;


import epam.task.datalex.academi.bean.Customer;
import epam.task.datalex.academi.bean.FareFamily;
import epam.task.datalex.academi.bean.Reservation;

public interface IDAO {
    Reservation getReservation(String nameFile);
    Customer getCustomer(String nameFile);
    FareFamily getFareFamily(String nameFile);
}
