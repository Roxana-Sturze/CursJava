package curs7;

import java.util.Scanner;

public class EsteCaracterulVocala {
	/*
	 * Facem un program care citeste o litera de la tastatura
	 * Verifica daca este consoana sau vocala
	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu o litera: ");
		char litera = scan.next().charAt(0);
		scan.close();
		
		
		//rezolvare cu IF
		
		if (litera == 'a' || litera == 'A' || litera == 'e' || litera == 'E' || litera == 'i' || litera == 'I' || litera == 'o' || litera == 'O' || litera == 'u' || litera == 'U') {
			
			System.out.println("Litera " + litera +" este vocala.");}
		
		else {
			
				System.out.println("Litera " + litera +" este consoana.");
		}
			
		//rezolvare cu switch
		
		switch(litera) {
		
			case 'a': 
			case 'A':
			case 'e': 
			case 'E':
			case 'i': 
			case 'I':
			case 'o': 
			case 'O':
			case 'u': 
			case 'U':
				System.out.println("Litera " + litera +" este vocala.");
				break;
		
			default:
				System.out.println("Litera " + litera +" este consoana.");
		}

	}

}
