package curs5;
/*
 * facem un program care cere un text de la tastatura
 * cautam in text daca exista litera A
 * daca o gasim printam ca am gasit litera si de cate ori am gasit-o
 * daca nu o gasim, printam ca nu am gasit
 * 
 * 
 */

import java.util.Scanner;

public class LetterSearch {
	
	String text;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter a text: ");
		text = scan.nextLine();
		//System.out.println(text.length());
		scan.close();
		
	}
	
	public void searchForA() {
		
		//masina --> text.length() = 6
		//012345
		int counter = 0;
		
		for(int i=0; i< text.length(); i++) {
			//text.toLowerCase() --> transform textul in litere mici
			//text.toUpperCase() --> transform textul in CAPS
			if(text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				counter++;
			}
			
		}
		
		if(counter ==0) {
			
			System.out.println("Nu s-a gasit litera a/A in text");
			
		} else {
			
			System.out.println("Litera a/A apare in text de "+ counter + " ori.");
		}
		
		
		String result = (counter==0)? "Nu s-a gasit litera a/A in text" :"Litera a/A apare in text de "+ counter + " ori.";
		System.out.println(result);
	}

}
