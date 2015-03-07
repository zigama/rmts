/**
 * 
 */
package models;


/**
 * @author zigama
 *
 */

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

import com.avaje.ebean.Page;

@Entity 
@Table(name = "district")
@SequenceGenerator(name = "district_seq", sequenceName = "district_seq")
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "district_seq")
	public Long id;
	
	@Column(unique=true)
	@Constraints.Required
    public String name;
	
	@Column(unique=true)
	@Constraints.Required
    public String code;
	
	@ManyToOne
	@Column(name="country")
    public Country country;
	
	@ManyToOne
	@Column(name="province")
    public Province province;
	
	public District(){
		
	}
	
    public static Finder<Long, District> find = new Finder(Long.class, District.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(District c: District.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }
    

}
