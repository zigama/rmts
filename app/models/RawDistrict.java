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
public class RawDistrict {

public static ArrayList<District> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<District> alldistricts = new ArrayList<District>();
        
        JSONParser parser = new JSONParser();
        District district;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/districts.json"));
            	
		  for (Object o : a)
		  {
			  // Because my dump from django is also complex objects
			  //we need to get fields and leave pk and model from django dump 
			JSONObject ob =   (JSONObject) o;
		    JSONObject jsonDistrict = (JSONObject) ob.get("fields");
		    
		  //Initialize a district with attributes
		    district = new District();           

		    district.name = (String) jsonDistrict.get("name");
		    district.code = (String) jsonDistrict.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        alldistricts.add(district);
	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return alldistricts;
        
	}

}
