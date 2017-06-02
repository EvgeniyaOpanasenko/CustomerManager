package kiev.ua.service;

import kiev.ua.dao.CustomerDao;
import kiev.ua.exceptions.InvalidInputException;
import kiev.ua.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Transactional
public class MainServiceImpl implements MainService {

    @Autowired
    CustomerDao dao;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>((Collection<? extends Customer>) dao.findAll());
        return customers;
    }

    @Override
    public boolean createCustomer(Customer customer) throws InvalidInputException {
        dao.save(customer);
        return true;
    }

    @Override
    public Customer getCustomerById(final Long id) throws InvalidInputException {
        List<Customer> customers = getAllCustomers();
        Customer result = customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
        return result;
    }

    @Override
    public Customer getCustomerByName(String name) throws InvalidInputException {
        List<Customer> customers = getAllCustomers();
        Customer result = customers.stream().filter(c -> c.getId().equals(name)).findFirst().get();
        return result;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws InvalidInputException {
        return false;
    }
}
