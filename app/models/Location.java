/**
 * 
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import models.MalariaEnum.LocationType;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

/**
 * @author zigama
 *
 */

@Entity 
@Table(name = "location")
@SequenceGenerator(name = "location_seq", sequenceName = "location_seq")
public class Location  extends Model{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_seq")
	public Long id;
	
	@Column(unique=true)
	@Required
    public String name;
	
	@Column(unique=true)
	@Required
    public String code;
	
	@Required
	@Enumerated(EnumType.STRING)
	public LocationType type;
	
	public double latitude;
	public double longitude;

}
