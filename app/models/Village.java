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
@Table(name = "village")
@SequenceGenerator(name = "village_seq", sequenceName = "village_seq")
public class Village {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "village_seq")
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
	
	@ManyToOne
	@Column(name="district")
    public District district;
	
	@ManyToOne
	@Column(name="sector")
    public Sector sector;
	
	@ManyToOne
	@Column(name="cell")
    public Cell cell;
	
	public Village(){}
	
    public static Finder<Long, Village> find = new Finder(Long.class, Village.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Village c: Village.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }

}
