package controllers;

import models.Business;
import models.BusinessList;
import play.api.data.Form;
import play.mvc.Result;
import views.html.index;


public class BusinessController extends Application {

    BusinessList list;

    public BusinessController() {
        list = Business.getBusinesses();        
    }

    public static Result index() {
        return ok(index.render());
    }

    public Result createBusiness(final String name, final String address, final String city, final String state,
            final String zipCode) {
        final Business business = new Business(name, address, city, state, Integer.parseInt(zipCode));
        list.addBusiness(business);
        return ok();
    }

    public Result getAll() {
        return ok(views.html.business.render(list.getAll()));
    }

    public Result getBusiness(final String num) {
        final int index = (int) Integer.parseInt(num);
        return ok(views.html.businessDetail.render(list.getDetail(index)));
    }

    public Result updateBusiness(final String num, final String name, final String address, final String city,
            final String state, final String zipCode) {
        list.updateBusiness(Integer.parseInt(num), name, address, city, state, Integer.parseInt(zipCode));
        return ok();
    }

    public Result deleteBusiness(final String num) {
        list.deleteBusiness(Integer.parseInt(num));
        return ok();
    }
}
