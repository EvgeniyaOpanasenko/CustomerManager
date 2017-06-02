package kiev.ua.dao;

import kiev.ua.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Customer, Long>{
}
