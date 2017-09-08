package edu.ap.registratie;

import org.restlet.Component;
import org.restlet.data.Protocol;


public class BolServer {

	public static void main(String[] args) {

		try {
			Component component = new Component();			
			component.getServers().add(Protocol.HTTP, 8087);
			component.getDefaultHost().attach("/registraties", RegistratiesResource.class);
			component.start();
			System.out.println("server started.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
