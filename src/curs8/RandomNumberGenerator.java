package curs8;

import java.util.Arrays;
import java.util.Random;

/*
 * Facem un program care genereaza 6 numere random intre 0 si 9
 * numerele le va tine intr-un array
 * nu tine numere duplicate
 * printeaza array-ul
 * 
 * 
 * 
 * o metoda care genereaza si pune in array
 * o metoda pentru duplicate
 * o metoda pt print
 * 
 * 
 * 
 */

public class RandomNumberGenerator {
	
	
	public final int LENGTH = 6;
	final int MAX_NUMBERS = 9;
	int[] numbers = new int[LENGTH];
	
	public void generateNumbers() {
		
		Random random = new Random();
		
		for(int i = 0 ; i < LENGTH; i++) {
			
			//numbers[i] = random.nextInt(MAX_NUMBERS);
			//System.out.println(numbers[i]);
			//System.out.println(Arrays.toString(numbers));
			int randomNr = 0; 
			
			do {
				
				randomNr = random.nextInt(MAX_NUMBERS);
				
				
			}while(checkDuplicateNumber(numbers, randomNr));
			
			
			numbers[i] = randomNr;
			
			
			
		}
		
	}
	
	public boolean checkDuplicateNumber(int[] array, int nr) {
		
		for(int number: array) {
			
			if(number == nr) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
	public void printArray() {
		
		for(int number: numbers) {
			
			System.out.print(number + " | ");
			
		}
	}

}
