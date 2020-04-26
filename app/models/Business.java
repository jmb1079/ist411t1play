package models;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Business {
    public int id;
    public String name;
    public String address;
    public String city;
    public String state;
    public int zipCode;

    public Business() {

    }

    public Business(String name, String address, String city, String state, int zipCode) {
        this.id = 0;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString()
    {
        return "toString here";
    }

    public static BusinessList getBusinesses()
    {
        BusinessList list = new BusinessList();
        final Business business1 = new Business("Gateman, Goodbury, and Graves Funeral Home", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", 90210);
        final Business business2 = new Business("Cape Canaveral AFS", "180 W Skid Strip Rd", "Cape Canaveral", "FL", 32920);
        final Business business3 = new Business("Sanford & Son Salvage", "9114 South Central Avenue", "Los Angeles", "CA", 90002);
        final Business business4 = new Business("The Show About Nothing, NBC Studios", "30 Rockefeller Plaza", "New York", "NY", 10112);
        list.addBusiness(business1);
        list.addBusiness(business2);
        list.addBusiness(business3);
        list.addBusiness(business4);
        return list;
    }
}
