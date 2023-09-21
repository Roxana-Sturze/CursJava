package curs6;

public class BreakContinueExample {

	public static void main(String[] args) {


		for(int i=0; i<10; i++) {
			
			if(i==4) {
				
				//break;
				continue;// reseteaza bucla fara a executa codul de dupa
			}
		
			System.out.println(i);
		}
		

	}

}
