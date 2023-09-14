package curs3;

import java.util.Scanner;

public class AgeEvaluator {

	int age; 
	
	public int enterAge() {
		
		System.out.println("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		age =   scan.nextInt();
		scan.close();
		return age;
		
	}
	
	
	public String checkAge(int age) {
		
		if (age < 0 ){
			
			return "Please enter a valid age!";
			
		}else if( age < 18) {
			
			return "You're underage!";
			
		}else if (age <= 65 ) {
			
			return "You're an adult!" ;
			
		} else {
			
			return "You're old!";
			
		
		}
	}
}