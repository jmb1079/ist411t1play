package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

    public Individual(final int id, final String firstName, final String lastName, final String address,
            final String city, final String state, final String zipCode, final Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
    }

    public static ArrayList<Individual> GetIndividuals() {
        ArrayList<Individual> individuals = new ArrayList<Individual>();
        Individual a = new Individual(0, "Herman", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1850, 0, 1));
        individuals.add(a);
        Individual b = new Individual(1, "Lily", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1845, 9, 31));
        individuals.add(b);
        Individual c = new Individual(2, "Marilyn", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1950, 5, 27));
        individuals.add(c);
        Individual d = new Individual(3, "Eddie", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1956, 6, 19));
        individuals.add(d);
        Individual e = new Individual(4, "Grandpa", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1666, 1, 14));
        individuals.add(e);
        Individual f = new Individual(5, "Jeannie", "Nelson", "1020 Palm Drive", "Cocoa Beach", "FL", "32931", constructBirthdate(-827, 8, 13));
        individuals.add(f);
        Individual g = new Individual(6, "Anthony", "Nelson", "1020 Palm Drive", "Cocoa Beach", "FL", "32931", constructBirthdate(1931, 8, 21));
        individuals.add(g);
        Individual h = new Individual(7, "Roger", "Healey", "7040 Brighe Ave", "Cocoa Beach", "FL", "32927", constructBirthdate(1931, 8, 21));
        individuals.add(h);
        Individual i = new Individual(8, "Fred", "Sanford", "9114 South Central Avenue", "Los Angeles", "CA", "90002", constructBirthdate(1907, 0, 20));
        individuals.add(i);
        Individual j = new Individual(9, "Lamont", "Sanford", "9114 South Central Avenue", "Los Angeles", "CA", "90002", constructBirthdate(1931, 8, 27));
        individuals.add(j);
        Individual k = new Individual(10, "Grady", "Wilson", "9001 Hooper Avenue", "Los Angeles", "CA", "90002",constructBirthdate(1910, 8, 21));
        individuals.add(k);
        Individual l = new Individual(11, "Jerry", "Seinfield", "129 West 81st St. Apt 5A", "New York", "NY", "10024",constructBirthdate(1954, 3, 29));
        individuals.add(l);
        Individual m = new Individual(12, "Kosmo", "Kramer", "129 West 81st St. Apt 5B", "New York", "NY", "10024",constructBirthdate(1949, 6, 29));
        individuals.add(m);
        Individual n = new Individual(13, "George", "Costanza", "1344 Queens Blvd.", "New York", "NY", "11101",constructBirthdate(1959, 8, 23));
        individuals.add(n);
        return individuals;
    }

    private static Date constructBirthdate(final int year, final int month, final int day) {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}