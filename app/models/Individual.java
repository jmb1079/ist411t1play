package models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Individual {
    public int id;
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipCode;
    public Date birthDate;

    public Individual(int id, String firstName, String lastName, String address, String city, String state,
            String zipCode, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
    }
}