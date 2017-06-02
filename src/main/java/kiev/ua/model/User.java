package kiev.ua.model;

import kiev.ua.enums.RoleList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User extends ApplicationClient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public User() {

        this.setRole(RoleList.ROLE_ADMIN);
    }

    public User(String name, String phone, Address address, RoleList role) {
        super(name, phone, address, role);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
