package curs3;

import java.util.Scanner;

public class TestScore {
	
	int score; 
	
	public int enterScore() {
		
		System.out.println("Please enter your score: ");
		Scanner scan = new Scanner(System.in);
		score =   scan.nextInt();
		return score;
		
	}
	
	
	public String checkScore(int score) {
		
		if( 0 <= score && score <= 65) {
			
			return "You failed! Try again!";
			
		}else if (score >= 66) {
			
			return "Congratulations, you passed!" ;
			
		} else {
			
			return "Invalid score!";
			
		}
		
	}

}
