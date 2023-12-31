package curs4;

import java.util.Scanner;

/*
 * Citim doua numere de la tastatura
 * verificam fiecare numar daca este pozitiv sau negativ
 * verificam daca ambele numere sunt pozitive
 * verificam care dintre cele 2 numere este cel mai mic, tinand cont ca ar putea fi egale
 * Printam : Este pozitiv sau este negativ
 */



public class ConditionalOperator {

	int num1, num2;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		num1 =   scan.nextInt();
		System.out.println("Please enter second number: ");
		num2 = scan.nextInt();
			
		scan.close();
	}
	
	
	public void verifyTheNumbers() {
		
		if (num1 > 0) {
			System.out.println("Este pozitiv!");
		}else {
			System.out.println("Este negativ!");
		}
		
		String result = (num1 > 0 )? "Este pozitiv!" : "Este negativ!";
		System.out.println(result);
		
		// verific num2
	
		result = (num2 > 0 )? "Este pozitiv!" : "Este negativ!";
		System.out.println(result);
		
		//verific daca ambele sunt pozitive sau negative
		result = (num1 > 0 && num2 > 0)? "Numbers are positive" : "Numbers are negative";
		System.out.println(result);
		
		// verific care este mai mare (ar putea fi egale)
		result = (num1 > num2)? "Num1 is the greatest" : (num2 > num1)? "Num2 is the greatest" : "Numbers are equal";
		System.out.println(result);
	}
}
