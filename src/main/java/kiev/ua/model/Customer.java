package kiev.ua.model;

import kiev.ua.enums.RoleList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends ApplicationClient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*public Customer() {

        this.setRole(RoleList.ROLE_USER);
    }*/

    public Customer(String name, String phone, Address address) {
        super(name, phone, address);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
