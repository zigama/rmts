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
public class RawVillage {
	
public static ArrayList<Village> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<Village> allvillages = new ArrayList<Village>();
        
        JSONParser parser = new JSONParser();
        Village village;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/villages.json"));
            	
		  for (Object o : a)
		  {
			// Because my dump from django is also complex objects
			  //we need to get fields and leave pk and model from django dump 
			JSONObject ob =   (JSONObject) o;
		    JSONObject jsonVillage = (JSONObject) ob.get("fields");
		    
		  //Initialize a village with attributes
		    village = new Village();           

		    village.name = (String) jsonVillage.get("name");
		    village.code = (String) jsonVillage.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        allvillages.add(village);
	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allvillages;
        
	}


}
