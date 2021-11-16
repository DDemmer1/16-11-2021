package de.demmer.dennis;


public class Hund {
	
	private String rasse;
	private String name;
	private int alter;
	
	
	public Hund(String rasse, String name) {
		this.rasse = rasse;
		this.name = name;
		this.alter = 1;
	}
	
	public Hund(String rasse, String name, int alter) {
		this.rasse = rasse;
		this.name = name;
		setAlter(alter);
	}
	
	public Hund(int alter) {
		this.rasse = "Generischer Hund";
		this.name = "Wuffi";
		this.alter = alter;
	}
	
	public Hund() {
		
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}
	
	public String getRasse() {
		return rasse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		
		this.alter = alter;
	}
	
	
	public void bellen() {
		switch (rasse) {
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
