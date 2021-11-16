package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {
		
		Hund hund1 = new Hund("Pudel", "Claudio", 5);
		Hund hund2 = new Hund("Dogge","Bello");	
		Hund hund3 = new Hund();
		
		hund1.setAlter(4);
		hund1.bellen();


		hund2.setAlter(5);
		hund2.setRasse("Dogge");
		hund2.bellen();
		
		
		if(hund1.getAlter() >= 5 || hund2.getAlter() >= 5) {
			System.out.println("Mindestens ein Hund ist älter als 5 Jahre");
		} else {
			System.out.println("Die Hunde sind jünger als 5 Jahre");
		}
		
		switch (hund1.getRasse()) {
		case "Pudel":
			System.out.println("...wuff...");
			break;
		case "Dobermann":
			System.out.println("WUFF!!");
			break;
		case "Dogge":
			System.out.println("WUFFFFFF!!!!!");
			break;
		default:
			System.out.println("Wuff");
			break;
		}
		
		
		
		
	}

}
