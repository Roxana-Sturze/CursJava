package tema5;

import java.util.Scanner;

public class SumCalculator {
	
	int sum;
	
	public void sumOfTenNumbers() {
	
		int number; 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(" Please enter number " + i +": ");
			number = scan.nextInt();
			
			sum += number;
		}
		
		scan.close();
		
		System.out.println("The sum of the numbers is: " + sum);
	}

}
