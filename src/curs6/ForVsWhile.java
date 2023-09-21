package curs6;

import java.util.Scanner;

public class ForVsWhile {

	/*
	 * facem un program care ii cere userului numere incontinuu
	 * le inmulteste cu 10
	 * face asta pana userul introduce 0
	 * Daca a introdus 0 facem exit din loop
	 */
			
	public static void main(String[] args) {
		
		//rezolvareCuFor();
		rezolvareCuWhile();
		
		


	}
	
	public static void rezolvareCuFor() {
		
		int nr;
		
		Scanner scan = new Scanner(System.in);
		
		for( ; ; ) {
			
			System.out.println("Please enter a number: ");
			nr= scan.nextInt();
			
			if (nr==0) {
				
				break;
				
			}else {
				
				System.out.println(nr * 10);
			}
		}
	}
	
	public static void rezolvareCuWhile() {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int nr= scan.nextInt();
		
		while (nr !=0 ) {
			
			System.out.println(nr*10);
			System.out.println("Please enter a number: ");
			nr= scan.nextInt();
			
			
		}
	}

}
