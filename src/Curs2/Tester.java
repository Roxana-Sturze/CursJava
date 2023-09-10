package Curs2;

public class Tester {

	
	//variabile
	String nume;
	int varsta; 
	int ratePerHour = 1;
	String seniority;
	
	
	//constructori
	//constructor default
//	public Tester() {}

	public Tester(int salariuPeOra) {
		
		ratePerHour = salariuPeOra;
		
	}
	
	public Tester(int ratePerHour, int varsta, String nume, String seniority) {
		
		this.ratePerHour = ratePerHour;
		this.varsta = varsta;
		this.nume = nume;
		this.seniority = seniority;
	}
	
	//metode
	
}
