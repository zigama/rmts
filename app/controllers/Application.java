package controllers;

import models.User;
import controllers.Secured;
import play.mvc.Result;
import play.data.Form;
import static play.data.Form.form;
import play.mvc.Controller;
import play.mvc.Security;

import views.html.*;

public class Application extends Controller {

	static Form<User> loginUserForm = Form.form(User.class);

	public static class Login {

		public String email;
		public String password;

		public String validate() {
			if (User.authenticate(email, password) == null) {
				return "Invalid user or password";
			}
			return null;
		}

	}

	@Security.Authenticated(Secured.class)
	public static Result index() {
		return ok(index.render());

	}
    
    /**
	 * Login page.
	 */
	public static Result login() {
		return ok( login.render(form(Login.class)));
	}
	/**
	 * Handle login form submission.
	 */
	@SuppressWarnings("deprecation")
	public static Result authenticate() {
		final Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			session("email", loginForm.get().email);
			session("password", loginForm.get().password);
			
			return ok(
					index.render());

		}
	}
	
	public static Result logout() {
		session().clear();
		flash("success", "You've been logged out");
		return redirect(routes.Application.login());
	}
}
