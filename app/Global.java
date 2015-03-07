
import play.*;
import play.libs.*;

import com.avaje.ebean.Ebean;

import models.*;

import java.io.IOException;
import java.util.*;

import javax.persistence.PersistenceException;

public class Global  extends GlobalSettings {
    
    public void onStart(Application app) {
        InitialData.insert(app);
    }
        
    static class InitialData {
        
        public static void insert(Application app) {
            if(Ebean.find(User.class).findRowCount() == 0) {
                @SuppressWarnings("unchecked")
								Map<String,List<Object>> all = (Map<String,List<Object>>)Yaml.load("initial-data.yml");
                // Insert users first
                Ebean.save(all.get("users"));
                
            }
        if (Ebean.find(Country.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert countries first
				ArrayList<Country> allcountries = RawCountry.list();
        		for (Object o: RawCountry.list()){
        			Country c = (Country)o ;
        			System.out.println( c.name + ", " + c.code);
        		}
        	
        	Ebean.save(allcountries);
        }
        if (Ebean.find(Province.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert provinces first
				ArrayList<Province> allprovinces = RawProvince.list();
        		for (Object o: RawProvince.list()){
        			Province c = (Province)o ;
        			//if (c.name.toUpperCase().trim() == "TEST") allprovinces.remove(o); 
        			c.country = Ebean.find(Country.class).where().ilike("lower(name)", "%" + "RWANDA" + "%").findUnique();
        			System.out.println( c.name + ", " + c.code + ", "+ "(" + c.country.name + ", " + c.country.code + ")");
        		}
        	
        	Ebean.save(allprovinces);
        }
        if (Ebean.find(District.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert provinces first
				ArrayList<District> allprovinces = RawDistrict.list();
        		for (Object o: RawDistrict.list()){
        			District c = (District)o ;
        			//System.out.println( c.name + ", " + c.code);
        		}
        	
        	//Ebean.save(allprovinces);
        }
        
        if (Ebean.find(Sector.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert provinces first
				ArrayList<Sector> allprovinces = RawSector.list();
        		for (Object o: RawSector.list()){
        			Sector c = (Sector)o ;
        			//System.out.println( c.name + ", " + c.code);
        		}
        	
        	//Ebean.save(allprovinces);
        }
        
        if (Ebean.find(Cell.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert provinces first
				ArrayList<Cell> allprovinces = RawCell.list();
        		for (Object o: RawCell.list()){
        			Cell c = (Cell)o ;
        			//System.out.println( c.name + ", " + c.code);
        		}
        	
        	//Ebean.save(allprovinces);
        }
        
        if (Ebean.find(Village.class).findRowCount() == 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert provinces first
				ArrayList<Village> allprovinces = RawVillage.list();
        		for (Object o: RawVillage.list()){
        			Village c = (Village)o ;
        			//System.out.println( c.name + ", " + c.code);
        		}
        	
        	//Ebean.save(allprovinces);
        }
        
        /*
        if (Ebean.find(Country.class).findRowCount() != 0){
        	
        	@SuppressWarnings("unchecked")
			
				// Insert countries first
				List allnationalities = RawNationality.list();
        		List wrong = new ArrayList<String>();
        		for (Object o: RawNationality.list()){
        			String c = o.toString() ;
        			
        			
        			try { 
        				Country ct = Ebean.find(Country.class).where().ilike("lower(name)",c.subSequence(0, 4).toString().toLowerCase() + "%").findUnique();
        				System.out.println( c + "," + ct.name + "," + ct.code);
        				ct.nationality = c;
        				ct.save();
	        		} catch (NullPointerException e) {
	        			System.out.println( "Null: " + c );
	        			wrong.add(c);
	                
        		} catch (PersistenceException e) {
        			
        			System.out.println( "Null: " + c );
	        			wrong.add(c);
                
        		}
        		}
        	System.out.println("Wrong:" + wrong.size());	
        	//Ebean.save(allnationalities);
        }*/
            
        }
        
    }
    
}
