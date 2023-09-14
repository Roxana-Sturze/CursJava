package curs3;
/*
 * Program care verifica daca un numar este par sau impar.
 * daca numarul este par : printeaza numarul este par
 * daca este impar: printeaza numarul este impar
 * 
 */

import java.util.Scanner;

public class ParSauImpar {
	
	int number;
	
	public void askTheUserForANumber() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
	}
	
	
	public int askTheUserForANumber2() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		return number;
		
	}
	
	public String CheckOddOrEven(int number) {
		
		if(number %2 == 0) {
			
			return "Number is even!";
			
		}else {
			
			return "Number is odd!" ;
			
		}
	}
	
	public String CheckOddOrEven2() {
		
		if(askTheUserForANumber2() %2 == 0) {
			
			return "Number is even!";
			
		}else {
			
			return "Number is odd!" ;
			
		}
	}

}
