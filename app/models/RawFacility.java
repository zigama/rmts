/**
 * 
 */
package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author zigama
 *
 */
public class RawFacility {
	
public static ArrayList<Facility> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<Facility> allfacilities = new ArrayList<Facility>();
        
        JSONParser parser = new JSONParser();
        Facility facility;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/facilities.json"));
            	
		  for (Object o : a)
		  {
			// Because my dump from django is also complex objects
			  //we need to get fields and leave pk and model from django dump 
			JSONObject ob =   (JSONObject) o;
		    JSONObject jsonFacility = (JSONObject) ob.get("fields");
		    
		  //Initialize a facility with attributes
		    facility = new Facility();           

		    facility.name = (String) jsonFacility.get("name");
		    facility.code = (String) jsonFacility.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        allfacilities.add(facility);
	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allfacilities;
        
	}


}
