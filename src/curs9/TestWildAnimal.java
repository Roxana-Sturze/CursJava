package curs9;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		/*
		 * WildAnimal animal = new WildAnimal(); animal.makeSound();
		 * 
		 * System.out.println("--------------------------------");
		 * 
		 * Deer bambi = new Deer(); bambi.makeSound();// metoda suprascrisa
		 * bambi.eatGrass();
		 * 
		 * System.out.println("--------------------------------");
		 * 
		 * Lion simba = new Lion(); simba.makeSound(); simba.eatMeat();
		 */
		
		
		//WedDriver browser = new ChromeDriver();  --> selenium
		//datatype                 constructor

		
		WildAnimal simba = new Lion();
		simba.makeSound();	
		//simba.eatMeat();//The method eatMeat() is undefined for the type WildAnimal
		((Lion) simba).eatMeat(); // Lion simba = new Lion();	
		
		simba = new Deer();
		simba.makeSound();	
		((Deer) simba).eatGrass();
		
	
	
	}

}
