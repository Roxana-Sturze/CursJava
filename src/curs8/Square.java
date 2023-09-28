package curs8;

public class Square extends Shape {

	public Square(String nume, String culoare) {
		super(nume, culoare);
		
	}
	
	String nume= "Patrat";
	String culoare = "Galben";
	public void printDetails() {
		System.out.println("Numele este " + super.nume + " si culoarea este "+ super.culoare);
	}
	

}
