package edu.ap.xml;

import java.io.File;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLParser {

	private String INPUT_FILE = "registratie.xml";

	public String getRegistraties() {

		File inputFile = new File(INPUT_FILE);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			String result = "<h2>Registratie</h2>";

			NodeList registraties = doc.getElementsByTagName("registratie");
			
			for (int i = 0; i < registraties.getLength(); i++) {

				Node nNode = registraties.item(i);
				Element eElement = (Element) nNode;
				
				//System.out.print("<br/><b>Datum interventie: </b>" + eElement.getAttribute("datumInterventie"));
				
				result += "<br/><b>datum interventie: </b>" + eElement.getAttribute("datumInterventie");
				result += "<br/><b>Naam patiënt: </b>" + eElement.getAttribute("naamPatient");
				result += "<br/><b>Geboortedatum: </b>" + eElement.getAttribute("geboortedatum");
				result += "<br/><b>Naam verpleegkundige: </b>" + eElement.getAttribute("naamDokter");
				result += "<br/><b>Diagnose: </b>" + eElement.getAttribute("diagnose");

				result += "<br/>";
			}

			return result;

		} catch (Exception e) {
			return e.getMessage();
		}

	}
	
	public String addRegistratie(String xml)
	{
		File inputFile = new File(INPUT_FILE);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
       
        dbFactory.setValidating(false);
        DocumentBuilder dBuilder;
        
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc1 = dBuilder.parse(inputFile);
	        Document doc2 = dBuilder.parse(new InputSource(new StringReader(xml)));
	        Element element = (Element) doc2.getDocumentElement();
	        
	        Node copiedNode = doc1.importNode(element, true);
	  
	        doc1.getDocumentElement().appendChild(copiedNode);
	        
	        
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc1);
			StreamResult result = new StreamResult(new File(INPUT_FILE));
			transformer.transform(source, result);
	        
	        return this.getRegistraties();
		} 
		catch (Exception e) {
			return e.getMessage();
		}
	}	

}
