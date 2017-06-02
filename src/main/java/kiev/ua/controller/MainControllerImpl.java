package kiev.ua.controller;

import kiev.ua.model.Customer;
import kiev.ua.model.Field;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MainControllerImpl implements MainController {


    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public boolean createCustomer(Customer customer) {
        return false;
    }

    @Override
    public Customer getCustomerById() {
        return null;
    }

    @Override
    public Customer getCustomerByName() {
        return null;
    }

    @Override
    public boolean updateCustomer(Field field) {
        return false;
    }
}
