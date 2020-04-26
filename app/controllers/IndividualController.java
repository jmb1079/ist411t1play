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
        list = Individual.GetIndividuals();
    }

    public Result getAll() {
        return ok(views.html.individual.render(list));
    }

    public Result getIndividual(final String id) {
        final int index = (int) Integer.parseInt(id);
        return ok(views.html.individualDetail.render(list.get(index)));
    }
}