package model;

import java.util.Date;

public class Game {
	private int gamenr;
	private Date uitgiftdatum;
	private String titel;
	private Boolean geschiktvoorkinderen;
	
	public Game(){}
	
	public Game (int gamenr,String uitgiftdatum,String titel, 
			Boolean geschiktvoorkinderen){
	}
		public int gamenr(){
			return gamenr;
	}
		public Date uitgiftdatum(){
			return uitgiftdatum;
	}
		public String titel(){
			return titel;
	}
		public Boolean geschiktvoorkinderen(){
			return geschiktvoorkinderen;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Game){
			Game game =(Game) object;
			if(game.gamenr == this.gamenr){
				return true;
			}
		}
		return false;
		}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 37 * this.gamenr;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Het spel heet" + titel + " uitgift datum" + uitgiftdatum + 
				"geschiktvoorkinderen" + geschiktvoorkinderen ;
	}
}
