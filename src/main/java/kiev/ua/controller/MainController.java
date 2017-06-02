package kiev.ua.controller;

import kiev.ua.model.Customer;
import kiev.ua.model.Field;

import java.util.List;

public interface MainController {
    List<Customer> getAllCustomers();

    boolean createCustomer(Customer customer);

    Customer getCustomerById();

    Customer getCustomerByName();

    boolean updateCustomer(Field field);

}
