package curs4;

public class TernaryOperator {

	public static void main(String[] args) {


		// ? : --> operator ternar
		
		int a = 60;
		int b = 130; 
		
		//varianta 1
		int x = (a > b)? a : b;
		
		//varianta 2
		if(a > b) {
			
			x = a;
		
		}else {
			
			x = b;
		}
	}

}
