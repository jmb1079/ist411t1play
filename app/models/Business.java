package models;

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
}
