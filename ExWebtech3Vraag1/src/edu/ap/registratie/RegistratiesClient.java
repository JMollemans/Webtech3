package edu.ap.registratie;

import org.restlet.resource.ClientResource;

public class RegistratiesClient {

	public static void main(String[] args) {

		try {
			ClientResource clientResource = new ClientResource("http://localhost:8087/registraties");
			String registratie1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
			registratie1 += "<registratie datumInterventie =\"08/09/2017\" naamPatient =\"Jarno Mollemans\" geboortedatum =\"12/12/1995\" naamDokter =\"Eddy Spans\" diagnose=\"Mentale problemen\"></bestelling>";

			//System.out.println(registratie1);
			clientResource.post(registratie1);
			String registratie2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
			registratie1 += "<registratie datumInterventie =\"09/09/2017\" naamPatient =\"Arno Mollemans\" geboortedatum =\"13/12/1995\" naamDokter =\"Teddy Spans\" diagnose=\"Ernstige mentale problemen\"></bestelling>";
			clientResource.post(registratie2);
			System.out.println(clientResource.getResponseEntity().getText());

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
