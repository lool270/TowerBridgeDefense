import model.Klant;


public class Video {

	public static void main(String[]args){
		Klant k1= new Klant(1,"Jansen");
		Klant k2= new Klant(2,"Peters");
		Klant k3= new Klant(3,"Jansen");
		Klant k4= k1;
		
		System.out.println("k1 hashcode:" +k1.hashCode());
		System.out.println("k1 hashcode systeem:" +System.identityHashCode(k1));
		System.out.println("k2 hashcode:" +k2.hashCode());
		System.out.println("k2 hashcode systeem:" +System.identityHashCode(k2));
		System.out.println("k3 hashcode:" +k3.hashCode());
		System.out.println("k3 hashcode systeem:" +System.identityHashCode(k3));
		System.out.println("k4 hashcode:" +k4.hashCode());
		System.out.println("k4 hashcode systeem:" +System.identityHashCode(k4));
		
		if(k1 == k2){
			System.out.println("k1 == k2");
		}
		else {
			System.out.println("k1 != k2");
		}
	
	if(k1 == k3){
		System.out.println("k1 == k3");
	}
	else {
		System.out.println("k1 != k3");
	}
	if(k1 == k4){
		System.out.println("k1 == k3");
	}
	else {
		System.out.println("k1 != k4");
	}
	k1.setAchternaam("Ali");
	System.out.println("achternaam van k4" +k4.getAchternaam());
	System.out.println(k1);
	if (k1.equals(k3)){
		System.out.println("1 is 3");
	}
}
}
