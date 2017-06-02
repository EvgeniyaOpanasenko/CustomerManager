package kiev.ua.model;
import kiev.ua.enums.RoleList;

public class ApplicationClient extends Field {

    private RoleList role;

    public ApplicationClient() {
    }

    public ApplicationClient(String name, String phone, Address address) {
        super(name, phone, address);
    }

    public RoleList getRole() {
        return role;
    }

    public void setRole(RoleList role) {
        this.role = role;
    }

}
