/**
 * 
 */
package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import org.joda.time.DateTime;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


/**
 * @author zigama
 *
 */
/**
 * Group entity managed by JPA
 */

@Entity 
@Table(name = "user_group")
@SequenceGenerator(name = "user_group_seq", sequenceName = "user_group_seq")
public class UserGroup extends Model{
	

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_group_seq")
    public Long id;
    
    @Constraints.Required
    @Column(unique=true)
    public String title;
    
    @Constraints.Required
    @Column(unique=true)
    public String shortTitle;
    
    @OneToMany(mappedBy = "userGroup")
    public List<User> users = new ArrayList<User>();
    
    @ManyToOne
    @JoinColumn(name = "supergroup")
    public UserGroup superGroup;
    
    @OneToMany(mappedBy = "superGroup")
	public List<UserGroup> subgroups = new ArrayList<UserGroup>();
    
    public DateTime createdAt;
    public DateTime updatedAt;
    
    @ManyToOne
    @JoinColumn(name="created_by")
    public User createdBy;
    
    @ManyToOne
    @JoinColumn(name="update_by")
    public User updatedBy;
    
    public UserGroup(String title, String shorttile) {
        this.title = title;
        this.shortTitle = shorttile;
	}
    
    public UserGroup(String title, String shorttile, UserGroup supergroup, User createdBy) {
		this.title = title;
		this.shortTitle = shorttile;
		this.superGroup = supergroup;
		this.createdAt = new DateTime();
		this.updatedAt = this.createdAt;
		this.createdBy = createdBy;
		this.updatedBy = this.createdBy;
		
	}
    
    public static Finder<Long, UserGroup> find = new Finder(Long.class, UserGroup.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(UserGroup c: UserGroup.find.orderBy("title").findList()) {
            options.put(c.id.toString(), c.title);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }
    
	@Override
	public String toString() {
		if (this != null)
			return this.title;
		return "";
	}

	public static List<UserGroup> all() {
		return new ArrayList<UserGroup>();
	}

	public static void create(UserGroup group) {
		group.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

}
