package controllers;

import models.Business;
import models.BusinessList;
import play.api.data.Form;
import play.mvc.Result;
import views.html.index;


public class BusinessController extends Application {
    //Form<Business> businessForm = Form.form(Business.class).withDirectFieldAccess(true);
    BusinessList list;

    public BusinessController() {
        list = new BusinessList();
        Business business1 = new Business("Munsters", "1313 Mockingbird Ln.", "Mockingbird Heights", "CA", 90210);
        Business business2 = new Business("Jeannie", "1020 Palm Drive", "Cocoa Beach", "FL", 32931);
        Business business3 = new Business("Sanford & Son", "9114 South Central Avenue", "Los Angeles", "CA", 90002);
        list.addBusiness(business1);
        list.addBusiness(business2);
        list.addBusiness(business3);
    }

    public static Result index() {
        return ok(index.render());
    }

    public Result createBusiness(String name, String address, String city, String state, String zipCode) {
        Business business = new Business(name, address, city, state, Integer.parseInt(zipCode));
        list.addBusiness(business);
        return ok();
    }

    public Result getAll() {
        return ok(views.html.business.render(list.getAll()));
    }

    public Result getBusiness(String num) {
        int index = (int) Integer.parseInt(num);
        return ok(list.getBusiness(index));
    }

    public Result updateBusiness(String num, String name, String address, String city, String state, String zipCode) {
        list.updateBusiness(Integer.parseInt(num), name, address, city, state, Integer.parseInt(zipCode));
        return ok();
    }

    public Result deleteBusiness(String num) {
        list.deleteBusiness(Integer.parseInt(num));
        return ok();
    }
}
