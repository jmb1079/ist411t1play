package controllers;

import models.Business;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
    public static Result index() {
        return ok();
    }

    public static Result getBusiness(int index) {
        return ok();
    }

    public static Result updateBusiness(int index) {
        return ok();
    }

    public static Result deleteBusiness(int index) {
        return ok();
    }

    public Result createBusiness() {
//        Business business = Form.form(Business.class).bindFromRequest().get();
//        business.save();
//        return redirect(routes.Application.index());

        return ok();
    }

    public Result getAll() {
        return ok();
    }
}
