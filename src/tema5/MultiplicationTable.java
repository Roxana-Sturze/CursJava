package tema5;

import java.util.Scanner;

public class MultiplicationTable {
	
	int number;
	
	public void askTheUserForANumber() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter a number: ");
		number = scan.nextInt();
		scan.close();
	}
	
	public void printMultiplicationTableForANumber() {
		
		askTheUserForANumber();
		
		for (int i= 1; i <=10; i++) {
			
			System.out.println(number + " * " + i + " = " + number*i);
			
		}
		
	}
}
