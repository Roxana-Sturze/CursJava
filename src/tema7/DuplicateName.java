package tema7;

public class DuplicateName {
	
	public void checkForDuplicates() {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for(int i = 0; i < myStringArray.length-1; i++) {
			
			for(int j = i+1; j < myStringArray.length; j++) {
				
				if(myStringArray[i].equals(myStringArray[j])) {
					
					System.out.println("Nume duplicat " + myStringArray[i]);
					break;
				}
				
			}
			
		}
		
	}

}
