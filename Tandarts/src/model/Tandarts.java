package model;

public class Tandarts {
	private int tandartsnr;
	private String tandartsnaam;
	
	public Tandarts(){
		
	}
	public Tandarts(int Tandartsnr, String tandartsnaam) {
		this. tandartsnr = tandartsnr;
		this.tandartsnaam = tandartsnaam;
	}
	public int getTandartsnr() {
		return tandartsnr;
	}
	public void setTandartsnr(int tandartsnr) {
		this.tandartsnr = tandartsnr;
	}
	public String getTandartsnaam() {
		return tandartsnaam;
	}
	public void setTandartsnaam(String tandartsnaam) {
		this.tandartsnaam = tandartsnaam;
	}
	@Override
	public boolean equals(Object object) {
		if (object instanceof Tandarts){
			Tandarts tandarts = (Tandarts) object;
			if(tandarts.tandartsnr == this.tandartsnr){
			    return true;
			   }
			  }
			  return false;
	}
	@Override
	public int hashCode() {
		return tandartsnr * 37;
	}
	@Override
	public String toString() {
		
		return "De Tandards heeft nummer: " + tandartsnr + "en hij heeft de naam: " + tandartsnaam;
	}
}
