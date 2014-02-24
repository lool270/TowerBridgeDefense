package model;

import java.util.Date;

public class Afspraak {
	private int afspraaknr;
	private Date afspraakdatum;
	private Patient patient;
	private Tandarts tandarts;
	private	Behandeling behandeling;
	
	
	@Override
		public boolean equals(Object object) {
			if (object instanceof Afspraak){
				Afspraak afspraak = (Afspraak) object;
				if(afspraak.afspraaknr == this.afspraaknr){
				    return true;
				}
			}
			return  false;
	}
	@Override
	public int hashCode() {
		
		return 37 * afspraaknr;
	}
	@Override
	public String toString() {
		
		return "" + afspraaknr + afspraakdatum + patient + tandarts + behandeling;
	}
	
	public int getAfspraaknr() {
		return afspraaknr;
	}
	public void setAfspraaknr(int afspraaknr) {
		this.afspraaknr = afspraaknr;
	}
	public Date getAfspraakdatum() {
		return afspraakdatum;
	}
	public void setAfspraakdatum(Date afspraakdatum) {
		this.afspraakdatum = afspraakdatum;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Tandarts getTandarts() {
		return tandarts;
	}
	public void setTandarts(Tandarts tandarts) {
		this.tandarts = tandarts;
	}
	public Behandeling getBehandeling() {
		return behandeling;
	}
	public void setBehandeling(Behandeling behandeling) {
		this.behandeling = behandeling;
	}
	
	
}
