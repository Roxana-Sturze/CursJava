package curs7;

import java.util.Scanner;

public class SwitchExample2 {

	/*
	 * Facem un program care verifica daca un student este eligibil pt o bursa
	 * Conditiile sunt:
	 * - sa fie anul 3
	 * - sa aiba un punctaj de 80 pt bursa 1
	 * - sa aiba un punctaj de 50 pt bursa 2
	 */
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu anul de studiu: ");
		int an = scan.nextInt();
		System.out.println("Te rog introdu punctajul: ");
		int punctaj = scan.nextInt();
		scan.close();
		
		switch (an) {
			case 1:
			case 2:
				System.out.println("Nu esti eligibil pentru bursa");
				break;
				
			case 3:
				switch (punctaj) {
				
				case 50:
					
					System.out.println("Esti eligibil pentru bursa 2");
					break;
					
				case 80: 
					
					System.out.println("Esti eligibil pentru bursa 1");
					break;
					
				default:
					
					System.out.println("Punctaj invalid.");
					
				}
				break;
				
			default:
				System.out.println("An incorect.");
				
			
		}
	}

}
