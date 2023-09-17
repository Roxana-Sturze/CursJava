package tema4;

import java.util.Scanner;

public class GradeCalculator {

	int score;

	public void enterScore() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		score =   scan.nextInt();	
		scan.close();
	}
	
	public void calculateGrade() {
		
		enterScore();
		String grade;
		
		/*
		 * if (score >= 90) {
		 * 
		 * grade = "FB";
		 * 
		 * }else if(score >= 80){
		 * 
		 * grade = "B";
		 * 
		 * }else {
		 * 
		 * grade = "S"; }
		 * 
		 * if (grade.equals("FB")) { System.out.println("You got: FoarteBine"); }else
		 * if(grade.endsWith("B")) { System.out.println("You got: Bine"); } else {
		 * System.out.println("You got: Suficient"); }
		 */
		
		
		grade = (score>=90)? "FoarteBine" : (score >=80)? "Bine": "Suficient";
		System.out.println("You got: " + grade);
		
		
	}
}
