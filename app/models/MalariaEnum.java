/**
 * 
 */
package models;

/**
 * @author zigama
 *
 */
public class MalariaEnum {
	
	public enum Prevention{
		Prophylaxis,
		LLINs,
		Mosquito_Repellents
		
	}
	
	public enum Travel {		
		YES,
		NO
	}
	
	public enum Sleep {
		Days_0_7,
		Days_8_14,
		Days_15_21,
		Days_21_42,
		Days_42_above,
				
	}
	
	public enum LocationType{
		Country,
		Province,
		District,
		Sector,
		Cell,
		Village,
		Hospital,
		HealthCenter	
		
	}
	
	public enum Gender{
		MALE,
		FEMALE
	}
	
	public enum Pregnant{
		YES,
		NO		
	}
	
	public enum OftenWorkAway{
		DAILY,
		WEEKLY,
		MONTHLY,
		ANNUALLY
	}
	
	public enum InPatient{
		InPatient,
		OutPatient		
	}
	
	public enum Referred{
		YES,
		NO		
	}
	
	
	public enum FacilityType {
		
		// These are various Facility type ... but we are only going to deal with Health Center and Hospital //
		
		
		/* "National Referral Hospital (HNR)",
		"Provincial Referral Hospital (PH)",
		"District Hospital (HD)",
		"Health Center (CS)",
		"Health Post (PS)",
		"Dispensary (DISP)",
		"Community Dispensary (FOSACOM)",
		"Prison Clinic (PRIS)",
		"Medical Clinic (CLIN)",
		"Military Hospital (HM)",
		"District Pharmacy (DP)",
		"Mutuelle/CBHI section (MU)",
		"Blood Bank (BB)",
		"Other, Specify : .",
		
		*/
		
		Hospital,
		HealthCenter	
		
	}
	

	public enum BloodTransfusion{
		YES,
		NO
	}
}
