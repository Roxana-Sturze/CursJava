package tema4;

import java.util.Scanner;

public class BillDiscount {
	
	double value;

	public void enterBillValue() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter bill value: ");
		value =   scan.nextDouble();	
		scan.close();
	}
	
	public void applyDiscount() {
		
		enterBillValue();
		
		double finalValue;
		
		/*
		 * if (value >100) {
		 * 
		 * finalValue = value - (0.10 * value);
		 * 
		 * }else {
		 * 
		 * finalValue = value - (0.05 * value); }
		 */
		
		
		finalValue = (value > 100)? (finalValue = (value - 0.10 * value)) : (finalValue = (value - 0.05 * value));
		System.out.println("The final value of the bill is: " + finalValue);
		
	}
}
