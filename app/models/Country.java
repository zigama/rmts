/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

/**
 * @author zigama
 *
 */

@Entity 
@Table(name = "country")
@SequenceGenerator(name = "country_seq", sequenceName = "country_seq")
public class Country extends Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_seq")
	public Long id;
	
	@Column(unique=true)
	@Constraints.Required
    public String name;
	
	@Column(unique=true)
	@Constraints.Required
    public String code;
	
	public String nationality;
    
    @OneToMany(mappedBy = "country")
    public List<Province> provinces = new ArrayList<Province>();
    
    
    @OneToMany(mappedBy = "country")
    public List<District> disticts = new ArrayList<District>();
    
    
    @OneToMany(mappedBy = "country")
    public List<Sector> sectors = new ArrayList<Sector>();
    
    
    @OneToMany(mappedBy = "country")
    public List<Facility> facilities = new ArrayList<Facility>();
    
    
    @OneToMany(mappedBy = "country")
    public List<Cell> cells = new ArrayList<Cell>();
    
    
    @OneToMany(mappedBy = "country")
    public List<Village> villages = new ArrayList<Village>();
    
    
    public Country(){}
    
    public static Finder<Long, Country> find = new Finder(Long.class, Country.class);
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Country c: Country.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
            //System.out.println(c.groupID.toString()+","+ c.title);
        }
        return options;
    }
    
	
	
    

}
