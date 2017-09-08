package edu.ap.producten;


import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import jsonParser.jsonParser;


public class MedicijnenResource extends ServerResource {

	
	public String INPUT_FILE = "medicijnen.json";
	
	@Get("html")
	public String getProducten() {
		  
		jsonParser jp = new jsonParser();
		return jp.getProducten();
		
	}
}
