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
public class RawProvince {
	
	public static ArrayList<Province> list() {
			
			//Initialize the List of Provinces to be returned
	        ArrayList<Province> allprovinces = new ArrayList<Province>();
	        
	        JSONParser parser = new JSONParser();
	        Province province;
	
	        try {     
	            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/provinces.json"));
	            	
			  for (Object o : a)
			  {
				 // Because my dump from django is also complex objects
				  //we need to get fields and leave pk and model from django dump 
				JSONObject ob =   (JSONObject) o;
			    JSONObject jsonProvince = (JSONObject) ob.get("fields");
			    
			  //Initialize a province with attributes
			    province = new Province();           
	
			    province.name = (String) jsonProvince.get("name");
			    province.code = (String) jsonProvince.get("code");
			    /*
			    map.put("name", name);
		    	map.put("code", code);
		        map.put("language", "");
		        map.put("population", "");
		        map.put("latitude", "");
		        map.put("longitude", "");
		        */
		        
		        allprovinces.add(province);
		        
	
			}
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        
	        return allprovinces;
	        
		}

}
