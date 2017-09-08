package edu.ap.student;

public class Medicijn {
	
	private String naam;
	private String vervaldatum;
	private String producent;
	private int hoeveelheid;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVervaldatum() {
		return vervaldatum;
	}
	public void setVervaldatum(String vervaldatum) {
		this.vervaldatum = vervaldatum;
	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	}
	public int getHoeveelheid() {
		return hoeveelheid;
	}
	public void setHoeveelheid(int hoeveelheid) {
		this.hoeveelheid = hoeveelheid;
	}
}
