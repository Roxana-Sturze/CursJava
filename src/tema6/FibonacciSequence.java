package tema6;

public class FibonacciSequence {
	
	int val = 9 ;

	int c;
	
	
	public void forExample() {
	
		int a = 0; 
		int b = 1;
		System.out.println(" Seria Fibonacci pentru 9 numere : ");
		System.out.println( a );
		System.out.println( b );
		
		for (int i=2; i < val ; i++) {
			
			c= a+b;
			System.out.println( c );
			a = b;
			b = c;
			
		
		}
	}
	
	public void whileExample() {
		
		int a = 0; 
		int b = 1;
		System.out.println(" Seria Fibonacci pentru 9 numere : ");
		System.out.println( a );
		System.out.println( b );
		
		int i=2; 
		
		while(i < val ) {
			
			c= a+b;
			System.out.println( c );
			a = b;
			b = c;
			i++;
			
		}
	}

}
