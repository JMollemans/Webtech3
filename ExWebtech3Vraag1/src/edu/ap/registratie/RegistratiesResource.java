package edu.ap.registratie;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.xml.XMLParser;

public class RegistratiesResource extends ServerResource{

	

	@Get("html")
	public String getRegistraties()
	{
		XMLParser xmlparser = new XMLParser();
		return xmlparser.getRegistraties();
		
	}
	
	@Post("txt")
	public String addRegistraties(String registratie)
	{
		XMLParser xmlparser = new XMLParser();
		return xmlparser.addRegistratie(registratie);
		
	}
	
}
