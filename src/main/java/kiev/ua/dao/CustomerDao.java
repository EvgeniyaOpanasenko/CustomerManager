package kiev.ua.dao;

import kiev.ua.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerDao extends CrudRepository<Customer, Long>{
}
