package model;

public class Behandeling {
	private int behandelingsnr;
	private String behandelingsoms;
	
	public Behandeling(){
		
	}
	public Behandeling(int behandelingsnr, String behandelingsoms){
		this.behandelingsnr = behandelingsnr;
		this.behandelingsoms = behandelingsoms;
	}
	public int getBehandelingsnr() {
		return behandelingsnr;
	}
	public void setBehandelingsnr(int behandelingsnr) {
		this.behandelingsnr = behandelingsnr;
	}
	public String getBehandelingsoms() {
		return behandelingsoms;
	}
	public void setBehandelingsoms(String behandelingsoms) {
		this.behandelingsoms = behandelingsoms;
	}
	@Override
	public boolean equals(Object object) {
			if (object instanceof Behandeling){
				Behandeling behandeling = (Behandeling) object;
				if(behandeling.behandelingsnr == this.behandelingsnr){
				    return true;
				   }
				  }
				  return false;
	}
	@Override
	public int hashCode() {
		return 37 * behandelingsnr;
	}
	@Override
	public String toString() {
		
		return "behandelingsnr: " + behandelingsnr + "behandelingsosm" + behandelingsoms;
	}
	

}
