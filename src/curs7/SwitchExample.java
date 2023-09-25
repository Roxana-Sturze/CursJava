package curs7;

import java.util.Scanner;

public class SwitchExample {
	/*
	 * Intrebam userul un caificativ
	 * In functie de calificativ printam:
	 * A --> felicitari
	 * B --> Destul de bine
	 * C --> Suficient
	 * D --> insuficient
	 * Daca introduce orice altceva ii spunem Nota invalida
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un calificativ: ");
		String calificativ = scan.next();
		scan.close();
		
		switch(calificativ.toUpperCase()) {
		
		case "A": 
			System.out.println("Felicitari");
			break;
			
		case "B":
			System.out.println("Destul de bine");
			break;
			
		case "C": 
			System.out.println("Suficient");
			break;
			
		case "D":
			System.out.println("Insuficient");
			break;
			
		default:
			System.out.println("Nota inalida");
		
		
		}
		
		

	}

}
