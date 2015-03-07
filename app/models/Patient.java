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
import javax.validation.Constraint;

import org.joda.time.DateTime;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.Page;

import models.MalariaEnum.Gender;

/**
 * @author zigama
 *
 */

@Entity 
@Table(name = "patient")
@SequenceGenerator(name = "patient_seq", sequenceName = "patient_seq")
public class Patient extends Model {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq")
	public Long id;
	
	@Constraints.Required
    public String firstName;
	
	@Constraints.Required
    public String surname;
	
	@Column(unique=true)
	@Constraints.Required
    public String national_id;
	
	public String telephone;
	
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date dob;
	
	@Constraints.Required
	@Enumerated(EnumType.STRING)
	public Gender gender;
	

	
	public Patient(){}

}
