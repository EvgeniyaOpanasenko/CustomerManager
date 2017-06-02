package kiev.ua.model;
import kiev.ua.enums.RoleList;

public class ApplicationClient {

    private String name;
    private String phone;
    private Address address;

    private RoleList role;

    public ApplicationClient() {
    }

    public ApplicationClient(String name, String phone, Address address, RoleList role) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public RoleList getRole() {
        return role;
    }

    public void setRole(RoleList role) {
        this.role = role;
    }

}
