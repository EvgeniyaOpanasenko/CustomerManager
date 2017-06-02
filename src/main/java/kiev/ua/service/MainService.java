package kiev.ua.service;

import kiev.ua.exceptions.InvalidInputException;
import kiev.ua.model.Customer;

import java.util.List;

public interface MainService {
    List<Customer> getAllCustomers();

    boolean createCustomer(Customer customer) throws InvalidInputException;

    Customer getCustomerById(Long id)throws InvalidInputException;

    Customer getCustomerByName(String name)throws InvalidInputException;

    boolean updateCustomer(Customer customer) throws InvalidInputException;

}
