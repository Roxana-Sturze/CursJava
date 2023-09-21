package tema4;


public class CommissionCalculator {
	
	public int commission = 0;
	public int sales = 3500;
	
	public void calculateCommission() {
		
		if (sales  > 2500) {
		  
		commission = sales * 5/100;
		  
		}
		
		System.out.println(" Your commission is: " + commission);
		
	}
}
