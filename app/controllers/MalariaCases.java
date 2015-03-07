/**
 * 
 */
package controllers;

/**
 * @author zigama
 *
 */

import models.MalariaCase;
import models.MalariaCase;
import models.User;
import controllers.Secured;
import play.mvc.Result;
import play.data.Form;
import static play.data.Form.form;
import play.mvc.Controller;
import play.mvc.Security;

import views.html.malariaforms.createMalariaCase;
import views.html.users.list;

public class MalariaCases extends Controller{
	
	public static Result GO_HOME = redirect(
	        routes.MalariaCases.list(0, "email", "asc", "")
	    );
	
	
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render("",
                User.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
	
    public static Result create() {
        Form<MalariaCase> caseForm = form(MalariaCase.class);
        return ok(
            createMalariaCase.render("", caseForm)
        );
    }
    
    /**
     * Handle the 'new case form' submission 
     */
    public static Result save() {
        Form<MalariaCase> caseForm = form(MalariaCase.class).bindFromRequest();
        
     // Check repeated password
        if(!caseForm.field("password").valueOr("").isEmpty()) {
            if(!caseForm.field("password").valueOr("").equals(caseForm.field("repeatPassword").value())) {
                caseForm.reject("repeatPassword", "Password don't match");
            }
        }
        if(caseForm.hasErrors()) {
            return badRequest(createMalariaCase.render("", caseForm));
        }
        
        caseForm.get().save();
        flash("success", "MalariaCase " + caseForm.get().patient.firstName +  caseForm.get().patient.surname + " has been created");
        return GO_HOME;
    }

}
