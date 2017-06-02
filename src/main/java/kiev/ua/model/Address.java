package kiev.ua.model;

import kiev.ua.enums.CityList;
import kiev.ua.enums.CountryList;
import kiev.ua.enums.StreetList;

import javax.persistence.Entity;

public class Address {

    private CountryList country;
    private CityList city;
    private StreetList street;

    public Address(CountryList country, CityList city, StreetList street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public CountryList getCountry() {
        return country;
    }

    public void setCountry(CountryList country) {
        this.country = country;
    }

    public CityList getCity() {
        return city;
    }

    public void setCity(CityList city) {
        this.city = city;
    }

    public StreetList getStreet() {
        return street;
    }

    public void setStreet(StreetList street) {
        this.street = street;
    }
}
