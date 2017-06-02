package kiev.ua;

import kiev.ua.enums.CityList;
import kiev.ua.enums.CountryList;
import kiev.ua.enums.StreetList;
import kiev.ua.model.Address;
import kiev.ua.model.Customer;
import kiev.ua.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

@EnableAutoConfiguration(exclude=ErrorMvcAutoConfiguration.class)
@ComponentScan("com.ua")
public class Application {
    public static void main(String[] args) {
        Customer customer = new Customer("Eva", "phone", new Address(
                CountryList.UKRAINE, CityList.KIEV, StreetList.AVRAMOVA_4));

        User user = new User("Kolya", "phone", new Address(
                CountryList.UKRAINE, CityList.KIEV, StreetList.AVRAMOVA_4));


        SpringApplication.run(Application.class);
    }
}
