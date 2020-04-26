package controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import play.api.data.Form;
import play.mvc.Result;
import views.html.index;

import models.Individual;

public class IndividualController extends Application
{
    ArrayList<Individual> list;

    public IndividualController()
    {
        list = new ArrayList<>();
        list.add(new Individual(0, "Herman", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1850, 0, 1) ));
        list.add(new Individual(1, "Lily", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1845, 9, 31) ));
        list.add(new Individual(2, "Marilyn", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1950, 5, 27) ));
        list.add(new Individual(3, "Eddie", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1956, 6, 19) ));
        list.add(new Individual(4, "Grandpa", "Munster", "1313 Mockingbird Lane.", "Mockingbird Heights", "CA", "90210", constructBirthdate(1666, 1, 14) ));
        list.add(new Individual(5, "Jeannie", "Nelson", "1020 Palm Drive", "Cocoa Beach", "FL", "32931", constructBirthdate(-827, 8, 13)));
        list.add(new Individual(6, "Anthony", "Nelson", "1020 Palm Drive", "Cocoa Beach", "FL", "32931", constructBirthdate(1931, 8, 21)));
        list.add(new Individual(7, "Roger", "Healey", "7040 Brighe Ave", "Cocoa Beach", "FL", "32927", constructBirthdate(1931, 8, 21)));
        list.add(new Individual(8, "Fred", "Sanford", "9114 South Central Avenue", "Los Angeles", "CA", "90002", constructBirthdate(1907, 0, 20)));
        list.add(new Individual(9, "Lamont", "Sanford", "9114 South Central Avenue", "Los Angeles", "CA", "90002", constructBirthdate(1931, 8, 27)));
        list.add(new Individual(10, "Grady", "Wilson", "9001 Hooper Avenue", "Los Angeles", "CA", "90002", constructBirthdate(1910, 8, 21)));
        list.add(new Individual(11, "Jerry", "Seinfield", "129 West 81st St. Apt 5A", "New York", "NY", "10024", constructBirthdate(1954, 3, 29)));
        list.add(new Individual(12, "Kosmo", "Kramer", "129 West 81st St. Apt 5B", "New York", "NY", "10024", constructBirthdate(1949, 6, 29)));
        list.add(new Individual(13, "George", "Costanza", "1344 Queens Blvd.", "New York", "NY", "11101", constructBirthdate(1959, 8, 23)));
    }

    public Result getAll() {
        return ok(views.html.individual.render(list));
    }

    public Result getIndividual(String id) {
        int index = (int) Integer.parseInt(id);
        return ok(views.html.individualDetail.render(list.get(index)));
    }

    private Date constructBirthdate(int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        return calendar.getTime();
    }
}