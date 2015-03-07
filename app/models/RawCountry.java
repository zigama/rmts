/**
 * 
 */
package models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * @author zigama
 *
 */
public class RawCountry {
	
	public static ArrayList<Country> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<Country> allcountries = new ArrayList<Country>();
        
        JSONParser parser = new JSONParser();
        Country country;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/countries.json"));
            	
		  for (Object o : a)
		  {
		    JSONObject jsonCountry = (JSONObject) o;
		    
		  //Initialize a country with attributes
		    country = new Country();           

		    country.name = (String) jsonCountry.get("name");
		    country.code = (String) jsonCountry.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        allcountries.add(country);
	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allcountries;
        
	}

}
