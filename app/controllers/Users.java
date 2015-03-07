/**
 * 
 */
package controllers;

import models.User;
import play.*;
import play.data.*;
import play.data.validation.ValidationError;
import static play.data.Form.*;
import play.mvc.*;

import views.html.users.*;

/**
 * @author zigama
 *
 */
public class Users extends Controller {
	
	public static Result GO_HOME = redirect(
	        routes.Users.list(0, "email", "asc", "")
	    );	
	
    /**
     * Display the paginated list of users.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on user names
     */
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render("",
                User.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    
    /**
     * Display the 'edit form' of a existing User.
     *
     * @param id Id of the user to edit
     */
    public static Result edit(Long id) {
        Form<User> userForm = form(User.class).fill(
            User.find.byId(id)
        );
        return ok(
            editForm.render( "", id, userForm)
        );
    }
    
    /**
     * Handle the 'edit form' submission 
     *
     * @param id Id of the user to edit
     */
    public static Result update(Long id) {
        Form<User> userForm = form(User.class).bindFromRequest();
        
        //System.out.println(userForm.get().dob.toString());
        // Check repeated password
        if(!userForm.field("password").valueOr("").isEmpty()) {
            if(!userForm.field("password").valueOr("").equals(userForm.field("repeatPassword").value())) {
                userForm.reject("repeatPassword", "Password don't match");
            }
        }
        if(userForm.hasErrors()) { 
            return badRequest(editForm.render("",id, userForm));
        }
        userForm.get().update(id);
        flash("success", "User " + userForm.get().email + " has been updated");
        return GO_HOME;
    }
    
    /**
     * Display the 'new user form'.
     */
    public static Result create() {
        Form<User> userForm = form(User.class);
        return ok(
            createForm.render("", userForm)
        );
    }
    
    /**
     * Handle the 'new user form' submission 
     */
    public static Result save() {
        Form<User> userForm = form(User.class).bindFromRequest();
        
     // Check repeated password
        if(!userForm.field("password").valueOr("").isEmpty()) {
            if(!userForm.field("password").valueOr("").equals(userForm.field("repeatPassword").value())) {
                userForm.reject("repeatPassword", "Password don't match");
            }
        }
        if(userForm.hasErrors()) {
            return badRequest(createForm.render("", userForm));
        }
        
        userForm.get().save();
        flash("success", "User " + userForm.get().email + " has been created");
        return GO_HOME;
    }
    
    /**
     * Handle user deletion
     */
    public static Result delete(Long id) {
        User.find.ref(id).delete();
        flash("success", "User has been deleted");
        return GO_HOME;
    }
	
	

}
