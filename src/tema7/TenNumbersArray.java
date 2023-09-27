package tema7;

import java.util.Scanner;

public class TenNumbersArray {
	
	int[] numbers = new int[10];
	Scanner scan = new Scanner(System.in);
	int sum;
	
	
	public void tenNumbersSum(){
		
		System.out.println("Introdu 10 numere: ");
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i]= scan.nextInt();
			sum+= numbers[i];
		
		}
		
		System.out.println("Suma numerelor din array este: " + sum);
	}
	
	
}
