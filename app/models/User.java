/**
 * 
 */
package models;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import models.MalariaEnum.Gender;

import play.data.validation.Constraints.Required;
import play.data.validation.Constraints.Email;
import play.data.validation.Validation;
import play.data.format.Formats.DateTime;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.Page;

/**
 * @author zigama
 *
 */

/**
 * User entity managed by Ebean
 */

@Entity
@Table(name="user")
@SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
public class User extends Model{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	public Long id;
	
	@Column(unique=true)
	@Required
	@Email
    public String email;
	
	@Required
    public String password;
	
	@Required
	public String telephone;
	
	@Required
    public String fullname;
	
	@DateTime(pattern = "yyyy-MM-dd")
	public Date dob;
	
	@Required
	@Enumerated(EnumType.STRING)
	public Gender gender;
	
	
	@ManyToOne
	@Column(name="user_group")
    public UserGroup userGroup;
	
	public User() {
	}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
	}
    
    public static Finder<Long, User> find = new Finder(Long.class, User.class);
    
    public static User authenticate(String email, String password) {
    	return find.where()
                .eq("email", email)
                .eq("password", password)
                .findUnique();
    }
    
	@Override
	public String toString() {
		if (this != null)
			return this.email;
		return "";
	}

	public static List<User> all() {
		return new ArrayList<User>();
	}

	public static void create(User user) {
		user.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
    public static Page<User> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("email", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("userGroup")
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }

}