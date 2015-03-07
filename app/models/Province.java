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

import com.avaje.ebean.Page;

/**
 * @author zigama
 *
 */

@Entity 
@Table(name = "province")
@SequenceGenerator(name = "province_seq", sequenceName = "province_seq")
public class Province extends Model {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "province_seq")
	public Long id;
	
	@Column(unique=true)
	@Constraints.Required
    public String name;
	
	@Column(unique=true)
	@Constraints.Required
    public String code;
	
	@ManyToOne
    public Country country;
	
	public Province() {
		// TODO Auto-generated constructor stub
	}
	
    public static Finder<Long, Province> find = new Finder(Long.class, Province.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Province c: Province.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }

}
