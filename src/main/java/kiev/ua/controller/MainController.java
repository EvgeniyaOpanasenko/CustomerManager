package kiev.ua.controller;

import kiev.ua.model.Customer;
import java.util.List;

public interface MainController {
    List<Customer> getAllCustomers();

    boolean createCustomer(Customer customer);

    Customer getCustomerById();

    Customer getCustomerByName();

}
