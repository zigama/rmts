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
public class RawCell {
	
public static ArrayList<Cell> list() {
		
		//Initialize the List of Countries to be returned
        ArrayList<Cell> allcells = new ArrayList<Cell>();
        
        JSONParser parser = new JSONParser();
        Cell cell;

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/cells.json"));
            	
		  for (Object o : a)
		  {
			// Because my dump from django is also complex objects
			  //we need to get fields and leave pk and model from django dump 
			JSONObject ob =   (JSONObject) o;
		    JSONObject jsonCell = (JSONObject) ob.get("fields");
		    
		  //Initialize a cell with attributes
		    cell = new Cell();           

		    cell.name = (String) jsonCell.get("name");
		    cell.code = (String) jsonCell.get("code");
		    /*
		    map.put("name", name);
	    	map.put("code", code);
	        map.put("language", "");
	        map.put("population", "");
	        map.put("latitude", "");
	        map.put("longitude", "");
	        */
	        
	        allcells.add(cell);
	        

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allcells;
        
	}


}
