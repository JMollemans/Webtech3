package edu.ap.producten;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class ProductResource extends ServerResource{

	@Get("html")
	public String getProduct() {
		
		return null;
		//getattribute --> haalt de url parameter op. --> staat in route
		/*String race_id = getAttribute("product_id");
		XMLParser parser = new XMLParser();
		return parser.getRace(race_id);
		*/
	}
}
