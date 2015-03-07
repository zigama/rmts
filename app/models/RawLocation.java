/**
 * 
 */
package models;

import com.avaje.ebean.Ebean;

/**
 * @author zigama
 *
 */
public class RawLocation {
	
	public Location processLocation(String code){
		
		Location location = new Location();
		// if the code is not numeric then according Rwanda ISO then it is a country code, look for the country
		if (isNumeric(code)){
			
			//village
			if (code.length() == 10 && code.startsWith("0")){
				
				//Village village = Ebean.find(Village.class).where().ilike("code","%" + code + "%").findUnique();
				location.type = MalariaEnum.LocationType.Village;
				//location.name = village.name;
				location.code = code;
			}
			else if (code.length() == 8 && code.startsWith("0")){
				
				//Cell cell = Ebean.find(Cell.class).where().ilike("code","%" + code + "%").findUnique();
				location.type = MalariaEnum.LocationType.Cell;
				//location.name = cell.name;
				location.code = code;
			}
			else if (code.length() == 6 && code.startsWith("0")){
				
				//Sector sector = Ebean.find(Sector.class).where().ilike("code","%" + code + "%").findUnique();
				location.type = MalariaEnum.LocationType.Sector;
				//location.name = sector.name;
				location.code = code;
			}
			else if (code.length() == 4 && code.startsWith("0")){
				
				//District district = Ebean.find(District.class).where().ilike("code","%" + code + "%").findUnique();
				location.type = MalariaEnum.LocationType.District;
				//location.name = district.name;
				location.code = code;
			}
			else if (code.length() == 2 && code.startsWith("0")){
				
				//Province province = Ebean.find(Province.class).where().ilike("code","%" + code + "%").findUnique();
				location.type = MalariaEnum.LocationType.Province;
				//location.name = province.name;
				location.code = code;
			}
			else {}
			
			
		} else{
			
			//Country country = Ebean.find(Country.class).where().ilike("code","%" + code + "%").findUnique();
			location.type = MalariaEnum.LocationType.Country;
			//location.name = country.name;
			location.code = code;
			
		}
		
		return location;
		
	}
	
	public Object locationObject(String code){
		
		Object location = new Object();
		
		try {
			
			
		}catch (NullPointerException e){
			return null;
		}
		
		return location;
	}
	
	public Country fetchCountry(String code){
		
		try {
			Country country = Ebean.find(Country.class).where().eq("code",code).findUnique();
			return country;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public Province fetchProvince(String code){
		
		try {
			Province province = Ebean.find(Province.class).where().eq("code", code).findUnique();
			return province;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public District fetchDistrict(String code){
		
		try {
			District district = Ebean.find(District.class).where().eq("code", code).findUnique();
			return district;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public Sector fetchSector(String code){
		
		try {
			Sector sector = Ebean.find(Sector.class).where().eq("code", code).findUnique();
			return sector;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public Cell fetchCell(String code){
		
		try {
			Cell cell = Ebean.find(Cell.class).where().eq("code", code).findUnique();
			return cell;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public Village fetchVillage(String code){
		
		try {
			Village village = Ebean.find(Village.class).where().eq("code", code).findUnique();
			return village;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public Facility fetchFacility(String code){
		
		try {
			Facility facility = Ebean.find(Facility.class).where().eq("code", code).findUnique();
			return facility;
			
		}catch (NullPointerException e) {
			
			return null;
		}
		
	}
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

}
