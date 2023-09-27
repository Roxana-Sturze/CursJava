package tema7;

public class VowelsCount {
	
	
	
	public void countVowels() {
		String text = "Eu invat Java";
		System.out.println(text);
		int counter = 0;
		
		for(int i=0; i< text.length(); i++) {
			
			char letter = text.charAt(i);
			
			switch(letter) {
				case 'a': 
				case 'A':
				case 'e': 
				case 'E':
				case 'i': 
				case 'I':
				case 'o': 
				case 'O':
				case 'u': 
				case 'U':
					counter++;
					break;
			}
		}
		
		System.out.println("Vocale: " + counter);
		
	}

}
