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

import models.MalariaEnum.FacilityType;
import models.MalariaEnum.Gender;

import org.joda.time.DateTime;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.Page;

@Entity 
@Table(name = "facility")
@SequenceGenerator(name = "facility_seq", sequenceName = "facility_seq")
public class Facility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facility_seq")
	public Long id;
	
	@Column(unique=true)
	@Constraints.Required
    public String name;
	
	@Column(unique=true)
	@Constraints.Required
    public String code;
	
	@Required
	@Enumerated(EnumType.STRING)
	public FacilityType type;
	
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
	@JoinColumn(name="referral")
    public Facility referral;
	
	public Facility(){}
	
    public static Finder<Long, Facility> find = new Finder(Long.class, Facility.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Facility c: Facility.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }
    

}
