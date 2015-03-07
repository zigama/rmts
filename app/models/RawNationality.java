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
import java.util.ArrayList;
import java.util.List;

/**
 * @author zigama
 *
 */
public class RawNationality {
	

	public static List list() {
		
		//Initialize the List of Countries to be returned
        List allnationalities = new ArrayList<String>() ;
        
        JSONParser parser = new JSONParser();

        try {     
            	JSONArray a = (JSONArray) parser.parse(new FileReader("conf/nationalities.json"));
            	
		  for (Object o : a)
		  {
		    allnationalities.add(o.toString());  

		}
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return allnationalities;
        
	}

}
