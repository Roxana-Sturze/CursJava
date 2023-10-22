package tema12;

import java.util.Arrays;

public class SortArray {
	
	
	
	public  <T> void sortArray(T [] array) {
		
		Arrays.sort(array);
		
		for(T element: array) {
			System.out.println(element);
		}
		
	}
			
 
}
