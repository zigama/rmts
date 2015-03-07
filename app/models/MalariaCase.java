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

import models.MalariaEnum.BloodTransfusion;
import models.MalariaEnum.InPatient;
import models.MalariaEnum.OftenWorkAway;
import models.MalariaEnum.Pregnant;
import models.MalariaEnum.Prevention;
import models.MalariaEnum.Referred;
import models.MalariaEnum.Sleep;
import models.MalariaEnum.Travel;

import play.data.format.Formats.DateTime;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.Page;

/**
 * @author zigama
 *
 */

@Entity 
@Table(name = "malaria_case")
@SequenceGenerator(name = "malaria_case_seq", sequenceName = "malaria_case_seq")
public class MalariaCase extends Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "malaria_case_seq")
	public Long id;
	
	@Required
	public String caseNo;
	
	@Required
	public String caseSysRefNo;
	

	// Where and when the case was registered from
	
	@ManyToOne
	@Column(name="district")
    public District district;
	
	@ManyToOne
	@Column(name="hospital")
    public Facility hospital;
	
	@ManyToOne
	@Column(name="facility")
    public Facility facility;
	
	@DateTime(pattern = "yyyy-MM-dd")
	public Date date;
	
	@Required
	@Enumerated(EnumType.STRING)
	public InPatient inPatient;
		
	@Required
	public Referred referred;
	
	@ManyToOne
	@Column(name="referred_to")
    public Facility referredTo;
	
	// Patient Details
	@ManyToOne
	@Column(name="patient")
    public Patient patient;
	
	@Required
	@Enumerated(EnumType.STRING)
	public Pregnant isPregnant;
	
	@Required
	public String headOfHousehold;
	
	@Required
	public String occupation;
	
	public BloodTransfusion blood_transfusion;
	
	@DateTime(pattern = "yyyy-MM-dd")
	public Date transfusionDate;
	
	public OftenWorkAway oftenWorkAway;
	
	@Required
	@DateTime(pattern = "yyyy-MM-dd")
	public Date dateOnsetIllness;
	
	public Sleep sleptHomeBefore;
	public Sleep sleptWorkBefore;
	
	public Travel within14Days;
	public Location withinTravel;
	public Travel outside14Days;
	public Location outsideTravel;
	
	@DateTime(pattern = "yyyy-MM-dd")
	public Date dateBackHome;
	
	public Prevention preventionBeforeTravel;
	
	public Travel next42Days;
	public Location next42DaysTravel;
	
	public PatientResult result;
	public boolean vivax_species;
	public boolean falciparum_species;
	public boolean malariae_species;
	public boolean ovale_species;
	
	public Location infectionLocation;
	
	public Date completed_date;
	public User completed_by;
	public Date verified_date;
	public User verified_by;


	
	public MalariaCase(){}

}
