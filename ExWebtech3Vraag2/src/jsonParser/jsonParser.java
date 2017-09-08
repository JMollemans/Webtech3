package jsonParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.*;

public class jsonParser {

	private String INPUT_FILE = "producten.json";
	
	public String getProducten() {
		
		String jsonData = readFile("C:\\Users\\Jasper\\eclipse-workspace\\Examen Webtech 3 - oef 2 JSON\\producten.json");
	    JSONObject jobj = new JSONObject(jsonData);
	    System.out.println("");
	    //JSONArray jarr = new JSONArray(jobj.getJSONArray("keywords").toString());
	   
	    String outputString = "";
	    //System.out.println("Name: " + jobj.getString("name"));
	    System.out.print(jobj.toString());
	    jobj.put("operation", "selectAll");
	    outputString = jobj.toString();
	
	    /*
	    outputString += "Name: " + jobj.getString("naam");
	    outputString += "Producent: " + jobj.getString("producent");
	    outputString += "Prijs: " + jobj.getString("prijs");
	    
	    for(int i = 0; i < jarr.length(); i++) {
	    	outputString += jarr.getString(i);
	        System.out.println("Keyword: " + jarr.getString(i));
	    }
	    */
		return outputString;
    }
 
 
    public static String readFile(String filename) {
 
    	
    	String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	
}
