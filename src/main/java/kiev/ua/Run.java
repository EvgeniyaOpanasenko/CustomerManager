package kiev.ua;

import kiev.ua.enums.CityList;
import kiev.ua.enums.CountryList;
import kiev.ua.enums.StreetList;
import kiev.ua.model.Address;
import kiev.ua.model.Customer;


public class Run {

    public static void main(String[] args) {
        Customer customer = new Customer("Eva", "phone", new Address(CountryList.UKRAINE,
                CityList.KIEV, StreetList.GMIRY_6));

    }
}
