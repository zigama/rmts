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
public class RawSector {
	
public static ArrayList<Sector> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<Sector> allsectors = new ArrayList<Sector>();
        
        JSONParser parser = new JSONParser();
        Sector sector;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/sectors.json"));
            	
		  for (Object o : a)
		  {
			// Because my dump from django is also complex objects
			  //we need to get fields and leave pk and model from django dump 
			JSONObject ob =   (JSONObject) o;
		    JSONObject jsonSector = (JSONObject) ob.get("fields");
		    
		  //Initialize a sector with attributes
		    sector = new Sector();           

		    sector.name = (String) jsonSector.get("name");
		    sector.code = (String) jsonSector.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        allsectors.add(sector);	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allsectors;
        
	}


}
